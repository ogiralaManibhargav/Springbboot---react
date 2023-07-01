package com.coffer.graphql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data")
public class Visualistation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="end_year")
	private int endYear;
	@Column(name="citylng")
	private String cityLongitude;
	
	@Column(name="citylat")
	private String cityLatitude;
	
	@Column(name="intensity")
	private int intensity;
	
	@Column(name="sector")
	private String sector;
	

	@Column(name="topic")
	private String topic;
	
	@Column(name="insight")
	private String inSight;
	
	@Column(name="swot")
	private String swot;
	
	@Column(name="url")
	private String url;
	
	@Column(name="region")
	private String region;
	
	@Column(name="start_year")
	private String start_year;
	@Column(name="impact")
	private String impact;
	@Column(name="added")
	public String added;
	
	@Column(name="published")
	public String published;
	
	@Column(name="city")
	public String city;
	
	@Column(name="country")
	public String country;
	
	@Column(name="relevance")
	public int relevance;
	
	@Column(name="pestle")
	public String pestle;
	
	
	@Column(name="source")
	public String source;
	
	
	@Column(name="title")
	public String title;
	
	
	@Column(name="likelihood")
	public int likelihood;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getEndYear() {
		return endYear;
	}


	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}


	public String getCityLongitude() {
		return cityLongitude;
	}


	public void setCityLongitude(String cityLongitude) {
		this.cityLongitude = cityLongitude;
	}


	public String getCityLatitude() {
		return cityLatitude;
	}


	public void setCityLatitude(String cityLatitude) {
		this.cityLatitude = cityLatitude;
	}


	public int getIntensity() {
		return intensity;
	}


	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public String getInSight() {
		return inSight;
	}


	public void setInSight(String inSight) {
		this.inSight = inSight;
	}


	public String getSwot() {
		return swot;
	}


	public void setSwot(String swot) {
		this.swot = swot;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getStart_year() {
		return start_year;
	}


	public void setStart_year(String start_year) {
		this.start_year = start_year;
	}


	public String getImpact() {
		return impact;
	}


	public void setImpact(String impact) {
		this.impact = impact;
	}


	public String getAdded() {
		return added;
	}


	public void setAdded(String added) {
		this.added = added;
	}


	public String getPublished() {
		return published;
	}


	public void setPublished(String published) {
		this.published = published;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getRelevance() {
		return relevance;
	}


	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}


	public String getPestle() {
		return pestle;
	}


	public void setPestle(String pestle) {
		this.pestle = pestle;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getLikelihood() {
		return likelihood;
	}


	public void setLikelihood(int likelihood) {
		this.likelihood = likelihood;
	}


	@Override
	public String toString() {
		return "Visualistation [id=" + id + ", endYear=" + endYear + ", cityLongitude=" + cityLongitude
				+ ", cityLatitude=" + cityLatitude + ", intensity=" + intensity + ", sector=" + sector + ", topic="
				+ topic + ", inSight=" + inSight + ", swot=" + swot + ", url=" + url + ", region=" + region
				+ ", start_year=" + start_year + ", impact=" + impact + ", added=" + added + ", published=" + published
				+ ", city=" + city + ", country=" + country + ", relevance=" + relevance + ", pestle=" + pestle
				+ ", source=" + source + ", title=" + title + ", likelihood=" + likelihood + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 

}
