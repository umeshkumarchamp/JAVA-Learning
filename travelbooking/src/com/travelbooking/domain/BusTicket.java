package com.travelbooking.domain;

import java.util.Arrays;

public class BusTicket extends TravelTicket {
	
	private long pnrCode;
	private long bookingCode;
	private String[] permittedProvider; 
	
	
	
	public BusTicket() {
		super();
		// TODO Auto-generated constructor stub
	}



	public BusTicket(long bookingRef, String origin, String destination, int price, String departureTime,
			String arrivalTime, long pnrCode, long bookingCode, String[] permittedProvider) {
		super(bookingRef, origin, destination, price, departureTime, arrivalTime);
		this.pnrCode = pnrCode;
		this.bookingCode = bookingCode;
		this.permittedProvider = permittedProvider; 
	}



	public long getPnrCode() {
		return pnrCode;
	}



	public void setPnrCode(long pnrCode) {
		this.pnrCode = pnrCode;
	}



	public long getBookingCode() {
		return bookingCode;
	}



	public void setBookingCode(long bookingCode) {
		this.bookingCode = bookingCode;
	} 
	
	
	
	
	public String[] getPermittedProvider() {
		return permittedProvider;
	}



	public void setPermittedProvider(String[] permittedProvider) {
		this.permittedProvider = permittedProvider;
	}

	

	@Override
	public String toString() {
		return "BusTicket [permittedProvider=" + Arrays.toString(permittedProvider) + "]";
	}



	public void BusTicketDetails() {
		System.out.println("\n ***** Your Bus Ticket Details ***** \n");
		System.out.println("Booking Reference : "+getBookingRef());
		System.out.println("Your Origin : "+getOrigin());
		System.out.println("Your Destination : "+getDestination()); 
		System.out.println("Ticket Price : "+getPrice());
		System.out.println("Arrival Time : "+getArrivalTime()); 
		System.out.println("Departure Time : "+getDepartureTime()); 
		System.out.println("PNR Code : "+getPnrCode());
		System.out.println("Booking Code : "+getBookingCode()); 
		
		
	}
	
	public void cancel() {
		System.out.println("Your Ticket has been canceled.");
	}
	
	

}
