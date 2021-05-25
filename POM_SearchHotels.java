package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_SearchHotels {
	
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement loCation;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "datepick_in")
	private WebElement datePickin;
	
	@FindBy(id = "datepick_out")
	private WebElement datePickout;	
	
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	
	@FindBy(id = "child_room")
	private WebElement childRoom;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	@FindBy(id = "room_nos")
	private WebElement totalRooms;
	
	public POM_SearchHotels(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoCation() {
		return loCation;
	}

	public void setLoCation(WebElement loCation) {
		this.loCation = loCation;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}

	public WebElement getDatePickin() {
		return datePickin;
	}

	public void setDatePickin(WebElement datePickin) {
		this.datePickin = datePickin;
	}

	public WebElement getDatePickout() {
		return datePickout;
	}

	public void setDatePickout(WebElement datePickout) {
		this.datePickout = datePickout;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public void setAdultRoom(WebElement adultRoom) {
		this.adultRoom = adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public void setChildRoom(WebElement childRoom) {
		this.childRoom = childRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(WebElement totalRooms) {
		this.totalRooms = totalRooms;
	}
	
	
}
