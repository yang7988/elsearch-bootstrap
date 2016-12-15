package com.bluedon.elsearch;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.net.InetAddress;

@SpringBootApplication
public class ElsearchBootApplication {

    @Bean
    public Client client() throws Exception {
        Settings settings = Settings.settingsBuilder().put("cluster.name", "xyy-elsearch").build();
        Client client = TransportClient.builder()
                .settings(settings)
                .build()
                .addTransportAddresses(new InetSocketTransportAddress(InetAddress.getByName("192.168.61.129"), 9300));
//                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.61.129"), 9300));
        return client;
    }

    @Bean
    public ElasticsearchTemplate template() throws Exception {
        ElasticsearchTemplate elasticsearchTemplate = new ElasticsearchTemplate(client());
        return elasticsearchTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(ElsearchBootApplication.class, args);
    }
}
