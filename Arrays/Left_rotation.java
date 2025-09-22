//Left rotation 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		a[i] = sc.nextInt();
		int k = sc.nextInt();
		k=k%n;
		
		int res[] = new int[n];
		int newIndex=0;
		for(int i=0;i<n;i++)
		{
		    newIndex=(i-k+n)%n;
		    res[newIndex] = a[i];
		}
		for(int i=0;i<n;i++)
		{
		    
		    System.out.print(res[i]+" ");
		}
		
	}
}
