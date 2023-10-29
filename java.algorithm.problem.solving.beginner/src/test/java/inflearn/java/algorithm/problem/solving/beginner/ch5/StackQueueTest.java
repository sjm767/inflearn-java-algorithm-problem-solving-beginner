package inflearn.java.algorithm.problem.solving.beginner.ch5;

import static org.assertj.core.api.Assertions.assertThat;

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

  @Test
  @DisplayName("5. 쇠 막대기")
  void ironRod(){
    assertThat(StackQueueUtil.ironRod("()(((()())(())()))(())")).isEqualTo(17);
    assertThat(StackQueueUtil.ironRod("(((()(()()))(())()))(()())")).isEqualTo(24);
  }

  @Test
  @DisplayName("6. 공주구하기")
  void savePrincess(){
    assertThat(StackQueueUtil.savePrincess(8,3)).isEqualTo(7);
  }
  @Test
  @DisplayName("7. 교육과정설계")
  void curriculumDesign(){
    assertThat(StackQueueUtil.curriculumDesign("CBA", "CBDAGE")).isEqualTo("YES");
    assertThat(StackQueueUtil.curriculumDesign("AKDEF", "AYKGDHEJ")).isEqualTo("NO");
  }

  @Test
  @DisplayName("8. 응급실")
  void emergencyRoom(){
    assertThat(StackQueueUtil.emergencyRoom(5, 2, new int[]{60, 50, 70, 80, 90})).isEqualTo(3);
    assertThat(StackQueueUtil.emergencyRoom(6, 3, new int[]{70,60,90,60,60,60})).isEqualTo(4);
  }
}
