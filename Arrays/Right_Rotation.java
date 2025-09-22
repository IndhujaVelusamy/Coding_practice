//right rotation
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		a[i] = sc.nextInt();
		int k=sc.nextInt();
		int newIndex=0;
		int res[] = new int[n];
		for(int i=0;i<n;i++)
		{
		     newIndex = (i+k)%n;
		     res[newIndex] = a[i];
		}
		for(int i=0;i<n;i++)
		{
		    a[i] = res[i];
		    System.out.print(a[i]+" ");
		    
		}
		
		
	}
}
