package day03;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[8];
		
		int i = 0; 
		int n = 10;
		
		while(n > 0)
		{
			a[i++] = n % 2;
			n /= 2;
		}
		
		for(i = 7; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		
	}

}
