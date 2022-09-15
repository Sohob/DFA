package csen1002.main.task1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write your info here
 * 
 * @name Mostafa Abdelnasser
 * @id 43-8530
 * @labNumber 11
 */
public class DFA {
	/**
	 * csen1002.main.task1.DFA constructor
	 * 
	 * @param description is the string describing a csen1002.main.task1.DFA
	 */
	ArrayList<HashMap> DFAarray = new ArrayList<HashMap>();
	ArrayList<Integer> acceptStates = new ArrayList<Integer>();
	public DFA(String description) {
		String[] bigString = description.split(";");
		String[] lastString = bigString[bigString.length-1].split("#");
		bigString[bigString.length-1] = lastString[0];
		for(String s: bigString){
			String[] stateParse = s.split(",");
			HashMap<Integer,Integer> state = new HashMap<Integer,Integer>();
			int id= Integer.parseInt(stateParse[0]);
			int zeroTrans= Integer.parseInt(stateParse[1]);
			int oneTrans= Integer.parseInt(stateParse[2]);
			state.put(0,zeroTrans);
			state.put(1,oneTrans);
			DFAarray.add(state);
		}
		String[] splitAccept = lastString[1].split(",");
		for(String s : splitAccept){
			acceptStates.add(Integer.parseInt(s));
		}
	}

	/**
	 * Returns true if the string is accepted by the csen1002.main.task1.DFA and false otherwise.
	 * 
	 * @param input is the string to check by the csen1002.main.task1.DFA.
	 * @return if the string is accepted or not.
	 */
	public boolean run(String input) {
		char[] inputArr = input.toCharArray();
		int currState = 0;
		for(char c : inputArr){
			int in = Integer.parseInt(c+"");
			currState = (int) DFAarray.get(currState).get(in);
		}
		return acceptStates.contains(currState);
	}
	public static void main(String[] args){
		DFA d = new DFA("0,0,1;1,2,1;2,0,3;3,3,3#1,3");
		System.out.println();
	}
}

