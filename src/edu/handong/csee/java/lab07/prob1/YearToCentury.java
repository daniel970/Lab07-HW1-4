package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

/*������: �赵�� 21700082
 * �ڹ����α׷��� 02�й�
 * ��¥: 04/04
 * ����: �� ���α׷��� �⵵�� ����� �ٲ��ݴϴ�.
 */

public class YearToCentury main{
	public static void main(String [] args)
		{
			int yr = 0;
			Scanner keyboard = new Scanner(System.in);
	
			System.out.println("Input year: ");
			yr = keyboard.nextInt();
	
			YearToCentury year = new YearToCentury(yr);
			System.out.println(yr + " is " + year.calc_century() + "th century.");
		}


}
