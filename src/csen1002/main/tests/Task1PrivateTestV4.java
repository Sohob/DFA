package csen1002.main.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import csen1002.main.task1.DFA;

public class Task1PrivateTestV4 {
	
	//////////1st DFA Strings Validation///////////////
	@Test 
	@Timeout(5)
	public void testDFA1T1() {
		DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,1,2;4,4,4#3");
		assertTrue(dfa1.run("00110011"));
	}
	@Test
	@Timeout(5)
	public void testDFA1T2() {
		DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,1,2;4,4,4#3");
		assertTrue(dfa1.run("00001100"));
	}
	@Test
	@Timeout(5)
	public void testDFA1T3() {
		DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,1,2;4,4,4#3");
		assertFalse(dfa1.run("10101"));
	}
	@Test
	@Timeout(5)
	public void testDFA1T4() {
		DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,1,2;4,4,4#3");
		assertTrue(dfa1.run("00"));
	}
	@Test
	@Timeout(5)
	public void testDFA1T5() {
		DFA dfa1 = new DFA("0,1,2;1,3,4;2,4,3;3,1,2;4,4,4#3");
		assertFalse(dfa1.run("01"));
	}
	//////////2nd DFA Strings Validation///////////////
	@Test
	@Timeout(5)
	public void testDFA2T1() {
		DFA dfa2 = new DFA("0,1,0;1,1,2;2,1,3;3,4,0;4,1,2#4");
		assertFalse(dfa2.run("00001101100111"));
	}
	@Test
	@Timeout(5)
	public void testDFA2T2() {
		DFA dfa2 = new DFA("0,1,0;1,1,2;2,1,3;3,4,0;4,1,2#4");
		assertTrue(dfa2.run("00110"));
	}
	@Test
	@Timeout(5)
	public void testDFA2T3() {
		DFA dfa2 = new DFA("0,1,0;1,1,2;2,1,3;3,4,0;4,1,2#4");
		assertFalse(dfa2.run("001111000"));
	}
	@Test
	@Timeout(5)
	public void testDFA2T4() {
		DFA dfa2 = new DFA("0,1,0;1,1,2;2,1,3;3,4,0;4,1,2#4");
		assertTrue(dfa2.run("0110"));
	}
	@Test
	@Timeout(5)
	public void testDFA2T5() {
		DFA dfa2 = new DFA("0,1,0;1,1,2;2,1,3;3,4,0;4,1,2#4");
		assertTrue(dfa2.run("111101110110"));
	}

}