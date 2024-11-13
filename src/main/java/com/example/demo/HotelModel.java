package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class HotelModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long hotelId;
	String hotelName;
	String roomPrice;
	String discountedPrice;
	@ElementCollection
	List<String> imageUrls;
	int stars;
	boolean wifi;
	boolean ac;
	boolean restaurent;
	boolean parking;
	int person;
	String address;
	@ManyToOne
	@JsonBackReference
	TripPackageModel tripPackageModel;
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(String roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public List<String> getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public boolean isRestaurent() {
		return restaurent;
	}
	public void setRestaurent(boolean restaurent) {
		this.restaurent = restaurent;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public TripPackageModel getTripPackageModel() {
		return tripPackageModel;
	}
	public void setTripPackageModel(TripPackageModel tripPackageModel) {
		this.tripPackageModel = tripPackageModel;
	}
	

}
