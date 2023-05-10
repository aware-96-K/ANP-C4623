package com.maven.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity  
@Table(name = "hms")
public class HotelManagement 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    

    @Column(name = "first_name")
    private String FirstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "email")
    private String Email;

    @Column(name = "room_number")
    private int RoomNumber;
    
    @Column(name = "room_type")
    private String RoomType;

    @Column(name = "price")
    private int Price;

    @Column(name = "food_package")
    private String FoodPackage;
   
    @Column(name = "phone_number")
    private int PhoneNumber ;

    //constructor using fields
	/**
	 
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param roomNumber
	 * @param roomType
	 * @param price
	 * @param foodPackage
	 * @param phoneNumber
	 */
	public HotelManagement( String firstName, String lastName, String email, int roomNumber, String roomType,
			int price, String foodPackage, int phoneNumber) {
		super();
		
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		RoomNumber = roomNumber;
		RoomType = roomType;
		Price = price;
		FoodPackage = foodPackage;
		PhoneNumber = phoneNumber;
	}
    // Getters and setter

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getRoomNumber() {
		return RoomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getFoodPackage() {
		return FoodPackage;
	}

	public void setFoodPackage(String foodPackage) {
		FoodPackage = foodPackage;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	/**
	 * 
	 */
	public HotelManagement() {
		
		
	}
	
	
	}

