class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++ ) { //i부터 n까지 1씩 더해가며 반복한다
			if(i % 2 == 0) { //i를 2로 나누었을 때 나누어 떨어지면 i를 더해준다. 
				answer += i;
			}
			
		}
        return answer;
    }
}
