package inflearn.java.algorithm.problem.solving.beginner.ch5;

import java.util.Stack;

/**
 * 3. 크레인 인형뽑기 (카카오)
 */
public class CraneDoll {

  static int solution(int n, int[][] board, int m, int[] moves){
    Stack<Integer> stack = new Stack<>();
    int answer = 0;

    for (int i = 0; i < m; i++) {
      int t = 0;
      int idx = moves[i]-1;
      for(int j=0;j<n;j++){
        if(board[j][idx] != 0){
          t = board[j][idx];
          board[j][idx] = 0;
          break;
        }
      }

      if(t != 0){
        if(!stack.isEmpty() && stack.peek() == t){
          stack.pop();
          answer+=2;
        }else{
          stack.push(t);
        }
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    int n =5;
    int [][]arr = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    int m =8;
    int []moves = new int[]{1,5,3,5,1,2,1,4};

    System.out.println(solution(n, arr, m, moves));

  }

}
