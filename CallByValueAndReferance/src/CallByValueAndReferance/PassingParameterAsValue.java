package CallByValueAndReferance;

public class PassingParameterAsValue {
	public static int a0=42;
	
	public static void main(String args[])
	{
		// a0=42;
		int [] b=new int [] {7,3,1};
		b[1]=compute1(b[0],b[1],b[2]);// passing by value
		// b=[7,11,1]
		System.out.println("b[1]: "+ b[1] + " a0 :"+ a0); // 11->b[1],a0->42
		
		compute2(b); // passing by reference value of the object
		// b=[7,14,54]
		b=compute3(b,3,b);
		// b=[1,108,54]
		// a0=53
		
	}
	public static int [] compute3(int [] a1,int a2,int [] a3)
	{
		// a0=53
		// a1=[7,14,54]
		// a2=3
		// a3=[7,14,54]
		int a0=a2+7;
		// a0=10
		a1[0]=a0/10;
		// a1=[1,14,54]
		a1[1]=a3[2]*2;
		// a1=[1,108,54]
		return a3;
		// a3=[1,108,54]
	}
	public static int compute1(int a0,int a1,int a2)
	{
		// parameters are local variables
		// passing call-by-value (copy of the value)
		// a0=7
		// a1=3
		// a2=1
		a0=a0+a2+a1; // a0=11
		a1=2*a0; // 22
		a2=a0+a2; // 12
		return a0++;
		
	}
	public static void compute2(int [] a)// local variable a contains reference of b
	// passing call-by-value(copy of the reference)
	{
		// a = [7,11,1]
		a0=a0+a[2]*a[1]; // a0 is class variable ->53
		a[1]=2*a[0]; // 14
		a[2]=a0+a[2]; // 54
		
	
	}

}
