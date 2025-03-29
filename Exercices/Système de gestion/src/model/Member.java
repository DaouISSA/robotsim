package model;

import java.time.LocalDate;
import java.util.*;
public class Member {
	private String id;
	private String name;
	private String email;
	private String phone;
	private LocalDate registrationDate;
	private List<Loan> loanHistory;
	
	
	public Member(String name, String email, String phone) {
		this.id= UUID.randomUUID().toString();
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.registrationDate=LocalDate.now();
		this.loanHistory= new ArrayList<>();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}


	public List<Loan> getLoanHistory() {
		return loanHistory;
	}


	public void setLoanHistory(List<Loan> loanHistory) {
		this.loanHistory = loanHistory;
	}

	public void addLoan(Loan loan) {
		loanHistory.add(loan);
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", registrationDate="
				+ registrationDate + "]";
	}
	
	
	
	

}
