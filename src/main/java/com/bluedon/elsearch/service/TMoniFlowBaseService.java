package com.bluedon.elsearch.service;

import com.bluedon.elsearch.constant.Data;
import com.bluedon.elsearch.util.GsonUtil;
import com.google.gson.internal.LinkedTreeMap;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.SearchHit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/19.
 */
public class TMoniFlowBaseService {
    protected Map<String, Object> resolveIndexResponse(IndexResponse indexResponse) {
        return new HashMap<String, Object>() {
            {
                put("id", indexResponse.getId());
                put("index", indexResponse.getIndex());
                put("type", indexResponse.getType());
                put("version", indexResponse.getVersion());
            }
        };
    }

    /**
     * 封装搜索返回结果报文
     *
     * @param searchResponse
     * @return
     */
    protected Map<String, Object> resolveSearchResult(SearchResponse searchResponse) {
        SearchHit[] hits = searchResponse.getHits().getHits();
        Map<String, Object> results = null;
        if (hits.length > 0) {
            results = new HashMap<>();
            for (SearchHit hit : hits) {
                Map<String, Object> result = hit.getSource();
                results.putAll(result);
            }
            return results;
        }
        return null;
    }

    /**
     * 封装elastic搜索请求头信息
     *
     * @return
     */
    protected SearchRequestBuilder extractSearchHead(TransportClient transportClient, String requestParams) {
        Map<String, Object> params = GsonUtil.fromJson(requestParams, Map.class);
        List<String> indexName = (List<String>) params.get("indexName");
        List<String> types = (List<String>) params.get("type");
        LinkedTreeMap<String, Object> conditionMap = (LinkedTreeMap) params.get("condition");
        String[] index_array = indexName == null || indexName.size() == 0 ? Data.INDEX_ARRAY : indexName.toArray(new String[indexName.size()]);
        String[] type_array = types == null || types.size() == 0 ? Data.TYPE_ARRAY : types.toArray(new String[types.size()]);
        SearchRequestBuilder searchRequestBuilder = transportClient.prepareSearch(index_array).setTypes(type_array).setSearchType(SearchType.DEFAULT);
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        Iterator<Map.Entry<String, Object>> it = conditionMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            boolQueryBuilder.must(new QueryStringQueryBuilder((String) entry.getValue()).field(entry.getKey()));
        }
        searchRequestBuilder.setQuery(boolQueryBuilder);
        return searchRequestBuilder;
    }
}
