package cruisecontrol;
public class TestDriverforNode
{
public static void main(String[] args) 	
{
		TestCase1();
		TestCase2();
		TestCase3();
		TestCase4();
		TestCase5();
		TestCase6();
		TestCase7();
		TestCase8();
                TestCase9();
                TestCase10();
		TestCase11();
		TestCase12();	
                TestCase13();
		TestCase14();
		TestCase15();
		TestCase16();
		TestCase17();
		TestCase18();
		TestCase19();
		TestCase20();
                TestCase21();
		TestCase22();
		TestCase23();
               }

	public static void TestCase1()
	{
		 Cruise obj = new Cruise();
		obj.T1(); 
obj.EndInactive();

		System.out.println("TestCase1 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase2()
	{
		Cruise obj = new Cruise();
		obj.T2(); 
obj.EndInactive();

		System.out.println("TestCase2 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase3()
	{
		Cruise obj = new Cruise();
		obj.T3();
 obj.EndInactive();

		System.out.println("TestCase3 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase4()
	{
		Cruise obj = new Cruise();
		obj.T7();
obj.EndInactive();

		System.out.println("TestCase4 reaches state:"+obj._fsm.getState().getName());
	}

	public static void TestCase5()
	{
		Cruise obj = new Cruise();
		obj.T6(); 
obj.EndInactive();

		System.out.println("TestCase5 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase6()
	{
		Cruise obj = new Cruise();
		obj.T4(); 
obj.EndInactive();

		System.out.println("TestCase6 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase7()
	{
		Cruise obj = new Cruise();
		obj.T5();
 obj.T14(); 
obj.T19(); 
obj.T22(); 
obj.EndInactive();

		System.out.println("TestCase7 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase8()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T9(); 
obj.EndActive();
		
		System.out.println("TestCase8 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase9()
	{
		Cruise obj = new Cruise();
	       	obj.T5(); 
obj.T10(); 
obj.EndActive();

		System.out.println("TestCase9 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase10()
	{
		Cruise obj = new Cruise();
                obj.T5(); 
obj.T11(); 
obj.EndActive();
				
		System.out.println("TestCase10 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase11()
	{
		Cruise obj = new Cruise();
                obj.T5(); 
obj.T12(); 
obj.EndActive();
				
		System.out.println("TestCase11 reaches state:"+obj._fsm.getState().getName());
	}
	 public static void TestCase12()
	{
		Cruise obj = new Cruise();
                obj.T5(); 
obj.T13(); 
obj.EndActive();
				
		System.out.println("TestCase12 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase13()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14();
obj.T16(); obj.EndCrusing();
			
		System.out.println("TestCase13 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase14()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T17(); 
obj.EndCrusing();
			
		System.out.println("TestCase14 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase15()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T18(); 
obj.EndCrusing();
			
		System.out.println("TestCase15 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase16()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T27(); 
obj.EndCrusing();
			
		System.out.println("TestCase16 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase17()
	{
		Cruise obj = new Cruise();
               	obj.T5();
obj.T14();
obj.T19();
obj.T28();
obj.EndCrusing();
			
		System.out.println("TestCase17 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase18()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T20(); 
obj.EndStandby();
			
		System.out.println("TestCase18 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase19()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T21(); 
obj.EndStandby();
			
		System.out.println("TestCase19 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase20()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T24(); 
obj.EndStandby();
			
		System.out.println("TestCase20 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase21()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T25(); 
obj.EndStandby();
			
		System.out.println("TestCase21 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase22()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T23(); 
obj.EndStandby();
			
		System.out.println("TestCase22 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase23()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T26(); 
obj.EndStandby();
			
		System.out.println("TestCase23 reaches state:"+obj._fsm.getState().getName());
	}
	}