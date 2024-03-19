class Solution {
	//int[] numbers = {1,2,3,4,5,6,7,8,9,10}; //메인 메소드에서 실행할 때 10칸짜리 배열을 받아옴 
    public double solution(int[] numbers) {
		double answer = 0;  //배열의 평균값
		int total = 0; //배열의 총합
		for(int i = 0; i < numbers.length; i++) { //0번칸부터 9번칸까지  
			total += numbers[i]; //0~9번칸 까지의 수를 모두 더해줌
		}
		answer = (double)total / numbers.length; //total을 더블로 형변환 해줘야 평균이 소수점까지 나옴
		return answer;//평균값 리턴			
    }
}
