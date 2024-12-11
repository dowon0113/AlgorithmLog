package baekjoon.no10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //단어 수 입력받음
        int n = Integer.parseInt(br.readLine());

        //중복을 제거하기 위해 Set 사용
        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            //단어를 입력받음
            String s = br.readLine();

            set.add(s);//입력받은 단어를 Set에 추가

            //입력받은 단어를 뒤집어서 새로운 문자열 만듦
            StringBuilder sb = new StringBuilder(s);
            String reverse = sb.reverse().toString();

            if(set.contains(reverse)){
                System.out.println(reverse.length() + " " + reverse.charAt(reverse.length()/2));
                break;//비번 찾았으므로 반복문 종료
            }
        }
    }
}
