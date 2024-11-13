public class Ex01 {
    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        System.out.println(ex01.solution(12));
        System.out.println(ex01.solution(5));
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
