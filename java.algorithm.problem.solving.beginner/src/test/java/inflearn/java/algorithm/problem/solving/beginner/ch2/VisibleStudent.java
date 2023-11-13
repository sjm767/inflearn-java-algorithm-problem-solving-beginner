package inflearn.java.algorithm.problem.solving.beginner.ch2;

/**
 * 2. 보이는 학생
 */
public class VisibleStudent {


  static int solution(int n,int[] arr) {
    int answer = 0;

    int max = Integer.MIN_VALUE;

    for (int stu : arr) {
      if (stu > max) {
        answer++;
        max = stu;
      }
    }

    return answer;
  }
  public static void main(String[] args) {
    int n = 8;
    int []arr = {130,135,148,140,145,150,150,153};

    System.out.println(solution(n, arr));

  }
}
