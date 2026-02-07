import java.time.*;
import java.time.format.DateTimeFormatter;
class TApp{
	public static void main(String[]x){
		//local Date
		System.out.println("Local Date");
		LocalDate today=LocalDate.now();
		LocalDate bday=LocalDate.of(2004,10,15);//yy,MM,dd
		System.out.println(today);
		System.out.println(bday);
		//Date formatting and parsing
		System.out.println("Date formatting and parsing");
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yy");
		LocalDate date = LocalDate.now();
        System.out.println(dtf.format(date));
		//local Time
		System.out.println("Local Time");
		LocalTime lt=LocalTime.now();
		LocalTime meeting=LocalTime.of(1,30,20);//h,m,s
		System.out.println(lt);
		System.out.println(meeting);
		//local Date Time
		System.out.println("Local Date Time");
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		//ZonedDateTime 
		System.out.println("Zoned Date Time ");
		ZonedDateTime zd1=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime zd2=ZonedDateTime.now(ZoneId.of("America/New_York"));
		ZonedDateTime zd3=ZonedDateTime.now(ZoneId.of("Australia/Perth"));
		System.out.println(zd1);
		System.out.println(zd2);
		System.out.println(zd3);
	}
}