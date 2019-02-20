package cruisecontrol_stateremoved;
public class TestDriverforEgdeAlgo2
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
       
        }

	public static void TestCase1()
	{
		 Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T21(); 
obj.T23();
 obj.T24(); 
obj.T25(); 
obj.T26(); 
obj.T22(); 
obj.EndInactive();

		System.out.println("TestCase1 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase2()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T28(); 
obj.T20(); 
obj.T28(); 
obj.EndCrusing();

		System.out.println("TestCase2 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase3()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T19();  
obj.T27(); 
obj.T19(); 
obj.T27(); 
obj.EndCrusing();

		System.out.println("TestCase3 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase4()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T18(); 
obj.T18(); 
obj.EndCrusing();

		System.out.println("TestCase4 reaches state:"+obj._fsm.getState().getName());
	}

	public static void TestCase5()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T17(); 
obj.T17(); 
obj.EndCrusing();

		System.out.println("TestCase5 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase6()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T16(); 
obj.T16(); 
obj.EndCrusing();

		System.out.println("TestCase6 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase7()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T15(); 
obj.EndInactive();

		System.out.println("TestCase7 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase8()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T8(); 
obj.T5(); 
obj.T9(); 
obj.T10(); 
obj.T11(); 
obj.T12(); 
obj.T13(); 
obj.EndActive();
		
		System.out.println("TestCase8 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase9()
	{
		Cruise obj = new Cruise();
	       	obj.T4(); 
obj.T4(); 
obj.EndInactive();

		System.out.println("TestCase9 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase10()
	{
		Cruise obj = new Cruise();
                obj.T6(); 
obj.T6(); 
obj.EndInactive();
				
		System.out.println("TestCase10 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase11()
	{
		Cruise obj = new Cruise();
                obj.T7(); 
obj.T7(); 
obj.EndInactive();
				
		System.out.println("TestCase11 reaches state:"+obj._fsm.getState().getName());
	}
	 public static void TestCase12()
	{
		Cruise obj = new Cruise();
                obj.T3(); 
obj.T3(); 
obj.EndInactive();
				
		System.out.println("TestCase12 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase13()
	{
		Cruise obj = new Cruise();
               	obj.T2(); 
obj.T2(); 
obj.EndInactive();
			
		System.out.println("TestCase13 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase14()
	{
		Cruise obj = new Cruise();
               	obj.T1(); 
obj.T1(); 
obj.EndInactive();
			
		System.out.println("TestCase14 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase15()
	{
		Cruise obj = new Cruise();
               	obj.T5();
 obj.EndActive();
			
		System.out.println("TestCase15 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase16()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.EndCrusing();
			
		System.out.println("TestCase16 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase17()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.EndStandby();
			
		System.out.println("TestCase17 reaches state:"+obj._fsm.getState().getName());
	}
}