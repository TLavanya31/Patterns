import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++,System.out.println()){
            for(int j=1;j<=num;j++){
                System.out.print(" * ");
            }
        }
    }
}
-----------------------------------------------
------------------OUTPUT-----------------------
// 3
// * * *
// * * *
// * * *
