package inflearn.java.algorithm.problem.solving.beginner;

import java.util.*;

public class Main {


  public static List<String> solution(int n, String []str){
    List<String> list = new ArrayList<>();

//    방법1. StringBuilder의 reverse 사용
//    for(String x : str){
//      StringBuilder sb = new StringBuilder(x);
//      list.add(sb.reverse().toString());
//    }

//    //방법2. 직접 뒤집기
    for(String x : str){
      char[] s = x.toCharArray();
      int lt = 0, rt=x.length()-1;

      while(lt < rt){
        char tmp = s[lt];
        s[lt] = s[rt];
        s[rt] = tmp;
        lt++;
        rt--;
      }

      list.add(String.valueOf(s));
    }

    return list;
  }
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

    String[] str = new String[n];
    for(int i=0;i<n;i++){
      str[i] = kb.next();
    }

    for(String x : solution(n,str)){
      System.out.println(x);
    }

  }

}
