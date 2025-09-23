class Solution
{
public int solution(int N, int A, int B) {
    int posA = A - 1;
    int posB = B - 1;
    int round = 0;
    
    while (posA != posB) {
        posA /= 2;
        posB /= 2;
        round++;
    }
    
    return round;
}
}