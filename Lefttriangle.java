import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++,System.out.println()){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");//(j)for number
            }
        }
    }
}

-----------------------------------------------
------------------OUTPUT-----------------------
// 3
// *
// * *
// * * *
