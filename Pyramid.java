import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int line=1;line<=num;line++,System.out.println()){
            for(int sp=1;sp<=num-line;sp++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print(" *");
            }
        }
    }
}

-----------------------------------------------
------------------OUTPUT-----------------------
// 3
//   *
//  * *
// * * * 
