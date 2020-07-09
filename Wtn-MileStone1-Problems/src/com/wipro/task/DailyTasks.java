package com.wipro.task;
import java.util.Arrays;
public class DailyTasks {
	public String dostringconcat(String s1,String s2) {
		return s1+" "+s2;
	}
	public int[] sortValues(int a[] ) {
		Arrays.sort(a);
		return a;
	}
	public boolean checkPresence(String str,String a) {
		return str.contains(a);
	}

}
