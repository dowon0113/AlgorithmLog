package baekjoon.no27160;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        int N = Integer.parseInt(br.readLine());//펼쳐진 카드 개수
        //과일 종류 별 개수 저장하는 Map (S, X)
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //카드 정보 입력 및 Map 업데이트
        for(int i = 0 ; i < N ; i++){
            String[] str = br.readLine().split(" ");
            String fruit = str[0];
            int count = Integer.parseInt(str[1]);

            //기존 과일 개수에 현재 카드의 개수를 누적
            map.put(fruit, map.getOrDefault(fruit, 0)+count);
        }

        //Map에서 과일 개수가 정확히 5인 경우
        for(int value : map.values()){
            if(value == 5){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
