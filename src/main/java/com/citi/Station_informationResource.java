package com.citi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class Station_informationResource {



		@Autowired
		Station_informationRepository stRepository;
/*
	    @PostMapping("/Station_informations/{id}/{n}/{sn}/{lat}/{lon}/{r}/{c}")
	    public ResponseEntity<?> createStation_information(@PathVariable Long id,@PathVariable String n,@PathVariable Double sn,@PathVariable Double lat,@PathVariable Double lon,@PathVariable Integer r,@PathVariable Integer c) {
	    	  try {
	  	    	Station_information u = stRepository.findById(id);
	  	    	return new ResponseEntity<>(HttpStatus.CONFLICT);
	  	    	
	  	    	
	    	  }catch (Exception ex) {
	    		  stRepository.insert(new Station_information(id,n,sn,lat,lon,r,c));
	    	  return ResponseEntity.ok().build();
	    	  }
	    }
	    */
	    @GetMapping("/Station_informations")
	    public List<Station_information> getAllStation_informations() {
	        return stRepository.findAll();
	    }
	    @GetMapping("/Station_informations/{id}")
	    public ResponseEntity<Station_information> getStation_informationById(@PathVariable Long id) {
	        
		    try {
		    	Station_information u = stRepository.findById(id);
		        return new ResponseEntity<Station_information>(u, HttpStatus.OK);
		    } catch (Exception e) {
		        return new ResponseEntity<Station_information>(HttpStatus.NOT_FOUND);
		    }      
		
	    }
	 
	    @DeleteMapping("/Station_informations/{id}")
	    public ResponseEntity<?> deleteStation_information(@PathVariable Long id) {
	 
		    try {
		    	Station_information u = stRepository.findById(id);
		    	stRepository.deleteById(id);
		        return ResponseEntity.ok().build();
		    } catch (Exception e) {
		        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    } 

	    }
	}


