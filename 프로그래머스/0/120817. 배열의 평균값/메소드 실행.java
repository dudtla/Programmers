package main;

import solution.Solution;

public class Main {

	public static void main(String[] args) {
		
		Solution s = new Solution(); //솔루션 객체를 만듦
		int[] numbers = {1,2,3,4,5,6,7,8,9,10}; //솔루션에 인자값을 넣어줌
		double result = s.solution(numbers); //결과 변수를 만들고 솔루션 메소드의 리턴값(배열의 평균)넣어줌
		System.out.println(result);
	}
	
}
