public class Ex05 {

    public static void main(String[] args) {
        Ex05 ex05 = new Ex05();
        int[] arr = {1,2,3,4};
        int[] arr2 = {5,5};
        System.out.println(ex05.solution(arr));
        System.out.println(ex05.solution(arr2));
    }

    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i<arr.length; i++) {
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}
