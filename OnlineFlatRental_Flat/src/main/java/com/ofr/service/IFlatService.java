package com.ofr.service;

import java.util.List;
import java.util.Optional;

import com.ofr.exception.FlatNotFoundException;
import com.ofr.exception.ValidFlatDetailsException;
import com.ofr.model.Flat;

public interface IFlatService {

	public Flat addFlat(Flat flat) throws ValidFlatDetailsException;
	
	public Flat updateFlat(Flat flat) throws FlatNotFoundException;
	
	public Flat deleteFlat(Flat flat) throws FlatNotFoundException;
	
	public Optional<Flat> viewFlat(Integer id) throws FlatNotFoundException;
	
	public List<Flat> viewAllFlat();
	
	public List<Flat> viewAllFlatByCost(Float cost,String availability);
}
