package org.java.variable2;

import java.util.Scanner;

public class CircleEx1 {
	public static void main(String[] args) {
		System.out.println("���� ���̸� ���Ͻÿ�");

		Scanner scn = new Scanner(System.in);

		System.out.println("�������� �Է�(������)");
		int radius = scn.nextInt();
		final double PI = 3.14;

//		double CircleNum = radius * radius * PI;
		int CircleNum = (int) (radius * radius * PI);

		System.out.println(radius + " * " + radius + " * " + PI + " = " + (radius * radius * PI));
		System.out.println("�Է��� ������ ���� ���� ���� ���̴� " + (CircleNum) + " �Դϴ�.");
		scn.close();
	}
}
