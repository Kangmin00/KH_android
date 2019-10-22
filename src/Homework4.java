import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("몇 번째 항까지 진행할까요? ");
        int ans = in.nextInt();

        int fir = 1, sec = 1, thr = 3;
        int i = 0;

        while(i < ans) {
            if(i == 0) System.out.print(fir + " ");
            else if(i == 1) System.out.print(sec + " ");
            else if(i == 2) System.out.print(thr + " ");
            else {
                int tmp = fir + thr;
                fir = sec;
                sec = thr;
                thr = tmp;
                System.out.print(thr + " ");
            }
            i++;
        }

        /*while(i++ < ans) {
            System.out.print(fir+" "+sec+" "+thr+" ");
            fir += thr;
            sec += fir;
            thr += sec;
        }*/
    }
}
