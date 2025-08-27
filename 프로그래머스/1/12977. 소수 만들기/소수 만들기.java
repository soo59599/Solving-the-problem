import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        Arrays.sort(nums);

        int N = 0;
        for(int i = nums.length - 1; i >= nums.length-3; i--){
            N +=  nums[i];
        }

        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i)
                    isPrime[j] = false;
            }
        }

                for(int j = 0 ; j < nums.length -2; j++){
                    for(int k = j+1; k < nums.length -1;k++){
                        for(int l = k+1; l < nums.length;l++){
                            if(isPrime[(nums[j] + nums[k] + nums[l])]){
                                answer += 1;
                            }
                        }
                    }
                }


        return answer;
    }
}
