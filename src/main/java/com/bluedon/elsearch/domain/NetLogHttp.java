package com.bluedon.elsearch.domain;


import com.sun.jndi.toolkit.url.Uri;
import org.apache.catalina.Host;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Created by Administrator on 2016/12/16.
 */
@Document(indexName = "netlog_http",type = "netlog_http")
public class NetLogHttp {
    @Field(type = FieldType.String)
    private String AppProto;
    @Field(type = FieldType.String)
    private String Date;
    @Field(type = FieldType.String)
    private String Type;
    @Field(type = FieldType.String)
    private String SrcIP;
    @Field(type = FieldType.String)
    private String SrcPort;
    @Field(type = FieldType.String)
    private String SrcMac;
    @Field(type = FieldType.String)
    private String DstIP;
    @Field(type = FieldType.String)
    private String DstPort;
    @Field(type = FieldType.String)
    private String DstMac;
    @Field(type = FieldType.String)
    private String Host;
    @Field(type = FieldType.String)
    private String Uri;
    @Field(type = FieldType.String)
    private String Method;
    @Field(type = FieldType.String)
    private String UriTitle;

    public String getAppProto() {
        return AppProto;
    }

    public void setAppProto(String appProto) {
        AppProto = appProto;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSrcIP() {
        return SrcIP;
    }

    public void setSrcIP(String srcIP) {
        SrcIP = srcIP;
    }

    public String getSrcPort() {
        return SrcPort;
    }

    public void setSrcPort(String srcPort) {
        SrcPort = srcPort;
    }

    public String getSrcMac() {
        return SrcMac;
    }

    public void setSrcMac(String srcMac) {
        SrcMac = srcMac;
    }

    public String getDstIP() {
        return DstIP;
    }

    public void setDstIP(String dstIP) {
        DstIP = dstIP;
    }

    public String getDstPort() {
        return DstPort;
    }

    public void setDstPort(String dstPort) {
        DstPort = dstPort;
    }

    public String getDstMac() {
        return DstMac;
    }

    public void setDstMac(String dstMac) {
        DstMac = dstMac;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getUri() {
        return Uri;
    }

    public void setUri(String uri) {
        Uri = uri;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public String getUriTitle() {
        return UriTitle;
    }

    public void setUriTitle(String uriTitle) {
        UriTitle = uriTitle;
    }
}
