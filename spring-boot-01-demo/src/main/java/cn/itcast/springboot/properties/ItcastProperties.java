package cn.itcast.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="cn.itcast",ignoreUnknownFields=true)
public class ItcastProperties {
	
	private String url;
	private String name;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ItcastProperties [url=" + url + ", name=" + name + "]";
	}
	
	

}
