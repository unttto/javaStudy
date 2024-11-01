public class Ex02 {
    public static void main(String[] args) {
        Ex02 ex02 = new Ex02();
        System.out.println(ex02.solution(12));
        System.out.println(ex02.solution(5));
    }
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) {
                answer += i;
            }
        }
        return answer;
    }
}
