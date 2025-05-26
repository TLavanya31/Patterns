import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int line=1;line<=num;line++){
		    for(int n=1;n<=line;n++){
		        System.out.print(n);
		    }
		    System.out.println();
		}
	}
}

-----------------------------------------------
------------------OUTPUT-----------------------
// 5
// 1
// 12
// 123
// 1234
// 12345
