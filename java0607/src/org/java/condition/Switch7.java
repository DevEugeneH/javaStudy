package org.java.condition;

import java.util.Scanner;

public class Switch7 {
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�������� �Է��ϼ���(insert,select,update,delete)");
		
		String input = scn.next();
		
		switch(input) {
		case "insert":
			System.out.println("ȸ������ �������� �̵��մϴ�.");
			break;
		case "select":
			System.out.println("ȸ������ ���� �������� �̵��մϴ�.");
			break;
		case "update":
			System.out.println("ȸ������ ��ȸ �������� �̵��մϴ�.");
			break;
		case "delete":
			System.out.println("ȸ�� ���� ���� �������� �̵��մϴ�.");
			break;
		default:
			System.out.println("���� �������� �Է��ϼž�����");
		}
		
		System.out.println("java2022".charAt(0)); //���ڿ� 0
		System.out.println("java2022".charAt(1)); //���ڿ� 1
		System.out.println("java2022".charAt(2)); //���ڿ� 2
		System.out.println("java2022".charAt(3)); //���ڿ� 3
		System.out.println("java2022".charAt(4)); //���ڿ� 4
	
		
		scn.close();
	}
}
