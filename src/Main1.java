import java.util.*;

public class Main1 {
    static final int MAX_N = 100000; // 최대 설비 개수 (상한선 설정)
    static ArrayList<Integer> a = new ArrayList<>(); // 주요 설비 상태를 저장할 ArrayList
    static int[] aging = new int[MAX_N + 2]; // 노후화 값을 저장할 배열 (여분 공간 포함)
    static ArrayList<Pair> ranking = new ArrayList<>(); // 노후화 정도를 기준으로 정렬할 Pair 리스트
    static int N, Q, K; // 설비 개수, 쿼리 개수, K번째 노후화된 설비 인덱스

    // Pair 클래스 정의: 노후화 정도와 인덱스를 저장
    static class Pair implements Comparable<Pair> {
        int aging; // 노후화 값
        int index; // 설비 인덱스

        // 생성자
        public Pair(int aging, int index) {
            this.aging = aging; // 노후화 값 초기화
            this.index = index; // 설비 인덱스 초기화
        }

        // Comparable 인터페이스 구현: 노후화 값을 기준으로 정렬
        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.aging, other.aging); // 기본 오름차순 정렬
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 초기화
        N = sc.nextInt(); // 설비의 개수 입력
        Q = sc.nextInt(); // 쿼리의 개수 입력
        K = sc.nextInt(); // K번째 노후화된 설비를 찾기 위한 K 입력

        // 설비 상태 입력
        for (int i = 0; i < N; i++) {
            a.add(sc.nextInt()); // 설비 상태를 ArrayList에 추가
        }

        // 쿼리 처리
        for (int i = 0; i < Q; i++) { // Q개의 쿼리 반복
            int s = sc.nextInt(); // 시작 값 입력
            int e = sc.nextInt(); // 끝 값 입력

            // 이진 탐색을 통해 s와 e의 인덱스 찾기
            s = Collections.binarySearch(a, s);
            e = Collections.binarySearch(a, e);

            // 이진 탐색 결과 변환
            if (s < 0) s = -s - 1; // s가 존재하지 않을 경우 적절한 인덱스로 변환
            if (e < 0) e = (-e - 1) - 1; // e가 존재하지 않을 경우 적절한 인덱스로 변환

            if (s > e) continue; // 유효한 인덱스가 아닐 경우 건너뛰기

            // +1 -1 테크닉 사용하여 aging 배열 업데이트
            aging[s] += 1; // s부터 시작하는 설비의 노후화 값 증가
            aging[e + 1] -= 1; // e 다음 인덱스에서 노후화 값 감소
        }

        // 누적합 계산
        for (int i = 1; i <= N; i++) {
            aging[i] += aging[i - 1]; // 각 인덱스의 누적합 계산
        }

        // ranking 리스트에 노후화 값과 인덱스를 저장
        for (int i = 0; i < N; i++) {
            ranking.add(new Pair(-aging[i], i)); // 정렬을 위해 노후화 값에 - 붙임 (내림차순 정렬을 위해)
        }

        // 노후화 정도에 따라 정렬
        Collections.sort(ranking);

        // K번째로 노후화된 설비의 인덱스를 사용하여 결과 출력
        System.out.println(a.get(ranking.get(K).index)); // K번째 설비 상태 출력
        sc.close(); // 스캐너 닫기
    }
}

