package transportprotocol;

public class TestDriverforNode {

	
		public static void main(String[] args) 
		{
			testCase1();
			testCase2();
			testCase3();
			testCase4();
			testCase5();
			testCase6();
			testCase7();
			testCase8();
			testCase9();
			testCase10();
			testCase11();
			testCase12();
			testCase13();
			
		}

		public static void testCase1()
		{
			Transport obj = new Transport();
			obj.T2();
			obj.T7();
			obj.T21();
			obj.T22();
		
			System.out.println("Testcase1 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase2()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T4();
			obj.T19();
			obj.T22();
		
			System.out.println("Testcase2 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase3()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T4();
			obj.T20();
			obj.T22();
		
			System.out.println("Testcase3 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase4()
		{
			Transport obj = new Transport();
			obj.T2();
			obj.T6();
			obj.T25();
			
		
			System.out.println("Testcase4 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase5()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T8();
			obj.T25();
		
			System.out.println("Testcase5 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase6()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T9();
			obj.T25();
		
			System.out.println("Testcase6 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase7()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T10();
			obj.T25();
		
			System.out.println("Testcase7 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase8()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T11();
			obj.T25();
		
			System.out.println("Testcase8 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase9()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T12();
			obj.T25();
		
			System.out.println("Testcase9 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase10()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T13();
			obj.T25();
		
			System.out.println("Testcase10 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase11()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T14();
			obj.T25();
		
			System.out.println("Testcase11 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase12()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T15();
			obj.T25();
		
			System.out.println("Testcase12 reaches state:"+obj._fsm.getState().getName());
		}
	public static void testCase13()
		{
			Transport obj = new Transport();
			obj.T1();
			obj.T3();
			obj.T16();
			obj.T25();
		
			System.out.println("Testcase13 reaches state:"+obj._fsm.getState().getName());
		}
		}
