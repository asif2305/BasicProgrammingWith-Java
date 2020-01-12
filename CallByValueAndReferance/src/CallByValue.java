
public class CallByValue {

	int data=100;
    void callByValuechange(int data)
    {
    	data=data+100; // change will be the local variable only
    	System.out.println("inside method  "+ data);
    }
    
    void callByReferanceChange(CallByValue str)
    {
    	data=this.data+100; // change will be the local variable only
    }
	public static void main(String[] args) {
		
	CallByValue objCallByValue=new CallByValue();
	System.out.println("Before Change "+ objCallByValue.data);
	objCallByValue.callByValuechange(300);
	System.out.println("After change "+ objCallByValue.data);
	
	
	
	CallByValue objCallByReferance=new CallByValue();
	System.out.println("Before Change "+ objCallByReferance.data);
	objCallByReferance.callByReferanceChange(objCallByReferance);
	System.out.println("After change "+ objCallByReferance.data);
		

	}

}
