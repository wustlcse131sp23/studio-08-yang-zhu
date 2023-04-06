package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean isTwelve;
	
	public Time(int hour, int minute, boolean isTwelve) {
		this.hour = hour;
		this.minute = minute;
		this.isTwelve = true;
	}
	
	
	public String toString() {
		if(isTwelve && hour > 12) {
			return "Time [hour=" + (hour-12) + ", minute=" + minute + "]";
		}else {
			return "Time [hour=" + hour + ", minute=" + minute + "]";
		}
		
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(hour, isTwelve, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && isTwelve == other.isTwelve && minute == other.minute;
	}
	

	public static void main(String[] args) {
		Time t1 = new Time(11,12,true);
		Time t2 = new Time(1,21,false);
		Time t3 = new Time(23,12,false);
		Time t4 = new Time(5,12,true);
		Time t5 = new Time(15,12,true);
		LinkedList <Time> timeList = new LinkedList<Time>();
		timeList.add(t1);
		timeList.add(t2);
		timeList.add(t3);
		timeList.add(t4);
		timeList.add(t5);
		//System.out.println(timeList);
		HashSet<Time> timeSet = new HashSet<Time>();
		timeSet.add(t1);
		timeSet.add(t2);
		timeSet.add(t1);
		System.out.println(timeSet);
//		System.out.println(t1);
//		Date d1 = new Date(4,6,2023,false);
//		System.out.println(d1);
    }

}