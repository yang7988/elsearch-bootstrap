package com.bluedon.elsearch.domain;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "tmoniflowindex",type = "tmoniflow")
public class TMoniFlow implements java.io.Serializable {

	// Fields

	private String id;
	private String srcip;
	private String dstip;
	private Long srcport;
	private Long dstport;
	private String proto;
	private String srcmac;
	private String dstmac;
	private String srccountry;
	private String srccity;
	private String dstcountry;
	private String dstcity;
	private String visitarea;
	private String urlpage;
	private String urltype;
	private String httpreqtype;
	private String httprsptype;
	private String reqfile;
	private String reqparam;
	private String pubcontent;
	private String server;
	private Long cookie;
	private String lenth;
	private String proxyip;
	
	private String netLog;
	private String AppProto;
	private String Date;
	private String SrcMac;
	private String SrcIP;
	private String SrcPort;
	private String DstMac;
	private String DstIP;
	private String DstPort;
	private String SendID;
	private String RecvID;
	private String Action;
	private String Type;
	private String Host;
	private String Uri;
	private String Method;
	private String Title;
	

	// Constructors

	/** default constructor */
	public TMoniFlow() {
	}

	// Property accessors
	public TMoniFlow(String id, String srcip, String dstip, Long srcport, Long dstport, String proto, String srcmac,
			String dstmac, String srccountry, String srccity, String dstcountry, String dstcity, String visitarea,
			String urlpage, String urltype, String httpreqtype, String httprsptype, String reqfile, String reqparam,
			String pubcontent, String server, Long cookie, String lenth, String proxyip, String netLog, String appProto,
			String date, String srcMac2, String srcIP2, String srcPort2, String dstMac2, String dstIP2, String dstPort2,
			String sendID, String recvID, String action, String type, String host, String uri, String method,
			String title) {
		super();
		this.id = id;
		this.srcip = srcip;
		this.dstip = dstip;
		this.srcport = srcport;
		this.dstport = dstport;
		this.proto = proto;
		this.srcmac = srcmac;
		this.dstmac = dstmac;
		this.srccountry = srccountry;
		this.srccity = srccity;
		this.dstcountry = dstcountry;
		this.dstcity = dstcity;
		this.visitarea = visitarea;
		this.urlpage = urlpage;
		this.urltype = urltype;
		this.httpreqtype = httpreqtype;
		this.httprsptype = httprsptype;
		this.reqfile = reqfile;
		this.reqparam = reqparam;
		this.pubcontent = pubcontent;
		this.server = server;
		this.cookie = cookie;
		this.lenth = lenth;
		this.proxyip = proxyip;
		this.netLog = netLog;
		AppProto = appProto;
		Date = date;
		SrcMac = srcMac2;
		SrcIP = srcIP2;
		SrcPort = srcPort2;
		DstMac = dstMac2;
		DstIP = dstIP2;
		DstPort = dstPort2;
		SendID = sendID;
		RecvID = recvID;
		Action = action;
		Type = type;
		Host = host;
		Uri = uri;
		Method = method;
		Title = title;
	}



	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSrcip() {
		return this.srcip;
	}

	public void setSrcip(String srcip) {
		this.srcip = srcip;
	}

	public String getDstip() {
		return this.dstip;
	}

	public void setDstip(String dstip) {
		this.dstip = dstip;
	}

	public Long getSrcport() {
		return this.srcport;
	}

	public void setSrcport(Long srcport) {
		this.srcport = srcport;
	}

	public Long getDstport() {
		return this.dstport;
	}

	public void setDstport(Long dstport) {
		this.dstport = dstport;
	}

	public String getProto() {
		return this.proto;
	}

	public void setProto(String proto) {
		this.proto = proto;
	}

	public String getSrcmac() {
		return this.srcmac;
	}

	public void setSrcmac(String srcmac) {
		this.srcmac = srcmac;
	}

	public String getDstmac() {
		return this.dstmac;
	}

	public void setDstmac(String dstmac) {
		this.dstmac = dstmac;
	}

	public String getSrccountry() {
		return this.srccountry;
	}

	public void setSrccountry(String srccountry) {
		this.srccountry = srccountry;
	}

	public String getSrccity() {
		return this.srccity;
	}

	public void setSrccity(String srccity) {
		this.srccity = srccity;
	}

	public String getDstcountry() {
		return this.dstcountry;
	}

	public void setDstcountry(String dstcountry) {
		this.dstcountry = dstcountry;
	}

	public String getDstcity() {
		return this.dstcity;
	}

	public void setDstcity(String dstcity) {
		this.dstcity = dstcity;
	}

	public String getVisitarea() {
		return this.visitarea;
	}

	public void setVisitarea(String visitarea) {
		this.visitarea = visitarea;
	}

	public String getUrlpage() {
		return this.urlpage;
	}

	public void setUrlpage(String urlpage) {
		this.urlpage = urlpage;
	}

	public String getUrltype() {
		return this.urltype;
	}

	public void setUrltype(String urltype) {
		this.urltype = urltype;
	}

	public String getHttpreqtype() {
		return this.httpreqtype;
	}

	public void setHttpreqtype(String httpreqtype) {
		this.httpreqtype = httpreqtype;
	}

	public String getHttprsptype() {
		return this.httprsptype;
	}

	public void setHttprsptype(String httprsptype) {
		this.httprsptype = httprsptype;
	}

	public String getReqfile() {
		return this.reqfile;
	}

	public void setReqfile(String reqfile) {
		this.reqfile = reqfile;
	}

	public String getReqparam() {
		return this.reqparam;
	}

	public void setReqparam(String reqparam) {
		this.reqparam = reqparam;
	}

	public String getPubcontent() {
		return this.pubcontent;
	}

	public void setPubcontent(String pubcontent) {
		this.pubcontent = pubcontent;
	}

	public String getServer() {
		return this.server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public Long getCookie() {
		return this.cookie;
	}

	public void setCookie(Long cookie) {
		this.cookie = cookie;
	}

	public String getLenth() {
		return this.lenth;
	}

	public void setLenth(String lenth) {
		this.lenth = lenth;
	}

	public String getProxyip() {
		return this.proxyip;
	}

	public void setProxyip(String proxyip) {
		this.proxyip = proxyip;
	}

	public String getNetLog() {
		return netLog;
	}

	public void setNetLog(String netLog) {
		this.netLog = netLog;
	}

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

	public String getSrcMac() {
		return SrcMac;
	}

	public void setSrcMac(String srcMac) {
		SrcMac = srcMac;
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

	public String getDstMac() {
		return DstMac;
	}

	public void setDstMac(String dstMac) {
		DstMac = dstMac;
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

	public String getSendID() {
		return SendID;
	}

	public void setSendID(String sendID) {
		SendID = sendID;
	}

	public String getRecvID() {
		return RecvID;
	}

	public void setRecvID(String recvID) {
		RecvID = recvID;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
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

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	
	

}