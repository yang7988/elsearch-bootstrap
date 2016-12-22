package com.bluedon.elsearch;

import com.bluedon.elsearch.config.ElasticConfig;
import com.bluedon.elsearch.interceptor.ParamsValidateInterceptor;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.net.InetAddress;

@SpringBootApplication
public class ElsearchBootApplication extends WebMvcConfigurerAdapter{
    @Autowired
    private ElasticConfig elasticConfig;

    @Bean
    public TransportClient client() throws Exception {
        String[] nodes = elasticConfig.clusterNode.split(",");
        Settings settings = Settings.settingsBuilder().put("cluster.name", elasticConfig.clusterName).build();
        TransportClient client = TransportClient.builder().settings(settings).build();
        for(String node:nodes){
            String[] eachnode = node.split(":");
            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(eachnode[0]),Integer.valueOf(eachnode[1])));
        }
        return client;
    }

    @Bean
    public ElasticsearchTemplate elasticsearchTemplate() throws Exception {
        ElasticsearchTemplate elasticsearchTemplate = new ElasticsearchTemplate(client());
        return elasticsearchTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(ElsearchBootApplication.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ParamsValidateInterceptor()).addPathPatterns("/elastic/**");
    }
}
