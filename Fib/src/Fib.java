
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		System.out.print(a + " " + b);
		for(int i=0;i<20;i++)
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
	}

}
