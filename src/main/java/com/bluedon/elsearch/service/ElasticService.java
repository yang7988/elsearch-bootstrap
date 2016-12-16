package com.bluedon.elsearch.service;

import com.bluedon.elsearch.constant.ExceptionDefinition;
import com.bluedon.elsearch.constant.Response;
import com.bluedon.elsearch.domain.NetLogHttp;
import com.bluedon.elsearch.exception.ElasicException;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/12/15.
 */
@Service
public class ElasticService {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private TransportClient transportClient;

    public Object createIndex(String requestParams){
        Response response = new Response();
        try{
            String indexName = requestParams.substring(0,requestParams.indexOf(" "));
            String documentJson = requestParams.substring(requestParams.indexOf("{"));
            IndexResponse indexResponse = transportClient.prepareIndex(indexName,indexName) .setSource(documentJson) .execute().actionGet();
            response.setExCode(ExceptionDefinition.SUCCESS_CODE);
            response.setExMsg(ExceptionDefinition.SUCCESS_MSG);
            response.setData(new HashMap<String,Object>(){
                {
                    put("id",indexResponse.getId());
                    put("index",indexResponse.getIndex());
                    put("type",indexResponse.getType());
                    put("version",indexResponse.getVersion());
                }
            });
            return response;
        }catch(Exception e){
            e.printStackTrace();
            throw new ElasicException(ExceptionDefinition.CRTINDEX_EX,ExceptionDefinition.CRTINDEX_EXMSG);
        }
    }
}
