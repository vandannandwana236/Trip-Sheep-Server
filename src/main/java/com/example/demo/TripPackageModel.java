package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;

@Entity
public class TripPackageModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long tripPackageId;
	String packageName;
	@ElementCollection
	List<String> imageUrls;
	@Lob
	String about;
	@OneToMany(mappedBy = "tripPackageModel",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonManagedReference
	List<HotelModel> hotels;
	public long getTripPackageId() {
		return tripPackageId;
	}
	public void setTripPackageId(long tripPackageId) {
		this.tripPackageId = tripPackageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public List<String> getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public List<HotelModel> getHotels() {
		return hotels;
	}
	public void setHotels(List<HotelModel> hotels) {
		this.hotels = hotels;
	}
	
	
	
}
