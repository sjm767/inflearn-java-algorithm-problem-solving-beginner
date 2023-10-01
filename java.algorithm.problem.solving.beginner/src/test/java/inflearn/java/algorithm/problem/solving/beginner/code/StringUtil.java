package inflearn.java.algorithm.problem.solving.beginner.code;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public final class StringUtil {

  private StringUtil() {
  }

  /**
   * 1. 문자찾기
   */
  public static int findChar(String str, char c) {
    int answer = 0;
    str = str.toLowerCase();
    c = Character.toLowerCase(c);

    for (char cc : str.toCharArray()) {
      if (c == cc) {
        answer++;
      }
    }

    return answer;
  }

  /**
   * 2. 대소문자 변환
   */

  public static String convertChracter(String str) {
    StringBuilder sb = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (Character.isLowerCase(c)) {
        sb.append(Character.toUpperCase(c));
      } else {
        sb.append(Character.toLowerCase(c));
      }
    }
    return sb.toString();
  }

  /**
   * 3. 문장 속 단어
   */

  public static String longestWord(String str) {
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
    while (str.indexOf(' ') != -1) {
      int idx = str.indexOf(' ');
      String word = str.substring(0, idx);

      if (max < word.length()) {
        max = word.length();
        answer = word;
      }
      str = str.substring(idx + 1);
    }

    if (max < str.length()) {
      answer = str;
    }

    return answer;
  }

  /**
   * 4. 단어 뒤집기
   */

  public static List<String> wordReverse(int n, String[] str) {
    List<String> list = new ArrayList<>();

    //방법1. StringBuilder의 reverse 사용
//    for(String x : str){
//      StringBuilder sb = new StringBuilder(x);
//      list.add(sb.reverse().toString());
//    }

    //방법2. 직접 뒤집기
    for (String x : str) {
      char[] charArray = x.toCharArray();
      for (int i = 0; i < charArray.length / 2; i++) {
        char temp = charArray[i];
        charArray[i] = charArray[charArray.length - 1 - i];
        charArray[charArray.length - 1 - i] = temp;
      }

      list.add(String.valueOf(charArray));
    }

    return list;
  }

  /**
   * 5. 특정 문자 뒤집기
   *
   * @param str
   * @return
   */
  public static String wordAlphabetReverse(String str) {
    String answer = "";
    int lt = 0;
    int rt = str.length() - 1;

    char c[] = str.toCharArray();

    while (lt < rt) {

      if (!Character.isAlphabetic(c[lt])) {
        lt++;
      } else if (!Character.isAlphabetic(c[rt])) {
        rt--;
      } else {
        char tmp = c[lt];
        c[lt] = c[rt];
        c[rt] = tmp;

        lt++;
        rt--;
      }
    }

    answer = String.valueOf(c);
    return answer;

  }

  /**
   * 6. 중복문자제거
   *
   * @param str
   * @return
   */
  public static String removeDuplicateCharacter(String str) {
    String answer = "";

    //방법1. Set 사용
//    Set<Character> set = new HashSet<>();
//
//    for(char x : str.toCharArray()){
//      if(!set.contains(x)){
//        set.add(x);
//        answer+=x;
//      }
//    }

    //방법2. indexOf, CharAt으로 구현

    for (int i = 0; i < str.length(); i++) {
      if (i == str.indexOf(str.charAt(i))) {
        answer += str.charAt(i);
      }
    }
    return answer;
  }

  /**
   * 7. 회문 문자열
   *
   * @param str
   * @return
   */
  public static String palindrome(String str) {
    String answer = "YES";
    //방법1. 직접 뒤집기
    int lt = 0;
    int rt = str.length() - 1;

    str = str.toUpperCase();

    while (lt < rt) {
      if (!(str.charAt(lt) == str.charAt(rt))) {
        return "NO";
      }
      lt++;
      rt--;
    }
    return answer;
  }

  /**
   * 8. 유효한 팰린드롬
   *
   * @param str
   * @return
   */
  public static String validPalindrome(String str) {
    str = str.toUpperCase().replaceAll("[^A-Z]", "");
    String tmp = new StringBuilder(str).toString();

    return (tmp.equals(str)) ? "YES" : "NO";
  }

  /**
   * 9. 숫자만 추출
   *
   * @param str
   * @return
   */
  public static int extractInteger(String str) {
    int answer = 0;

    //방법1
//    str = str.toUpperCase().replaceAll("[A-Z]","");
//    answer = Integer.parseInt(str);

    //방법2. 직접 처리하기 (ascii문자열에서 숫자는 48-57 사이이다)

    for (char c : str.toCharArray()) {
      if (c >= 48 && c <= 57) {
        answer = answer * 10 + (c - 48);
      }
    }

    return answer;
  }

  /**
   * 10. 가장 짧은 문자 거리
   *
   * @param s
   * @param c
   * @return
   */
  public static int[] shortStringDistance(String s, char c) {
    int[] answer = new int[s.length()];
    int p = 1000;

    //왼쪽에서 오른쪽으로
    for(int i=0;i<s.length();i++){
      if(s.charAt(i) == c){
        p=0;
      }else{
        p++;
      }
      answer[i] = p;
    }
    
    //오른쪽에서 왼쪽으로
    p=1000;
    for(int i=s.length()-1;i>=0;i--){
      if(s.charAt(i) == c){
        p=0;
        answer[i] = p;
      }else{
        p++;
        answer[i] = Math.min(answer[i], p);
      }
    }
    return answer;
  }

  /**
   * 문자열 압축
   * @param s
   * @return
   */
  public static String compressString(String s){
    String answer = "";
    int cnt = 1;

    for(int i=0;i<s.length()-1;i++){
      if(s.charAt(i) == s.charAt(i+1)){
        cnt++;
      }else{
        answer += ""+s.charAt(i);
        if(cnt > 1){
          answer += cnt;
        }
        cnt = 1;
      }
    }

    answer+=s.charAt(s.length()-1);
    if(cnt > 1){
      answer += cnt;
    }

    return answer;
  }

  /**
   * 12. 암호
   * @param n
   * @param s
   * @return
   */
  public static String password(int n, String s) {
    String answer = "";
    List<String> list = new ArrayList<>();

    while(s.length()>0){
      list.add(s.substring(0, 7));
      s = s.substring(7);
    }

    for (String str : list) {
      String b = str.replace("#","1").replace("*","0");
      char c = (char)Integer.parseInt(b,2);
      answer+=c;
    }

    return answer;
  }

}
