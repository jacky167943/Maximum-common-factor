package com.myHomework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Maximumcommonfactor {

	public int gcd(int m, int n) {
		int r;
		while (m % n != 0) {
			r = m % n; 
			m = n; 
			n = r; 
		}
		return n; 
	}

	public static void main(String[] args) {
		Maximumcommonfactor x = new Maximumcommonfactor();
		
		try {			
			while (true) {
			System.out.println("�п�J��ӼƦr�D���̤j���]��:");
			Scanner scanner = new Scanner(System.in);
			int cusInput = scanner.nextInt();
			int cusInput2 = scanner.nextInt();
			int Maximumcommonfactor = x.gcd(cusInput, cusInput2);
			System.out.println("�̤j���]��:" + Maximumcommonfactor);

			}
		} catch (InputMismatchException e) {
			System.out.println("�п�J�Ʀr^^����");
		}
	}

}

