package inflearn.java.algorithm.problem.solving.beginner;

import static org.assertj.core.api.Assertions.assertThat;

import inflearn.java.algorithm.problem.solving.beginner.code.StackQueueUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StackQueueTest {

  @Test
  @DisplayName("1. 올바른 괄호")
  void correctParentheses(){
    assertThat(StackQueueUtil.correctParentheses("(()(()))(()")).isEqualTo("NO");
    assertThat(StackQueueUtil.correctParentheses("(())")).isEqualTo("YES");
    assertThat(StackQueueUtil.correctParentheses("()))")).isEqualTo("NO");

  }

  @Test
  @DisplayName("2. 괄호문자제거")
  void removeParentheses() {
    assertThat(StackQueueUtil.removeParentheses("(A(BC)D)EF(G(H)(IJ)K)LM(N)")).isEqualTo("EFLM");
  }

  @Test
  @DisplayName("3. 크레인 인형 뽑기")
  void craneDollPulling(){
    int n =5;
    int [][]arr = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    int m =8;
    int []moves = new int[]{1,5,3,5,1,2,1,4};
    assertThat(StackQueueUtil.craneDollPulling(n, arr, m, moves)).isEqualTo(4);
  }

  @Test
  @DisplayName("4. 후위식 연산(postfix)")
  void postfix() {
    assertThat(StackQueueUtil.postfix("352+*9-")).isEqualTo(12);
  }
}
