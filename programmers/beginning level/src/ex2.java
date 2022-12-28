//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

class ex2_v1 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 1; i<n+1; i++){
            if(i%2 == 1){
                answer.add(i);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}

class ex2_v2 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
