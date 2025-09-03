package ch03.sec01;

public class dkdk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 10의 2진수값
		int num = 10;
		int num2 = 11;
		System.out.println(Integer.toBinaryString(num) + "---" + Integer.toBinaryString(num2));
		System.out.println("---------정수 10의 2진수값----------------");

		// 2진수 1010, 1011에 대한 10진수값
		System.out.println("------2진수 1010,1011에 대한 10진수값----------------");
		byte[] dat = { 0b1010, 0b1011 };
		for (byte b : dat) {
			// int로 출력하면 자동 변환됨
			int val = b;
			System.out.println(val);
		}
		System.out.println("==================================================");
		System.out.println("-------------------------------------------------");
	}

}
