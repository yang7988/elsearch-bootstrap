package com.bluedon.elsearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/15.
 */
@Service
public class ElasticService {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    public Object createIndex(){
        return null;
    }
}
