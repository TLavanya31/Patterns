import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int totalspace=(num*2)-2;
        for(int line=1;line<=num;line++,System.out.println()){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            for(int sp=1;sp<=totalspace;sp++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            totalspace -= 2;
        }
        int totalspaces=0;
        for(int line=num;line>=1;line--,System.out.println()){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            for(int sp=1;sp<=totalspaces;sp++){
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            totalspaces += 2;
        }
    }
}

-----------------------------------------------
------------------OUTPUT-----------------------
// 4
// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * *
// * * * * * * * * 
// * * *     * * * 
// * *         * * 
// *             * 
