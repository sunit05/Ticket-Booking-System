package com.jsp.theater;

public class Theater {
	private String theater_name;
	static int no_of_seats=500;
	private Ticket ticket;
	
	public Theater(){}
	public Theater(String theater_name){
		this.theater_name=theater_name;
	}
	public String getTheater_name() {
		return theater_name;
	}
	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public void bookTicket() {
		System.out.println("booking in progress");
		if(ticket.getNo_of_tickets()<=Theater.no_of_seats){
			int remaining=Theater.no_of_seats-ticket.getNo_of_tickets();
			Theater.no_of_seats=remaining;
			System.out.println("your ticket has been booked");
		}else {
			System.out.println("no booked sue to technical error");
		}
	}
	
}

