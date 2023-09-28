package inflearn.java.algorithm.problem.solving.beginner.code;

import java.util.ArrayList;
import java.util.List;

public final class StringUtil {

  private StringUtil(){}

  /**
   *   1. 문자찾기
   */
  public static int findChar(String str, char c){
    int answer = 0;
    str = str.toLowerCase();
    c=Character.toLowerCase(c);

    for(char cc : str.toCharArray()){
      if(c == cc){
        answer++;
      }
    }

    return answer;
  }

  /**
   * 2. 대소문자 변환
   */

  public static String convertChracter(String str){
    StringBuilder sb = new StringBuilder();

    for (char c : str.toCharArray()) {
      if(Character.isLowerCase(c)){
        sb.append(Character.toUpperCase(c));
      }else{
        sb.append(Character.toLowerCase(c));
      }
    }
    return sb.toString();
  }

  /**
   * 3. 문장 속 단어
   */

  public static String longestWord(String str){
    String answer = "";
    int max = Integer.MIN_VALUE;

    //방법1. split을 이용하는 방법
//    String []s = str.split(" ");
//    for(String x : s){
//      if(max < x.length()){
//        max = x.length();
//        answer = x;
//      }
//    }

    //방법2. indexOf와 subString을 이용하는 방법.
    while(str.indexOf(' ') != -1){
      int idx = str.indexOf(' ');
      String word = str.substring(0, idx);

      if(max < word.length()){
        max = word.length();
        answer = word;
      }
      str = str.substring(idx+1);
    }

    if(max < str.length()){
      answer = str;
    }

    return answer;
  }

  /**
   * 4. 단어 뒤집기
   */

  public static List<String> wordReverse(int n, String []str){
    List<String> list = new ArrayList<>();

    //방법1. StringBuilder의 reverse 사용
//    for(String x : str){
//      StringBuilder sb = new StringBuilder(x);
//      list.add(sb.reverse().toString());
//    }
    
    //방법2. 직접 뒤집기
    for(String x : str){
      char[] charArray = x.toCharArray();
      for(int i=0;i<charArray.length/2;i++){
        char temp = charArray[i];
        charArray[i] = charArray[charArray.length-1-i];
        charArray[charArray.length-1-i] = temp;
      }

      list.add(String.valueOf(charArray));
    }

    return list;
  }


}
