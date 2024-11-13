package com.example.demo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class VisitingPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attractionId;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Double longitude;
    @Column
    private Double latitude;
    @Column
    private Double entryFee;
    @Column
    private String openingHours;
    @Column
    private Double rating;
    @Column
    private String imageUrl;
    
    @ManyToOne
    @JsonBackReference
    private CityModel city;
    

	public VisitingPlace() {
		super();
	}

	public VisitingPlace(Long attractionId, String name, String description, Double logitude, Double latitude,
			Double entryFee, String openingHours, Double rating, String imageUrl, CityModel city) {
		super();
		this.attractionId = attractionId;
		this.name = name;
		this.description = description;
		this.longitude = logitude;
		this.latitude = latitude;
		this.entryFee = entryFee;
		this.openingHours = openingHours;
		this.rating = rating;
		this.imageUrl = imageUrl;
		this.city = city;
	}

	public Long getAttractionId() {
		return attractionId;
	}

	public void setAttractionId(Long attractionId) {
		this.attractionId = attractionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getLogitude() {
		return longitude;
	}

	public void setLogitude(Double logitude) {
		this.longitude = logitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(Double entryFee) {
		this.entryFee = entryFee;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public CityModel getCity() {
		return city;
	}

	public void setCity(CityModel city) {
		this.city = city;
	}
    
    
	
}
