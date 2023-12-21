// alt is better.......................
//n=5
//rows=2n-1                i       c spces,stars l
//    *                    1              4,1
//   * *                   2              3,3
//  * * *                  3              2,5
// * * * *                 4              1,7
//* * * * *                5              0,9
// * * * *                 6 5            1,7
//  * * *                  7 6            2,5
//   * *                   8 7            3,3
//    *                    9 8            4,1
public class starinstar {
    public static void main(String[] args) {
        int n = 5;
        star(n);
    }
    static void star(int n) {
            int k=2*n-1;
            int s,c;
        for (int i = 0; i <k ; i++) {
            if(i<n){
                s=n-i-1;
                c=i*2;
            }
            else{
                s=i-n+1;
                c=(k-i-1)*2;
            }
            for (int j = 0; j <s; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= c; j++) {
                if(j%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}