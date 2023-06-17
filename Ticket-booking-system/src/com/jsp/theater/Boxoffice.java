package com.jsp.theater;

import java.util.Scanner;

public class Boxoffice {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		
		Theater theater=new Theater("inox");
		
		boolean flag=true;
		while(flag) {
			System.out.println(" \n 1. book ticket \n 2. check book availibility"
					+ " \n 3. show ticket details \n 4. cancel ticket \n 5. exit" );
			int n=sc.nextInt();
			switch(n) {
			case 1 :{
				System.out.println("enter the movie name");
				String mname=sc.nextLine();
				
				System.out.println("enter the number of seats");
				int seat=sc.nextInt();
				theater.setTicket(new Ticket(mname,seat));
					theater.bookTicket();
				
			}break;
			case 2:{
				System.out.println("availability");
			}break;
			case 3:{
				System.out.println("ticket details");
			}break;
			case 4:{
				System.out.println("cancel ticket");
				System.out.println("your booking has"
						+ theater.getTicket().getNo_of_tickets());
				int cancel=sc.nextInt();
				if(cancel <= theater.getTicket().getNo_of_tickets()) {
					
				}else {
					System.out.println("could not process");
				}
			}break;
			case 5:{
				flag=false;
				System.out.println("exit");
			}break;
			default:{
				System.out.println("enter proper number");
			}
		}
		}
	}
}
