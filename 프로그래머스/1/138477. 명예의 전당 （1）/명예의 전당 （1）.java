import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[k]; // 명예의 전당
        int size = 0; // 현재 명예의 전당에 들어간 인원 수

        for (int day = 0; day < score.length; day++) {
            if (size < k) { 
                // 초기 k일까지는 그냥 추가
                arr[size] = score[day];
                size++;
            } else {
                // k일 이후는 최하위 점수보다 높으면 교체
                int minIdx = findMinIndex(arr, size);
                if (score[day] > arr[minIdx]) {
                    arr[minIdx] = score[day];
                }
            }

            // 오늘의 최하위 점수 찾기
            answer[day] = arr[findMinIndex(arr, size)];
        }
        return answer;
    }

    // 최하위 점수 인덱스 찾기
    private int findMinIndex(int[] arr, int size) {
        int minIdx = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }
}
