package transportprotocol;

public class TestDriverforSimpleRoundTrip{
	
	public static void main(String[] args) 
	
	{
		testCase1();}
	
	
	
    public static void testCase1()
    
    {
    
	Transport obj = new Transport();
	
	obj.T2();
	obj.T7();
	obj.T21();
	obj.T2();
	obj.T7();
	obj.T21();
	obj.T1();
	obj.T4();
	obj.T19();
	obj.T1();
	obj.T3();
	obj.T8();
	obj.T17();
	obj.T19();
	obj.T1();
	obj.T3();
	obj.T17();
	obj.T26();
	System.out.println("Testcase1 reaches state:"+obj._fsm.getState().getName());

}
}
