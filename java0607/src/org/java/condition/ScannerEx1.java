package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("�������� �Է��ϼ���(insert, update, select, delete");

		String query = scn.nextLine();

		if (query.equals("insert")) {
			System.out.println("ȸ�� ���� �������� �̵��մϴ�.");
		} else if (query.equals("update")) {
			System.out.println("ȸ�� ���� �������� �̵��մϴ�.");
		} else if (query.equals("select")) {
			System.out.println("ȸ�� ��ȸ �������� �̵��մϴ�.");
		} else if (query.equals("delete")) {
			System.out.println("ȸ�� Ż�� �������� �̵��մϴ�.");
		} else {
			System.out.println("���� �������� �Է��ϼž�����");
		}

//		CRUD (Create, Read, Update, Delete)
		
		scn.close();
	}
}
