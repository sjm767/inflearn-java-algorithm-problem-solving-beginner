package inflearn.java.algorithm.problem.solving.beginner;

import inflearn.java.algorithm.problem.solving.beginner.code.SortAndSearchUtil;
import inflearn.java.algorithm.problem.solving.beginner.code.SortAndSearchUtil.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortAndSearchTest {

  @Test
  @DisplayName("1. 선택 정렬")
  void selectionSort() {
    int n = 6;
    int[] arr = {13, 5, 11, 7, 23, 15};
    Assertions.assertThat(SortAndSearchUtil.selectionSort(n, arr))
        .isEqualTo(new int[]{5, 7, 11, 13, 15, 23});
  }

  @Test
  @DisplayName("2. 버블 정렬")
  void bubbleSort() {
    int n = 6;
    int[] arr = {13, 5, 11, 7, 23, 15};
    Assertions.assertThat(SortAndSearchUtil.bubbleSort(n, arr))
        .isEqualTo(new int[]{5, 7, 11, 13, 15, 23});
  }

  @Test
  @DisplayName("3. 삽입 정렬")
  void insertionSort() {
    int n = 6;
    int[] arr = {11, 7, 5, 6, 10, 9};
    Assertions.assertThat(SortAndSearchUtil.insertionSort(n, arr))
        .isEqualTo(new int[]{5, 6, 7, 9, 10, 11});
  }

  @Test
  @DisplayName("4. Least Recently Used")
  void leastRecentlyUsed() {
    int s = 5;
    int n = 9;
    int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};
    int[] expect = {7, 5, 3, 2, 6};

    Assertions.assertThat(SortAndSearchUtil.leastRecentlyUsed(s, n, arr))
        .isEqualTo(expect);
  }

  @Test
  @DisplayName("5. 중복 확인")
  void checkDuplicate() {
    int n = 8;
    int[] arr = {20, 25, 52, 30, 39, 33, 43, 33};

    Assertions.assertThat(SortAndSearchUtil.checkDuplicate(n, arr)).isEqualTo("D");
  }

  @Test
  @DisplayName("6. 장난꾸러기")
  void prankster(){
    int n=9;
    int []arr = {120,125,152,130,135,135,143,127,160};

    Assertions.assertThat(SortAndSearchUtil.prankster(n, arr)).isEqualTo(new int[] {3,8});
  }

  @Test
  @DisplayName("7. 좌표 정렬")
  void compareTo(){
    int n=5;
    List<Point> list = new ArrayList<>();
    list.add(new Point(2, 7));
    list.add(new Point(1, 3));
    list.add(new Point(1, 2));
    list.add(new Point(2, 5));
    list.add(new Point(3, 6));
    Collections.sort(list);

    List<Point> expect = new ArrayList<>();
    expect.add(new Point(1, 2));
    expect.add(new Point(1, 3));
    expect.add(new Point(2, 5));
    expect.add(new Point(2, 7));
    expect.add(new Point(3, 6));

    Assertions.assertThat(SortAndSearchUtil.compareTo(n, list)).isEqualTo(expect);
  }

}
