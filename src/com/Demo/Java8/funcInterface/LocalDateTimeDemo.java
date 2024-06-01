package com.Demo.Java8.funcInterface;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("LocalDateTime: " + currentTime);

		LocalDate date1 = currentTime.toLocalDate();
		System.out.println("LocalDate: " + date1);
		
		LocalTime time1 = currentTime.toLocalTime();
		System.out.println("LocalTime: " + time1);

		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();

		System.out.println("Month: " + month +" day: " + day +" seconds: " + seconds);

		LocalDateTime date2 = currentTime.withDayOfMonth(20).withYear(2025);
		System.out.println("date2: " + date2);

		//11 June 2010
		LocalDate date3 = LocalDate.of(2020, Month.JUNE, 11);
		System.out.println("date3: " + date3);

		//22 hour 15 minutes
		LocalTime date4 = LocalTime.of(22, 15);
		System.out.println("date4: " + date4);

		//parse a string
		LocalTime date5 = LocalTime.parse("20:15:30");
		System.out.println("date5: " + date5);
		
		LocalDateTime now = LocalDateTime.now();
        System.out.println("LocalDateTime Before : " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS");
        String formatDateTime = now.format(formatter);
        System.out.println("LocalDateTime After : " + formatDateTime);
        
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatDate = now.format(formatter);
        System.out.println("After formatDate: " + formatDate);
        
        formatter = DateTimeFormatter.ofPattern("HH:mm:SS");
        String formatTime = now.format(formatter);
        System.out.println("After formatTime: " + formatTime);
	}
}
