package org.java.operator;

import java.util.Scanner;

public class ScannerProject {
	public static void main(String[] args) {
		System.out.println("���� ������ �Է��ϼ���");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���");
		int i1 = scn.nextInt(); //��������
		System.out.println("�Է��Ͻ� ���� ������ " + i1 + "�� �Դϴ�.");
		
		System.out.println("���� ������ �Է��ϼ���.");
		int i2 = scn.nextInt(); //��������
		System.out.println("�Է��Ͻ� ���� ������" + i2 + "���Դϴ�.");
		
		System.out.println("���� ������ �Է��ϼ���.");
		int i3 = scn.nextInt(); //��������
		System.out.println("�Է��Ͻ� ���� ������" + i3 + "���Դϴ�.");
		
		
		System.out.println("����, ����, ���� ������ ������" + (i1+i2+i3) + "�Դϴ�.");
		System.out.println("����, ����, ���� ������ �����" + (double)(i1+i2+i3)/3 + "�Դϴ�.");
		
		
		int ko = scn.nextInt();
		int en = scn.nextInt();
		int ma = scn.nextInt();
		int sum = ko+en+ma;
		double avg = sum/3;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
		scn.close();
	}
}
