package com.crady.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="system.params")
@PropertySource("classpath:system-params.properties")
public class SystemParams {

	private String name;
	private String url;
	private String port;
	
	public SystemParams() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	@Override
	public String toString() {
		return "name=" + this.name + ",url=" + this.url + ",port=" + this.port;
	}
	
}
