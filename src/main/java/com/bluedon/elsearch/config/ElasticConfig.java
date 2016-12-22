package com.bluedon.elsearch.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 徐洋洋 on 2016/12/20.
 */
@Configuration
@ConfigurationProperties(prefix = "spring.data.elasticsearch")
public class ElasticConfig {
    @Value("${spring.data.elasticsearch.cluster-name}")
    public String clusterName;
    @Value("${spring.data.elasticsearch.cluster-nodes}")
    public String clusterNode;
}
