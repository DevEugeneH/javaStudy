package org.java.variable;

public class VarEx2 {
	public static void main(String[] args) {
		System.out.println("����, ������ Ÿ��");
		System.out.println("primitive type");
				
		// ������ ������
		byte b = 10; // ������ ������ 1byte�� ������ �� �ִ� ���� b�� �����ϰ�, 10���� �ʱ�ȭ �ߴ�.
		short s = 10; // ������ ������ 2byte�� ������ �� �ִ� ���� s�� �����ϰ�, 10���� �ʱ�ȭ �ߴ�.
		int i = 10; // ������ ������ 4byte�� ������ �� �ִ� ���� i�� �����ϰ�, 10���� �ʱ�ȭ �ߴ�.
		long l = 10l; // ������ ������ 8byte�� ������ �� �ִ� ���� l�� �����ϰ�, 10l�� �ʱ�ȭ �ߴ�.

		// �Ǽ��� ������
		float f = 1.1f; // �Ǽ��� ������ 4byte�� ������ �� �ִ� f�� �����ϰ�, 1.1f�� �ʱ�ȭ�ߴ�.
		double d = 1.1; // �Ǽ��� ������ 8byte�� ������ �� �ִ� d�� �����ϰ�, 1.1�� �ʱ�ȭ�ߴ�.

		// ������ ������
		char ch = 'a'; // ������ ������ 2byte�� ������ �� �ִ� ���� ch�� �����ϰ�, 'a'�� �ʱ�ȭ�ߴ�.

		// ���� ������
		boolean bool = false; // boolean�� 1byte�� ������ �� �ִ� ���� bool�� �����ϰ�, false�� �ʱ�ȭ�ߴ�.
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}
}
