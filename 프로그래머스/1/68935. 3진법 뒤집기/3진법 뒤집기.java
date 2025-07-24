class Solution {
    public double solution(int n) {
        double answer = 0;
        double v = n;
        double bigPow = Math.floor(Math.log(v) / Math.log(3));
        double[] arr = new double[(int)bigPow+1];

        while (v != 0) {
            bigPow = Math.floor(Math.log(v) / Math.log(3));
            arr[(int)bigPow]++;
            v = v - Math.pow(3, bigPow);
        }

        for (int i  = 0; i < arr.length/2; i++) {
            double temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }

        for (int i  = 0; i < arr.length; i++) {
            answer += Math.pow(3, i)* arr[i];
        }

        System.out.println(answer);

        return answer;
    }
}