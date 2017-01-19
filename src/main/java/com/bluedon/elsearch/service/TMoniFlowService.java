package com.bluedon.elsearch.service;

import com.bluedon.elsearch.constant.Data;
import com.bluedon.elsearch.constant.ExceptionDefinition;
import com.bluedon.elsearch.constant.Response;
import com.bluedon.elsearch.exception.ElasicException;
import com.bluedon.elsearch.util.GsonUtil;
import org.apache.log4j.Logger;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by 徐洋洋 on 2016/12/15.
 */
@Service
public class TMoniFlowService extends TMoniFlowBaseService {
    private static Logger logger = Logger.getLogger(TMoniFlowService.class);
    @Autowired
    private TransportClient transportClient;

    public Object createIndex(String requestParams) {
        Response response = new Response();
        try {
            String indexName = requestParams.substring(0,requestParams.indexOf(" "));
            String documentJson = requestParams.substring(requestParams.indexOf("{"));
            IndexResponse indexResponse = transportClient.prepareIndex(Data.TMONIFLOW_INDEX, indexName)
                    .setSource(documentJson).execute().actionGet();
            response.setExCode(ExceptionDefinition.SUCCESS_CODE);
            response.setExMsg(ExceptionDefinition.SUCCESS_MSG);
            response.setData(resolveIndexResponse(indexResponse));
            logger.info(String.format("索引被创建:%s", GsonUtil.toJson(response)));
            return response;
        } catch (Exception e) {
            logger.error("创建索引异常:",e);
            throw new ElasicException(ExceptionDefinition.CRTINDEX_EX, ExceptionDefinition.CRTINDEX_EXMSG);
        }
    }

    /**
     * elasticsearch全文检索
     *
     * @param requestParams
     * @return
     */
    public Object searchIndex(String requestParams) {
        Response response = new Response();
        try {
            SearchRequestBuilder searchRequestBuilder = extractSearchHead(transportClient, requestParams);
            SearchResponse searchResponse = searchRequestBuilder.execute().actionGet();
            response.setExCode(ExceptionDefinition.SUCCESS_CODE);
            response.setExMsg(ExceptionDefinition.SUCCESS_MSG);
            response.setData(resolveSearchResult(searchResponse));
            logger.info(String.format("检索数据:%s",GsonUtil.toJson(response)));
            return response;
        } catch (Exception e) {
            logger.error("检索失败:",e);
            throw new ElasicException(ExceptionDefinition.SEARCH_EX, ExceptionDefinition.SEARCH_EXMSG);
        }
    }
}
