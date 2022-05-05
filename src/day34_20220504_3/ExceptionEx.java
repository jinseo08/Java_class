package day34_20220504_3;

import java.util.ArrayList;
import java.util.List;

public class ExceptionEx {

	public static void main(String[] args) {
		// 숫자 나누기 0을 했을 때 발생하는 예외를 확인하여 이에 대한 예외처리 코드를 작성해보십다.

		try {
			System.out.println(2 / 0);
			String a = null;
			System.out.println(a.length());
		} catch (java.lang.ArithmeticException e) {
			System.out.println(" 0으로 나누면 안돼요!!!");
			e.printStackTrace(); // Exception 메세지 출력
		} catch(java.lang.NullPointerException e) {
			System.out.println("NullPointerException 발생!!");
		} catch(Exception e) {
			System.out.println("예측 못한 오류");
		}

	}

}
