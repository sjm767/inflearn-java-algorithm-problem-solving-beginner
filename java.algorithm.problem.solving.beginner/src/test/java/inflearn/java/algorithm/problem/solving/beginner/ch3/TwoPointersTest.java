package inflearn.java.algorithm.problem.solving.beginner.ch3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwoPointersTest {

  @Test
  @DisplayName("1. 두 배열 합치기")
  void mergeArray(){
    assertThat(TwoPointersUtil.mergeArray(3,new int[]{1,3,5},5,new int[]{2,3,6,7,9})).isEqualTo(new int[]{1,2,3,3,5,6,7,9});
    assertThat(TwoPointersUtil.mergeArray(10,new int[]{1,10,27,39,50,61,65,70,93,93},7,new int[]{7,51,65,66,70,82,93})).isEqualTo(new int[]{1,7,10,27,39,50,51,61,65,65,66,70,70,82,93,93,93});

  }

  @Test
  @DisplayName("2. 공통원소 구하기")
  void commonElement(){
    List<Integer> expect = new ArrayList<>(List.of(2,3,5));
    assertThat(TwoPointersUtil.commonElement(35,new int[]{1,3,5,9,2},5,new int[]{3,2,5,7,8})).isEqualTo(expect);
  }

  @Test
  @DisplayName("3. 최대 매출")
  void maxSales(){
    assertThat(TwoPointersUtil.maxSales(10,3,new int[]{12,15,11,20,25,10,20,19,13,15})).isEqualTo(56);
  }

  @Test
  @DisplayName("4. 연속 부분수열")
  void partialSequence(){
    assertThat(TwoPointersUtil.partialSequence(8,6,new int[]{1,2,1,3,1,1,1,2})).isEqualTo(3);
  }

  @Test
  @DisplayName("5. 연속된 자연수의 합")
  void sequentialNaturalNumberSum(){
    assertThat(TwoPointersUtil.sequentialNaturalNumberSum(15)).isEqualTo(3);
    assertThat(TwoPointersUtil.sequentialNaturalNumberSumWithMath(15)).isEqualTo(3);
  }

  @Test
  @DisplayName("6. 최대 길이 연속부분수열")
  void maxLengthContinuousPartialSequence(){
    int result = TwoPointersUtil.maxLengthContinuousPartialSequence(14, 2,
        new int[]{1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1});

    assertThat(result).isEqualTo(8);
  }

}
