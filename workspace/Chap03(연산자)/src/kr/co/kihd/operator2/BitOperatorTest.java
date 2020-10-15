package kr.co.kihd.operator2;

public class BitOperatorTest {

	public static void main(String[] args) {
		
		// @, |, ^ 3개를 비트연산자라고 한다.
		int x = 8, y = 5;
		
		System.out.println("x를 2진수로 변환한 결과 : " + Integer.toBinaryString(x));
		System.out.println("y를 2진수로 변환한 결과 : " + Integer.toBinaryString(y));
		
		// And 연산은 둘 다 1일때만 1을 반환
		// OR 연산은 하나라도 1이면 1을 반환
		System.out.println("x와 y를 비트 &(AND) 연산 결과 : " + (x & y));
		System.out.println("x와 y를 비트 |(OR) 연산 결과 : " + (x | y));
		System.out.println("x와 y를 배타적논리합 ^(XOR) 연산 결과 : " + (x ^ y));
	}

}
