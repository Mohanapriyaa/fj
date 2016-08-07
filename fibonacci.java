import java.util.Scanner;


public class fibonacci {

	
	public static void main(String[] args) {
		int i=0,j=1,next = 0,c;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(c=0;c<n;c++)
		{
			if(c<=1)
			{
				next=c;
			}
			else
			{
				
			next=i+j;
			i=j;
			j=next;
		}
			System.out.println(next);
	}

}
}