package inflearn.java.algorithm.problem.solving.beginner;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import inflearn.java.algorithm.problem.solving.beginner.code.StringUtil;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {


  @Test
  @DisplayName("1. 문자찾기")
  void findChar() {

    assertThat(StringUtil.findChar("computerprogramming", 'r')).isEqualTo(3);
    assertThat(StringUtil.findChar("tttccttccTT", 'T')).isEqualTo(7);

  }

  @Test
  @DisplayName("2. 대소문자 변환")
  void convertChracter() {

    assertThat(StringUtil.convertChracter("StuDY")).isEqualTo("sTUdy");
    assertThat(StringUtil.convertChracter(
        "djkjgKLUOIHkjHGYhUYFUYGjGUYGUYfUFUGUguYURrUHGUYUguOK\n")).isEqualTo(
        "DJKJGkluoihKJhgyHuyfuygJguyguyFufuguGUyurRuhguyuGUok\n");
    assertThat(
        StringUtil.convertChracter("dkieoYOIUOotokdjgljajYOYOHKGhkgLKJLKJgBlkBlLJ")).isEqualTo(
        "DKIEOyoiuoOTOKDJGLJAJyoyohkgHKGlkjlkjGbLKbLlj");
  }

  @Test
  @DisplayName("3. 문장 속 단어")
  void longestWord() {

    assertThat(StringUtil.longestWord("study")).isEqualTo("study");
    assertThat(StringUtil.longestWord("dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL")).isEqualTo(
        "LKKJLJLJLKJLLLLLLL");
    assertThat(StringUtil.longestWord("it is time to study")).isEqualTo("study");
  }

  @Test
  @DisplayName("4. 단어뒤집기")
  void wordReverse() {
    String[] str = {"good", "Time", "Big"};
    String[] str2 = {"dkNBHGKJHKJHKJHKJHKJHKJHKJHsg", "djklgjsg", "skjglkjkljdlksh",
        "dkjkghlsKJLJLJLKJKsgs"};

    List<String> list = StringUtil.wordReverse(3, str);
    assertThat(list.get(0)).isEqualTo("doog");
    assertThat(list.get(1)).isEqualTo("emiT");
    assertThat(list.get(2)).isEqualTo("giB");

    List<String> list2 = StringUtil.wordReverse(3, str2);
    assertThat(list2.get(0)).isEqualTo("gsHJKHJKHJKHJKHJKHJKHJKGHBNkd");
    assertThat(list2.get(1)).isEqualTo("gsjglkjd");
    assertThat(list2.get(2)).isEqualTo("hskldjlkjklgjks");
    assertThat(list2.get(3)).isEqualTo("sgsKJKLJLJLJKslhgkjkd");
  }

  @Test
  @DisplayName("5. 특정 문자 뒤집기")
  void wordAlphabetReverse() {

    assertThat(StringUtil.wordAlphabetReverse("a#b!GE*T@S")).isEqualTo("S#T!EG*b@a");
    assertThat(StringUtil.wordAlphabetReverse("kdj#@kdjg%$#kdjgk@kd$dk")).isEqualTo(
        "kdd#@kkgj%$#dkgjd@kj$dk");
  }

  @Test
  @DisplayName("6. 중복문자제거")
  void removeDuplicateCharacter() {

    assertThat(StringUtil.removeDuplicateCharacter("ksekkset")).isEqualTo("kset");
    assertThat(
        StringUtil.removeDuplicateCharacter("qiutoiwuotiqpituoiwuiotuowutowiutoityioqp")).isEqualTo(
        "qiutowpy");

  }

  @Test
  @DisplayName("7. 회문 문자열")
  void palindrome() {
    assertThat(StringUtil.palindrome("gooG")).isEqualTo("YES");
    assertThat(StringUtil.palindrome(
        "skSKskuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuKSksks")).isEqualTo("YES");
  }

  @Test
  @DisplayName("8. 유효한 팰린드롬")
  void validPalindrome() {
    assertThat(StringUtil.validPalindrome("found7, time: study; Yduts; emit, 7Dnuof")).isEqualTo(
        "YES");
  }

  @Test
  @DisplayName("9. 숫자만 추출")
  void extractInteger() {
    assertThat(StringUtil.extractInteger("tge0a1h205er")).isEqualTo(1205);
    assertThat(StringUtil.extractInteger("g0en2T0s8eSoft")).isEqualTo(208);
  }

  @Test
  @DisplayName("10. 가장 짧은 문자 거리")
  void shortStringDistance() {
    int[] result = StringUtil.shortStringDistance("teachermode", 'e');
    int[] expect = {1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0};

    assertThat(result.length).isEqualTo(expect.length);

    for (int i = 0; i < result.length; i++) {
      assertThat(result[i]).isEqualTo(expect[i]);
    }
  }
}
