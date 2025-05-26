import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int val=0;
		int number=1;
		for(int row=1;row<=num;row++,System.out.println()){
		    if(row%2!=0){
		        val=(num*row)-(num-1);
		    }else{
		        val=num*row;
		    }
		    for(int n=1;n<=num;n++){
		        if(row%2==0){
		            System.out.print(val+" ");
		            val--;
		        }else{
		            System.out.print(val+" ");
		            val++;
		        }
		    }
		 }
	 }
}

-----------------------------------------------
------------------OUTPUT-----------------------
// 5
// 1   2	3 	4	  5
// 10	 9	8	  7 	6
// 11	12	13	14	15
// 20	19	18	17	16
// 21	22	23	24	25
