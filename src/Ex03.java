public class Ex03 {
    public static void main(String[] args) {
        Ex03 ex03 = new Ex03();
        System.out.println(ex03.solution(123));
        System.out.println(ex03.solution(987));
    }
    public int solution(int N) {
        int sum = 0;

        while (N > 0) {
            sum += N % 10; // 마지막 자릿수를 더함
            N /= 10;       // 마지막 자릿수를 제거
        }

        return sum;
    }
}

