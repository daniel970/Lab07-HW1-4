package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

/*제작자: 김도영 21700082
 * 자바프로그래밍 02분반
 * 날짜: 04/04
 * 설명: 이 프로그램은 년도를 세기로 바꿔줍니다.
 */

public class YearToCentury {
	
	public static void main(String [] args)
		{
			int yr = 0;
			Scanner keyboard = new Scanner(System.in);
	
			System.out.println("Input year: ");
			yr = keyboard.nextInt();
	
			YearToCentury_this year = new YearToCentury_this(yr);
			System.out.println(yr + " is " + year.calc_century() + "th century.");
		}


}
