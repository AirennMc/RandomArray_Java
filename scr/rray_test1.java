import java.util.Random;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class rray_test1 
{
	public static void main(String[] args) 
	{
		while (true)
		{
			Scanner sc=new Scanner(System.in);
			int input=sc.nextInt();
			//输入非零整数
			if (input != 0)
			{
				arrayset();
			}
		}
	}

	private static void arrayset()
	{
		int a[] = new int[6];
		//01-33
		int i,x;
		for(i = 0 ; i<6 ; i++)
			{
			 Random random = new Random();
			 int arr_ele = random.nextInt(33) + 1;
			 if (i>0)
			 {			 
				 for (x = 0; x<=i ; x++)
				 {
						while(a[x] == arr_ele)
						{
							arr_ele = random.nextInt(33) + 1;
						}
				 }
			 }
			 a[i] = arr_ele;
			}
			Arrays.sort(a);
			int along = Array.getLength(a);
			int y;
			for (y = 0; y < along; y++)
			{
				System.out.print(a[y] + " ");
			}
			System.out.println("");
	}
}
