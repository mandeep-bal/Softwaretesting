package transportprotocol;

public class TestDriverforEdgeAlgo2 {

			public static void main(String[] args) 
			{
				testCase1();
				testCase2();
				testCase3();
				testCase4();
				testCase5();
				testCase6();
			}

			public static void testCase1()
			{
				Transport obj = new Transport();
				obj.T2();
				obj.T7();
				obj.T21();
				obj.T1();
				obj.T4();
				obj.T19();
				obj.T2();
				obj.T6();
				obj.T9();
				obj.T11();
				obj.T13();
				obj.T15();
				obj.T17();
				obj.T20();
				obj.T22();
				System.out.println("Testcase1 reaches state:"+obj._fsm.getState().getName());
			}
		public static void testCase2()
			{
				Transport obj = new Transport();
				obj.T1();
				obj.T5();
				obj.T1();
				obj.T3();
				obj.T8();
				obj.T10();
				obj.T12();
				obj.T14();
				obj.T16();
				obj.T18();
				obj.T27();
				
				System.out.println("Testcase2 reaches state:"+obj._fsm.getState().getName());
			}
		public static void testCase3()
			{
				Transport obj = new Transport();
				obj.T1();
				obj.T23();	
				System.out.println("Testcase3 reaches state:"+obj._fsm.getState().getName());
			}
		public static void testCase4()
			{
				Transport obj = new Transport();
				obj.T2();
				obj.T24();
			
				
			
				System.out.println("Testcase4 reaches state:"+obj._fsm.getState().getName());
			}
		public static void testCase5()
			{
				Transport obj = new Transport();
				obj.T1();
				obj.T3();
				obj.T25();
				System.out.println("Testcase5 reaches state:"+obj._fsm.getState().getName());
			}
		public static void testCase6()
			{
				Transport obj = new Transport();
				obj.T1();
				obj.T4();
				obj.T26();
				
			
				System.out.println("Testcase6 reaches state:"+obj._fsm.getState().getName());
			}
		
			}
