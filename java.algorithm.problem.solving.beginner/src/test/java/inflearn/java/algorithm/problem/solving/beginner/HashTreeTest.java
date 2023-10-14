package inflearn.java.algorithm.problem.solving.beginner;

import static org.assertj.core.api.Assertions.assertThat;

import inflearn.java.algorithm.problem.solving.beginner.code.HashTreeUtil;
import inflearn.java.algorithm.problem.solving.beginner.code.TwoPointersUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HashTreeTest {


  @Test
  @DisplayName("1. 학급 회장(해쉬)")
  void classPresident(){
    assertThat(HashTreeUtil.classPresident(15,"BACBACCACCBDEDE")).isEqualTo('C');

  }
  @Test
  @DisplayName("2. 아나그램 (해쉬)")
  void anagram(){
    assertThat(HashTreeUtil.anagram("AbaAeCe","baeeACA")).isEqualTo("YES");
    assertThat(HashTreeUtil.anagram("abaCC","Caaab")).isEqualTo("NO");
  }

  @Test
  @DisplayName("3. 매출액의 종류")
  void salesKind(){
    assertThat(HashTreeUtil.salesKind(7,4, new int[]{20,12,20,10,23,17,10})).isEqualTo(new int[]{3,4,4,3});

  }
}
