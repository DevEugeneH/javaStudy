package org.java.loop;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		System.out.println("while");

		int i = 2;

		while (i < 10) {

			System.out.println(i + " ��");

			int j = 1;

			while (j < 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}

			i++;

		}
		
		System.out.println("====================");

	
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num1 = scn.nextInt();
		
		while (num1<10) {
			System.out.println(num1 + "��");
		
			int j = 1;
			while (j<10) {
				System.out.println(num1 + " * " + j + " = " + (num1*j));
				j++;
			}
		num1++;
		}
		
		
		scn.close();
		
	}
}
