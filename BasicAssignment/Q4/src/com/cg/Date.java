package com.cg;

public class Date {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void printDate() {
		System.out.println("Day=" + day + " " + "Month=" + month + " " + "Year=" + year);

	}

	public static void swap(Date d1, Date d2) {
		Date temp = d1;
		d1 = d2;
		d2 = temp;
		System.out.println("day= " + d1.getDay() + " " + "month= " + d1.getMonth() + " " + "Year= " + d1.getYear());
		System.out.println("day= " + d2.getDay() + " " + "month= " + d2.getMonth() + " " + "Year= " + d2.getYear());
	}

}
