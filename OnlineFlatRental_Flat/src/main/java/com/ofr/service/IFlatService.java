package com.ofr.service;

import java.util.List;
import java.util.Optional;

import com.ofr.exception.FlatNotFoundException;
import com.ofr.exception.ValidFlatDetailsException;
import com.ofr.model.Flat;

public interface IFlatService {

	/*
	 * This method is used for add the flat
	 * return type Flat
	 * @param flat
	 * exception ValidFlatDetailsException
	 */
	public Flat addFlat(Flat flat) throws ValidFlatDetailsException;
	/*
	 * This method is used for update the flat
	 * return type Flat
	 * @param flat
	 * exception FlatNotFoundException
	 */
	public Flat updateFlat(Flat flat) throws FlatNotFoundException;
	/*
	 * This method is used for delete the flat
	 * return type Flat
	 * @param flat
	 * exception FlatNotFoundException
	 */
	public Flat deleteFlat(Flat flat) throws FlatNotFoundException;
	/*
	 * This method is used to view the flat by id
	 * return type Flat
	 * @param id
	 * exception FlatNotFoundException
	 */
	public Optional<Flat> viewFlat(Integer id) throws FlatNotFoundException;
	/*
	 * This method is used to view all the flat
	 * return type Flat
	 */
	public List<Flat> viewAllFlat();
	/*
	 * This method is used for view the flat by cost and availability
	 * return type Flat
	 * @param cost,availability
	 */
	public List<Flat> viewAllFlatByCost(Float cost,String availability);
}
