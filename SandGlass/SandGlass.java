package SandGlass;

import java.util.Scanner;

class SandGlass {
    public static void main (String[] args) {
        System.out.print("** 입력하신 숫자 크기 만큼의 모래시계를 출력하는 프로그램입니다. **\n\n");
        int number = getNumber();

        printSandGlass(number);
    }

    /**
     * 숫자를 입력 받는 메서드
     * 
     * Scanner 부분에서 nextInt 메서드 대신 nextLine과 정규표현식으로 검사하는 것을 통해
     * 문자열 입력 시 프로그램 종료되는 것을 방지하도록 개선하면 좋을 듯
     */
    public static int getNumber() {

        int result;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1 ~ 9까지의 숫자를 입력하세요: ");
            result = scanner.nextInt();

            /* 유효한 숫자 입력 시, 해당 값 return (종료) */
            if ( 0 < result && result < 10 ) {
                scanner.close();
                return result;
            }

            /* 유효하지 않은 값은 다시 입력하도록 유도 */
            System.out.println("유효하지 않은 값입니다.");
        }
    }

    /**
     * 모래 시계를 출력하는 메서드 
     * 모래 시계의 사이즈는 입력받은 숫자(n)의 (2n-1) * (2n-1) 크기의 정사각형 판이다.
     * 
     * ex)
     * 1: *
     * 
     * 2: ***
     *     *
     *    ***
     * 
     * 3: *****
     *     ***
     *      *
     *     ***
     *    *****
     */
    public static void printSandGlass (int num) {
        
        /* 모래시계 윗 부분 출력 */
        for (int line = 0; line < num; line++) {
            
            /* space 출력. line idx 만큼 출력 */
            for (int sp = 0; sp < line; sp++)
                System.out.print(' ');

            /* 별 모양 출력. 2(전체 가로 길이 - line idx) - 1 만큼 출력 */
            for (int st = (2 * (num - line) - 1); st > 0; st--)
                System.out.print('*');

            System.out.println("");
        }
        
        /* 모래시계 아래 부분 출력 */
        for (int line = 0; line < (num - 1); line++) {

            /* space 출력. num - 2 - line idx 만큼 출력 */
            for (int sp = num - 2; sp > line; sp--)
                System.out.print(' ');

            /* 별 모양 출력. line idx * 2 + 1 만큼 출력 */
            for (int st = 0; st < 2 * (line + 1) + 1; st++ )
                System.out.print('*');

            System.out.println("");
        }

    } // end method printSandGlass
} // end class SandGlass