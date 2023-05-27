package com.example.kinara_capital.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student_details {
	private int pagenumber;
	@Id
	private int id;
	private String name;
	private long number;
	private String totalmarks;

	public int getPagenumber() {
		return pagenumber;
	}

	public void setPagenumber(int pagenumber) {
		this.pagenumber = pagenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student_details [pagenumber=" + pagenumber + ", id=" + id + ", name=" + name + ", number=" + number
				+ ", totalmarks=" + totalmarks + "]";
	}

}
