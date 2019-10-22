import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("몇 번 반복할까요? ");
        int num = in.nextInt();

        int count=0;
        while(num-- > 0) {
            count++;
            System.out.println("반복 ("+count+"회)");
        }
    }
}
/* while 문 사용법
    1. while()
    2. 괄호 안에 조건 작성
    3. block 안에 조건이 만족(참, 1)된 경우
       동작할 반복 패턴 작성
 */
/* num -= 1;
   전위 연산자 : --num;
   후위 연산자 : num--;
   전위 연산자 먼저 계산
 */