import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int number=1;
		for(int line=1;line<=num;line++,System.out.println()){
		    for(int n=1;n<=line;n++){
		        System.out.print(number+" ");
		        number++;
		    }
		}
	}
}

-----------------------------------------------
------------------OUTPUT-----------------------
// 3
// 1
// 2 3
// 3 4 5
