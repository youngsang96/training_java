package ch08_eum;

public class EnumWeekEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today=Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		int ordinal=today.ordinal();
		System.out.println(ordinal);
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day.name()+","+day);
		}
		int wd = (int) (Math.random()* days.length);
		System.out.println(wd);
		Week weekDay = Week.valueOf(days[wd].name());
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println(weekDay + " : 주말이군요");
		}else{
			System.out.println(weekDay+ " : 평일이군요");
		}
	}

}
