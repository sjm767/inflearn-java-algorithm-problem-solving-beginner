package inflearn.java.algorithm.problem.solving.beginner.ch9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1. 씨름 선수
 */
public class KoreanWrestlingPlayer {

  static class Player implements Comparable<Player>{
    int height;
    int weight;

    public Player(int height, int weight) {
      this.height = height;
      this.weight = weight;
    }

    @Override
    public int compareTo(Player o) {
      return o.height - this.height;
    }
  }

  static int solution(int n, List<Player> list) {
    int answer = 0;
    Collections.sort(list);

    int max = Integer.MIN_VALUE;
    for (Player p : list) {
      if(p.weight > max){
        answer++;
        max = p.weight;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int n = 5;
    List<Player> list = new ArrayList<>();

    list.add(new Player(172, 67));
    list.add(new Player(183, 65));
    list.add(new Player(180, 70));
    list.add(new Player(170, 72));
    list.add(new Player(181, 60));

    System.out.println(solution(n, list));
  }
}
