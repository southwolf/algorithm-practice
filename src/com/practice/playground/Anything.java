package com.practice.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Anything {

	public double pow(double base, int exp) {
        double result = 1;
        while (exp != 0)
        {
            if ((exp & 1) != 0) result *= base;
            exp >>= 1;
            base *= base;
        }

        return result;
    }
	
	public static void main(String[] args) {
		/*
		System.out.println(Math.pow(2, 3));
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
	
		Scanner scanner = new Scanner("hello world    my dear  friends");
		while (scanner.hasNext()) System.out.print(scanner.next());
		scanner.close();
		*/
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		Collections.sort(arr);
		Set<Integer> set = new HashSet<>();
		
	}

}
