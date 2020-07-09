package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class DailyTasksTest {

	DailyTasks d;
	int a[];
	int b[];
	@Before
	public void bfo() {
		d=new DailyTasks();
	}
	
	@Test
	public void test() {
		String s="Sravanth Chalavadi";
		assertEquals(s,d.dostringconcat("Sravanth", "Chalavadi"));
	}
	@Test
	public void test1() {
		a=new int [] {2,3,1,4};
		b=new int [] {1,2,3,4};
		assertArrayEquals(b,d.sortValues(a));
	}
	@Test
	public void test2() {
		String s="sravanth";
		String sr="sra";
		assertEquals(true,d.checkPresence(s, sr));
	}

}
