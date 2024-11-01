public class Ex08 {
    public static void main(String[] args) {
        Ex08 ex08 = new Ex08();
        System.out.println(ex08.solution(3, 5));
        System.out.println(ex08.solution(3, 3));
        System.out.println(ex08.solution(5, 3));
    }

    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                answer += i;
            }
        }
        return answer;
    }
}