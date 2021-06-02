package object;

public class MyDate {

	public int year;
	public int month;
	public int day; //System.out.println(year+":"+with2digits+":"+day); // DD:MM:YYYY. 
	
	//Constructor
	public MyDate() {
		super();
	}

	public MyDate(int year, int month, int day) {
	
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//Getters && Setters
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	//toString
	
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
}
	
	


