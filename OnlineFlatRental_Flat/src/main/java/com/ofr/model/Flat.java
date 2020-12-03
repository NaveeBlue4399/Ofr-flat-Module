package com.ofr.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Entity
@Table(name="Flat_Module")
public class Flat { 

	@Id
	@Column(name="FlatId",length=15)
	@Min(value=1,message="Id should be a positive")
	private Integer flatId;
	@Column(name="cost",length=15)
	@Min(value=1000,message="Cost must be greater than 1000")
	private Float cost;
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="House_No")
	private FlatAddress flatAddress;
	@Column(name="Availability",length=15)
	@Size(min=2 , max=3,message="Enter valid detail")
	private String availability;
	
	/*
	 * Parameterized constructor for flat
	 */
	public Flat(Integer flatId, Float cost, FlatAddress flatAddress, String availability) {
		super();
		this.flatId = flatId;
		this.cost = cost;
		this.flatAddress = flatAddress;
		this.availability = availability;
	}
	/*
	 * Default constructor for flat
	 */
	public Flat() {
		super();
		
	}
	
	/*
	 * Getter and setter methods for all the parameters of flat model class
	 */
	public Integer getFlatId() {
		return flatId;
	}
	public void setFlatId(Integer flatId) {
		this.flatId = flatId;
	}
	public Float getCost() {
		return cost;
	}
	public void setCost(Float cost) {
		this.cost = cost;
	}
	public FlatAddress getFlatAddress() {
		return flatAddress;
	}
	public void setFlatAddress(FlatAddress flatAddress) {
		this.flatAddress = flatAddress;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Flat [flatId=" + flatId + ", cost=" + cost + ", flatAddress=" + flatAddress + ", availability="
				+ availability + "]";
	}
	
	
}
