package com.ofr.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofr.exception.FlatNotFoundException;
import com.ofr.exception.ValidFlatDetailsException;
import com.ofr.model.Flat;
import com.ofr.service.IFlatService;

/*
 * This class used to get response for add,update,delete and view the flat details
 */
@RestController
@RequestMapping("/flats")
@Validated
public class FlatController {

	@Autowired
	private IFlatService flatService;

	public IFlatService getFlatService() {
		return flatService;
	}

	public void setFlatService(IFlatService flatService) {
		this.flatService = flatService;
	}

	/*
	 * This method is used for add the flat and it give the response in boolean type
	 * @param flat
	 * exception ValidFlatDetailsException
	 */
	@PostMapping("/add")
	public ResponseEntity<Boolean> addFlat(@Valid @RequestBody Flat flat) throws ValidFlatDetailsException{
		getFlatService().addFlat(flat);
		@SuppressWarnings({"rawtypes","unchecked"})
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true,HttpStatus.OK);
		System.out.println("response entity="+responseEntity);
		return responseEntity;
	}
	/*
	 * This method is used for update the flat and it give the response in boolean type
	 * @param flat
	 * exception FlatNotFoundException
	 */
	@SuppressWarnings({"rawtypes","unchecked"})
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateFlat(@Valid @RequestBody Flat flat) throws FlatNotFoundException{
		 getFlatService().updateFlat(flat);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true,HttpStatus.OK);
		return responseEntity;
	}
	/*
	 * This method is used for delete the flat and it give the response in boolean type
	 * @param flat
	 * exception FlatNotFoundException
	 */
	@DeleteMapping("/delete")
	public ResponseEntity<Boolean> deleteFlat(@RequestBody Flat flat) throws FlatNotFoundException{
		 getFlatService().deleteFlat(flat);
		 @SuppressWarnings({ "rawtypes", "unchecked" })
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		 return responseEntity;
	}
	/*
	 * This method is used for find the flat by its id and it return the flat details for specific id
	 * @param id
	 * exception FlatNotFoundException
	 */
	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Flat>> viewFlat(@PathVariable("id") Integer id) throws FlatNotFoundException{
		Optional<Flat> entity = getFlatService().viewFlat(id);
		return new ResponseEntity<>(entity,new HttpHeaders(),HttpStatus.OK);
	}
	/*
	 * This method is used for get all the flat and it return the flat details 
	 */
	@GetMapping("/all")
	 public ResponseEntity<List<Flat>> viewAllFlat(){
	    	List<Flat> list = getFlatService().viewAllFlat();
	    	return new ResponseEntity<>(list,new HttpHeaders(),HttpStatus.OK);
	    }
	/*
	 * This method is used for find the flat by its id and it return the flat details for specific id
	 * @param cost, availability
	 */
	@GetMapping("/find/{cost}/{availability}")
	 public ResponseEntity<List<Flat>> viewAllFlatByCost(@PathVariable Float cost ,@PathVariable String availability){
	    	List<Flat> list = getFlatService().viewAllFlatByCost(cost, availability);
	    	return new ResponseEntity<>(list,new HttpHeaders(),HttpStatus.OK);
	    }
}
