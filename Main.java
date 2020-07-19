import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int num_of_prime = 0;
        for (int i=0;i<cnt;i++) {
            int num = sc.nextInt();
            if (checkPrime(num)) { // 소수 맞으면 조건문 들어감
                num_of_prime++; // 소수 개수 1개 추가
            }
        }
        System.out.println(num_of_prime);
    }

    public static boolean checkPrime(int num) {
        if (num < 2) { // 2보다 작은 소수는 없다.
            return false;
        }
        // i는 num이 소수인지 판별하기 위해 나누어주는 수(2부터 나누어주면 됨)
        for (int i=2;i*i<=num;i++) { //java에서 int의 범위는 -2147483648 ~ 2147483647 (num의 최대 입력인 1000을 충분히 수용가능)
            if (num%i == 0) { // 나누어 떨어지는 수가 존재한다면
                return false; // 소수가 아니다.
            }
        }
        return true; // 위 조건들을 모두 통과한다면 소수 맞음
    }
}
