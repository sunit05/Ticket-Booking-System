package com.jsp.theater;

public class Ticket {
	private String movie_name;
	private int no_of_tickets;
	//no arg constructor
	Ticket(){}
	Ticket(String movie_name,int no_of_tickets){
		this.movie_name=movie_name;
		this.no_of_tickets=no_of_tickets;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getNo_of_tickets() {
		return no_of_tickets;
	}
	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	public void ticketDetails() {
		System.out.println("ticket details");
		System.out.println(movie_name);
		System.out.println(no_of_tickets);
	}
	
}
