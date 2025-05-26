import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num;col++){
                if(row==1||col==1||row==num||col==num){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

-----------------------------------------------
------------------OUTPUT-----------------------
// 4 
// * * * *
// *     *
// *     *
// * * * *
