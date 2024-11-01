public class Ex06 {
    public static void main(String[] args) {
        Ex06 ex06 = new Ex06();
        System.out.println(ex06.solution(2,5));
        System.out.println(ex06.solution(4,3));
        System.out.println(ex06.solution(-4,2));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);

    }

    public long[] solution(int x, int n) {

        long[] answer = new long[n];

        for(int i=1; i<=n; i++){
            answer[i-1] = (long)x*i;
        }
        return answer;
    }
}
