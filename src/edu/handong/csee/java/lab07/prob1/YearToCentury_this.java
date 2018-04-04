package edu.handong.csee.java.lab07.prob1;

public class YearToCentury_this {
	int year;

	public void YearToCentury()
	{
		year = 0;
	}

	public void YearToCentury(int year)
	{
		this.year = year;
	}

	public int calc_century()
	{
		if(year % 100 == 0)
			year = year / 100;
	else
	{
		year = (year / 100) + 1;
	}
		return year;
	}

}
