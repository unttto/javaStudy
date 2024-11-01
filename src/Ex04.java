public class Ex04 {
    public static void main(String[] args) {
        Ex04 ex04 = new Ex04();
        System.out.println(ex04.solution(3));
        System.out.println(ex04.solution(4));
    }
    public String solution(int num) {
        String answer = "";
        if(num %2 ==0) answer="Even";
        else answer="Odd";

        return answer;
    }
}
