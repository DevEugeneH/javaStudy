package org.java.condition;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("If��");

		int num = 10;

		if (num >= 10) {
			System.out.println("10���� ũ�ų� �����ϴ�.");
		}
		if (num >= 10) System.out.println("10���� ũ�ų� �����ϴ�.");
		if (num >= 10)
			System.out.println("10���� ũ�ų� �����ϴ�.");
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int key = scn.nextInt();
		if(key>100) System.out.println("100���� ũ��");
		
		System.out.println("���̵� �Է��ϼ���");
		String userId = scn.next();
		if(userId.equals("root")) System.out.println("��ſ� ���� �Ǽ���!");
		
		
		scn.close();
	}
}
