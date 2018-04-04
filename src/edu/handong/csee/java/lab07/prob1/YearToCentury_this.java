package edu.handong.csee.java.lab07.prob1;

public class YearToCentury_this {
	int year;

	public YearToCentury_this() {
		year = 0;
	}

	public YearToCentury_this(int year) {
		this.year = year;
	}

	public int calc_century() {
		if (year % 100 == 0)
			year = year / 100;
		else {
			year = (year / 100) + 1;
		}
		return year;
	}

}
