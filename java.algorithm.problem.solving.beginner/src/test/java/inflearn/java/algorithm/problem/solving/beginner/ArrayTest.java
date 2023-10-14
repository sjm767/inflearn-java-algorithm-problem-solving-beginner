package inflearn.java.algorithm.problem.solving.beginner;

import static org.assertj.core.api.Assertions.*;

import inflearn.java.algorithm.problem.solving.beginner.code.ArrayUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArrayTest {

  @Test
  @DisplayName("1. 큰 수 출력하기")
  void printBigInt() {
    List<Integer> list = ArrayUtil.printBigInt(6, new int[]{7, 3, 9, 5, 6, 12});
    List<Integer> expect = new ArrayList<>();
    expect.add(7);
    expect.add(9);
    expect.add(6);
    expect.add(12);

    assertThat(list).isEqualTo(expect);

  }

  @Test
  @DisplayName("2. 보이는 학생")
  void visibleStudents() {
    assertThat(
        ArrayUtil.visibleStudents(8, new int[]{130, 135, 148, 140, 145, 150, 150, 153})).isEqualTo(
        5);
    assertThat(
        ArrayUtil.visibleStudents(10, new int[]{23, 10, 46, 62, 42, 39, 11, 98, 71, 41})).isEqualTo(
        4);
  }

  @Test
  @DisplayName("3. 가위바위보")
  void rockPaperScissors(){
    String[] result1 = ArrayUtil.rockPaperScissors(5, new int[]{2, 3, 3, 1, 3},
        new int[]{1, 1, 2, 2, 3});
    String[] expect1 = new String[]{"A","B","A","B","D"};

    assertThat(result1).isEqualTo(expect1);
  }

  @Test
  @DisplayName("4. 피보나치 수열")
  void fibonacci(){
    int[] result = ArrayUtil.fibonacci(10);
    int[] expect = new int[]{1,1,2,3,5,8,13,21,34,55};

    assertThat(result).isEqualTo(expect);
  }

  @Test
  @DisplayName("5. 에라토스테네스 체")
  void eratosthenes(){
    assertThat(ArrayUtil.eratosthenes(20)).isEqualTo(8);
    assertThat(ArrayUtil.eratosthenes(100000)).isEqualTo(9592);
  }

  @Test
  @DisplayName("6. 뒤집은 소수")
  void reversePrime(){
    List<Integer> result = ArrayUtil.reversePrime(2, new int[]{32,55,62,20,250,370,200,30,100});
    List<Integer> expect  = Arrays.asList(23,2,73,2,3);

    assertThat(result).isEqualTo(expect);
  }

  @Test
  @DisplayName("7. 점수 계산")
  void calculateScore(){
    assertThat(ArrayUtil.calculateScore(10,new int[]{1,0,1,1,1,0,0,1,1,0})).isEqualTo(10);
  }

  @Test
  @DisplayName("8. 등수구하기")
  void rank(){
    assertThat(ArrayUtil.rank(5,new int[]{87,89,92,100,76})).isEqualTo(new int[]{4,3,2,1,5});
  }

  @Test
  @DisplayName("9. 격자판 최대합")
  void maxGridSum(){
    int n = 5;
    int [][]arr={{10,13,10,12,15},{12,39,30,23,11},{11,25,50,53,15},{19,27,29,37,27},{19,13,30,13,19}};

    assertThat(ArrayUtil.maxGridSum(n,arr)).isEqualTo(155);
  }

  @Test
  @DisplayName("10. 봉우리")
  void peak(){
    int n = 5;
    int [][]arr={{5,3,7,2,3},{3,7,1,6,1},{7,2,5,3,4},{4,3,6,4,1},{8,7,3,5,2}};

    assertThat(ArrayUtil.peak(n, arr)).isEqualTo(10);
  }

  @Test
  @DisplayName("11. 임시반장 정하기")
  void tempClassPresident(){
    int n = 5;
    int [][]arr = {{2,3,1,7,3},{4,1,9,6,8},{5,5,2,4,4,},{6,5,2,6,7},{8,4,2,2,2}};

    assertThat(ArrayUtil.tempClassPresident(n, arr)).isEqualTo(4);

  }

  @Test
  @DisplayName("12. 멘토링")
  void mentoring(){


  }

}
