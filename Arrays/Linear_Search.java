//Linear search
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
		int id=-1;
		
		for(int i=0;i<n;i++)
		{
		    if(a[i] == k)
		    {
		    id=i;
		    break;
		    }
		}
		if(id!=-1)
		System.out.print("Element found at : "+id);
		else
		System.out.print("Element not found");
	}
}
