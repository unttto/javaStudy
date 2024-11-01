public class Ex07 {
    public static void main(String[] args) {
        Ex07 ex07 = new Ex07();
        System.out.println(ex07.solution(10));
        System.out.println(ex07.solution(12));
    }

    public int solution(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i; // 조건을 만족하는 첫 번째 i를 반환
            }
        }
        return -1; // 만약 조건을 만족하는 i가 없다면 -1 반환
    }
}

