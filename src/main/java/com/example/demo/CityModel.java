package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CityModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long city_id;
	@Column
	private String name;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private Double longitude;
	@Column
	private Double latitude;
    @OneToMany(mappedBy = "city")
    @JsonManagedReference
	private List<VisitingPlace> visitingplaces;
	
	public CityModel() {
		super();
	}
	
	public CityModel(long id, String name, String state, String country, Double longitude, Double latitude,
			List<VisitingPlace> visitingplaces) {
		super();
		this.city_id = id;
		this.name = name;
		this.state = state;
		this.country = country;
		this.longitude = longitude;
		this.latitude = latitude;
		this.visitingplaces = visitingplaces;
	}
	public long getId() {
		return city_id;
	}
	public void setId(long id) {
		this.city_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public List<VisitingPlace> getVisitingplaces() {
		return visitingplaces;
	}
	public void setVisitingplaces(List<VisitingPlace> visitingplaces) {
		this.visitingplaces = visitingplaces;
	}
	
	
	
	
}
