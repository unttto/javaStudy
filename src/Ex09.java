public class Ex09 {

    public static void main(String[] args) {
        Ex09 ex09 = new Ex09();
        System.out.println(ex09.solution("pPoooyY"));
        System.out.println(ex09.solution("Pyy"));

    }

    boolean solution(String s) {
        s= s.toLowerCase();

        int p = 0;
        int y = 0;

        for(char c : s.toCharArray()){
            if(c == 'p') p++;
            else if(c=='y') y++;
        }

        if(p!=y) return false;
        else return true;

    }
}
