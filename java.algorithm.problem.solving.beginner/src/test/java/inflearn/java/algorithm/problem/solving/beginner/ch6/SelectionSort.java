package inflearn.java.algorithm.problem.solving.beginner.ch6;

/**
 * 1. 선택 정렬
 */
public class SelectionSort {

    static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {13, 5, 11, 7, 23, 15};

        int[] answer = solution(n, arr);
        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
