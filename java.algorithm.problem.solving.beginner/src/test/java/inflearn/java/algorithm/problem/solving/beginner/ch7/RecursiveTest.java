package inflearn.java.algorithm.problem.solving.beginner.ch7;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecursiveTest {

  @Test
  @DisplayName("1. 재귀함수")
  void print(){
    int n = 3;
    RecursiveUtil.print(n);
  }
  @Test
  @DisplayName("2. 이진수 출력(재귀")
  void binaryNumber(){
    int n = 11;
    RecursiveUtil.binaryNumber(n);
  }

  @Test
  @DisplayName("3. 팩토리얼")
  void factorial(){
    int n = 5;
    assertThat(RecursiveUtil.factorial(n)).isEqualTo(120);
  }

}
