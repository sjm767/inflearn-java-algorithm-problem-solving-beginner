package inflearn.java.algorithm.problem.solving.beginner;

import static org.assertj.core.api.Assertions.*;

import inflearn.java.algorithm.problem.solving.beginner.code.StringUtil;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {


  @Test
  @DisplayName("1. 문자찾기")
  void findChar() {

    assertThat(StringUtil.findChar("computerprogramming",'r')).isEqualTo(3);
    assertThat(StringUtil.findChar("tttccttccTT",'T')).isEqualTo(7);

  }

  @Test
  @DisplayName("2. 대소문자 변환")
  void convertChracter() {

    assertThat(StringUtil.convertChracter("StuDY")).isEqualTo("sTUdy");
    assertThat(StringUtil.convertChracter("djkjgKLUOIHkjHGYhUYFUYGjGUYGUYfUFUGUguYURrUHGUYUguOK\n")).isEqualTo("DJKJGkluoihKJhgyHuyfuygJguyguyFufuguGUyurRuhguyuGUok\n");
    assertThat(StringUtil.convertChracter("dkieoYOIUOotokdjgljajYOYOHKGhkgLKJLKJgBlkBlLJ")).isEqualTo("DKIEOyoiuoOTOKDJGLJAJyoyohkgHKGlkjlkjGbLKbLlj");
  }

  @Test
  @DisplayName("3. 문장 속 단어")
  void longestWord(){

    assertThat(StringUtil.longestWord("study")).isEqualTo("study");
    assertThat(StringUtil.longestWord("dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL")).isEqualTo("LKKJLJLJLKJLLLLLLL");
    assertThat(StringUtil.longestWord("it is time to study")).isEqualTo("study");
  }

  @Test
  @DisplayName("4. 단어뒤집기")
  void wordReverse(){
    String []str = {"good","Time","Big"};
    String []str2 = {"dkNBHGKJHKJHKJHKJHKJHKJHKJHsg","djklgjsg","skjglkjkljdlksh","dkjkghlsKJLJLJLKJKsgs"};

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


}
