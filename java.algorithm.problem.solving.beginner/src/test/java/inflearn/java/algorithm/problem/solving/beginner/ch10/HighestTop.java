package inflearn.java.algorithm.problem.solving.beginner.ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 4. 가장 높은 탑 쌓기
 */
public class HighestTop {

  static class Brick implements Comparable<Brick> {

    int width;
    int height;
    int weight;

    public Brick(int width, int height, int weight) {
      this.width = width;
      this.height = height;
      this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
      return o.width - this.width;
    }
  }

  static int solution(int n, List<Brick> list) {
    int answer = 0;

    Collections.sort(list);
    int[] dy = new int[n];

    for (int i = 0; i < n; i++) {
      int max = 0;
      Brick brick = list.get(i);
      for (int j = i - 1; j >= 0; j--) {
        Brick target = list.get(j);
        if (brick.weight < target.weight && max < dy[j]) {
          max = dy[j];
        }
      }
      dy[i] = max+brick.height;
    }

    return Arrays.stream(dy).max().getAsInt();
  }

  public static void main(String[] args) {
    int n = 10;
    List<Brick> list = new ArrayList<>();

    list.add(new Brick(114, 96, 290));
    list.add(new Brick(65, 74, 201));
    list.add(new Brick(261, 19, 105));
    list.add(new Brick(181, 60, 275));
    list.add(new Brick(90, 145, 254));
    list.add(new Brick(286, 118, 64));
    list.add(new Brick(16, 24, 205));
    list.add(new Brick(288, 128, 299));
    list.add(new Brick(96, 36, 74));
    list.add(new Brick(182, 5, 35));
//    int n = 5;
//    List<Brick> list = new ArrayList<>();
//    list.add(new Brick(25, 3, 4));
//    list.add(new Brick(16, 2, 5));
//    list.add(new Brick(9, 2, 3));
//    list.add(new Brick(4, 4, 6));
//    list.add(new Brick(1, 5, 2));

    System.out.println(solution(n, list));
  }
}
