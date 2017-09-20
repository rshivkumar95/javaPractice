class WrapperTest {


	public static void main(String[] args) {
		
		int num=Integer.parseInt(args[0]);
		Double[] arr=new Double[num];
		for(int i=1;i<=num;i++)
		{
			arr[i-1]=Double.parseDouble(args[i]);
		}
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum ::"+sum);

	}
	
}

/*

D:\java\Day4_2Assignmnets\src>javac WrapperTest.java

D:\java\Day4_2Assignmnets\src>java WrapperTest 3 10.5 20.5 30.5
Sum ::61.5

D:\java\Day4_2Assignmnets\src>java WrapperTest 4 10.25 20.25 30.25 40.25
Sum ::101.0

D:\java\Day4_2Assignmnets\src>




*/