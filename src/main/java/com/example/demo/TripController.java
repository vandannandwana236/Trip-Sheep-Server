package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {
	
	@Autowired
	CityRepository crepo;
	
	@Autowired
	VisitingPlaceRepository vrepo;
	
	@Autowired
	HillStationRepository hrepo;
	
	@Autowired
	TripPlanRepository trepo;
	
	@Autowired
	TripPackageRepository prepo;
	
	@GetMapping("/")
	public List<CityModel> getcities(){
		return crepo.findAll();
	}
	
	@PostMapping("/add")
	public void addCity(@RequestBody CityModel city) {
	    for (VisitingPlace place : city.getVisitingplaces()) {
	        place.setCity(city);
	        System.out.println("Adding place: " + place.getName());
	    }
	    crepo.save(city);
	    vrepo.saveAll(city.getVisitingplaces());
	}
	
	@PostMapping("/addhills")
	public void addHills(@RequestBody List<HillStationModel> hillStations) {
		
		hrepo.saveAll(hillStations);
		
	}
	
	@GetMapping("/hills")
	public List<HillStationModel> addHills() {
		
		return hrepo.findAll();
		
	}

	@PostMapping("/addtrips")
	public void addTrips(@RequestBody List<TripPlanModel> trips) {
		trepo.saveAll(trips);
	}
	
	@GetMapping("/trips")
	public List<TripPlanModel> getTrips(){
		return trepo.findAll();
	}
	
	@PostMapping("/addPackages")
	public ResponseEntity<String> addPackages(@RequestBody TripPackageModel tripPackage){
		try {
			prepo.save(tripPackage);
			return ResponseEntity.ok("Package Added Successfully");
		}catch(Exception e) {
			return ResponseEntity.ok(e.getMessage());
		}
		
	}
	
	@GetMapping("/getPackages")
	public List<TripPackageModel> getPackages(){
		return prepo.findAll();
	}
	
	
}
