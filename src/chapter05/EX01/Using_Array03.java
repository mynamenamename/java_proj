package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		 //한국을 빛낸 5명의 위인들만 s String 배열에 저장 후 4가지로 출력
		
		
		String [] s = new String [5];
		
		s[0] = "세종대왕";
		s[1] = "신사임당";
		s[2] = "이순신";
		s[3] = "정약용";
		s[4] = "이성계";
	
		//1.
		System.out.println(s[0]);
		for(int i=1 ; i < s.length ; i++) {
			System.out.println(s[i]);
		}
		

		System.out.println("=========");
		
		//2.
		for (String k:s) {
			System.out.println(k);
		}
		

		System.out.println("=========");
		
		//3.
		System.out.println(Arrays.toString(s));
		
	}

}
