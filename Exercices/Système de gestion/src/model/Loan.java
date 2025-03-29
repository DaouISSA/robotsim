package model;

import java.time.LocalDate;
import java.util.*;
public class Loan {
	private String id;
	private Book book;
	private Member member;
	private LocalDate loanDate;
	private LocalDate dueDate;
	private LocalDate returnDate;
	private double fine;
	
	public Loan(Book book, Member member) {
		this.book=book;
		this.member=member;
		this.id=UUID.randomUUID().toString();
		this.loanDate= LocalDate.now();
		this.dueDate=loanDate.plusDays(14);
		this.returnDate=null;
		this.fine=0.0;
		book.setAvailable(false);
		member.addLoan(this);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}
	public void setReturn(LocalDate returnDate) {
		this.returnDate=returnDate;
		book.setAvailable(true);
	}
	public void calculateFine() {
		if(returnDate==null) {
			if (LocalDate.now().isAfter(dueDate)) {
				long datedays= LocalDate.now().toEpochDay()-dueDate.toEpochDay();
				this.fine=0.5*datedays;
			}else {this.fine=0.0;}
			
		} else if(returnDate.isAfter(dueDate)) {
			long latedays= returnDate.toEpochDay()-dueDate.toEpochDay();
			this.fine=latedays*0.5;
		}
		
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", book=" + book + ", member=" + member + ", loanDate=" + loanDate + ", dueDate="
				+ dueDate + ", returnDate=" + returnDate + ", fine=" + fine + "]";
	}
	
	
	
}
