package com.example.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TripPlanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "price_adult")
    private double priceAdult;

    @Column(name = "price_child")
    private double priceChild;

    private int days;

    @ElementCollection
    private List<String> placesToVisit;

    private String description;

    @Column(name = "price_offer")
    private double priceOffer;

    @ElementCollection
    private List<String> tripImages;

    // Itinerary of the trip
    private String itinerary;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceAdult() {
        return priceAdult;
    }

    public void setPriceAdult(double priceAdult) {
        this.priceAdult = priceAdult;
    }

    public double getPriceChild() {
        return priceChild;
    }

    public void setPriceChild(double priceChild) {
        this.priceChild = priceChild;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public List<String> getPlacesToVisit() {
        return placesToVisit;
    }

    public void setPlacesToVisit(List<String> placesToVisit) {
        this.placesToVisit = placesToVisit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceOffer() {
        return priceOffer;
    }

    public void setPriceOffer(double priceOffer) {
        this.priceOffer = priceOffer;
    }

    public List<String> getTripImages() {
        return tripImages;
    }

    public void setTripImages(List<String> tripImages) {
        this.tripImages = tripImages;
    }

    public String getItinerary() {
        return itinerary;
    }

    public void setItinerary(String itinerary) {
        this.itinerary = itinerary;
    }
}
