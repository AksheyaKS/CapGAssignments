package labThree;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDiff {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the year as YYYY: ");
		int year = s.nextInt();
		System.out.println("Enter the month as MM: ");
		int month = s.nextInt();
		System.out.println("Enter the day as DD: ");
		int day = s.nextInt();
		
		LocalDate check = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		
		Period difference = Period.between(today, check);
		
		System.out.println("The difference is:");
		System.out.println("Years: " + difference.getYears());
		System.out.println("Months: " + difference.getMonths());
		System.out.println("Days: " + difference.getDays());
		
		s.close();

	}

}
