public class starinstaralt {
    public static void main(String[] args) {
        int n=5;
        star(5);
    }
    static void star(int n){
        for (int r = 0; r < 2*n; r++) {
            int c;
            if(r>n)
                c=2*n-r;
            else
                c=r;
            int s;
            s=n-c;
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i <c ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}