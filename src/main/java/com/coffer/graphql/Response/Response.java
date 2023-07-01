package com.coffer.graphql.Response;

public class Response {
	
	public String country;
	
	private String region;
	private String topic;
	public String city;
	
	
	
	
	public Response(String country, String region, String topic, String city) {
		super();
		this.country = country;
		this.region = region;
		this.topic = topic;
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	
	
	

	

}
