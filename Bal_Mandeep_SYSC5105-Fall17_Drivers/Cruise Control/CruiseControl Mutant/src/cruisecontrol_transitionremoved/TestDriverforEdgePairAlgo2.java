package cruisecontrol_transitionremoved;
public class TestDriverforEdgePairAlgo2
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
                TestCase24();
		TestCase25();
		TestCase26();	
                TestCase27();
		TestCase28();
		TestCase29();
		TestCase30();
		TestCase31();
		TestCase32();	
                TestCase33();
		TestCase34();
		TestCase35();
		TestCase36();
		TestCase37();
		        
        }

	public static void TestCase1()
	{
		 Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T19(); 
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
obj.T26();
 obj.T28();
 obj.T21(); 
obj.T26(); 
obj.EndStandby();

		System.out.println("TestCase2 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase3()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T27();
 obj.T21();
 obj.T25();
 obj.T28();
 obj.T20();
 obj.T26(); 
obj.T27();
 obj.T20();
 obj.T25();
 obj.T27(); 
obj.T19();
 obj.T25();
 obj.T25();
 obj.T26();
 obj.T25();
 obj.T22();
 obj.T4();
 obj.EndInactive();

		System.out.println("TestCase3 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase4()
	{
		Cruise obj = new Cruise();
		obj.T5();
 obj.T14();
 obj.T18();
 obj.T21();
 obj.T23();
 obj.T28();
 obj.T18();
 obj.T19();
 obj.T23();
 obj.T25();
 obj.T23();
 obj.T26();
 obj.T23();
 obj.T22();
 obj.T7();
 obj.EndInactive();

		System.out.println("TestCase4 reaches state:"+obj._fsm.getState().getName());
	}

	public static void TestCase5()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T17(); 
obj.T21(); 
obj.T28();
 obj.T16(); 
obj.T19(); 
obj.T27();
 obj.T15(); 
obj.EndInactive();

		System.out.println("TestCase5 reaches state:"+obj._fsm.getState().getName());
	}
	public static void TestCase6()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T14(); 
obj.T18(); 
obj.T20(); 
obj.T23(); 
obj.T27(); 
obj.T17(); 
obj.T18(); 
obj.T16(); 
obj.T17(); 
obj.T15(); 
obj.T6(); 
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
obj.T5(); 
obj.T14(); 
obj.T21();
 obj.T24(); 
obj.T28(); 
obj.T19();
 obj.T26();
 obj.T26(); 
obj.T22();
 obj.EndInactive();

		System.out.println("TestCase7 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase8()
	{
		Cruise obj = new Cruise();
		obj.T5(); 
obj.T13(); 
obj.T14(); 
obj.T20(); 
obj.T25(); 
obj.T27(); 
obj.T18(); 
obj.T18();
 obj.T17(); 
obj.T17(); 
obj.T16();
 obj.T16();
 obj.T15(); 
obj.T3(); 
obj.EndInactive();
		
		System.out.println("TestCase8 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase9()
	{
		Cruise obj = new Cruise();
	       	obj.T5(); 
obj.T12(); 
obj.T14(); 
obj.T19(); 
obj.T24(); 
obj.T25();  
obj.T24(); 
obj.T26(); 
obj.T24(); 
obj.T22(); 
obj.T6(); 
obj.EndInactive();

		System.out.println("TestCase9 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase10()
	{
		Cruise obj = new Cruise();
                obj.T5(); 
obj.T11(); 
obj.T14(); 
obj.T18(); 
obj.T15(); 
obj.T4(); 
obj.EndInactive();
				
		System.out.println("TestCase10 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase11()
	{
		Cruise obj = new Cruise();
                obj.T5(); 
obj.T10(); 
obj.T14(); 
obj.T17(); 
obj.T15(); 
obj.T7(); 
obj.EndInactive();
				
		System.out.println("TestCase11 reaches state:"+obj._fsm.getState().getName());
	}
	 public static void TestCase12()
	{
		Cruise obj = new Cruise();
                obj.T5(); 
obj.T9(); 
obj.T14(); 
obj.T16(); 
obj.T15();
obj.T2(); 
obj.EndInactive();
				
		System.out.println("TestCase12 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase13()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T16(); 
obj.T20(); 
obj.T27(); 
obj.T15();
obj.T5(); 
obj.T9(); 
obj.T9(); 
obj.T10(); 
obj.T11(); 
obj.T9(); 
obj.T12(); 
obj.T9(); 
obj.T13(); 
obj.T9(); 
obj.T8(); 
obj.T5(); 
obj.EndActive();
			
		System.out.println("TestCase13 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase14()
	{
		Cruise obj = new Cruise();
               	obj.T5();
obj.T14();
obj.T17();
obj.T20();
obj.T28();
obj.T15();
obj.T5();
obj.T10();
obj.T10();
obj.T11();
obj.T10();
obj.T12();
obj.T10();
obj.T13();
obj.T10();
obj.T8();
obj.T1();
obj.T5();
obj.T8();
obj.T5();
obj.T8();
obj.T6();
obj.T5();
obj.T13();
obj.T13();
obj.T8();
obj.T7();
obj.T5();
obj.T12();
obj.T12();
obj.T13();
obj.T12();
obj.T8();
obj.T3();
obj.T5();
obj.T11();
obj.T11();
obj.T12();
obj.T11();
obj.T13();
obj.T11();
obj.T8();
obj.T2();
obj.T5();
obj.T8();
obj.EndInactive();
			
		System.out.println("TestCase14 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase15()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T22(); 
obj.T1(); 
obj.EndInactive();
			
		System.out.println("TestCase15 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase16()
	{
		Cruise obj = new Cruise();
               		
obj.T5(); 
obj.T14(); 
obj.T20(); 
obj.T22(); 
obj.T2(); 
obj.EndInactive();
			
		System.out.println("TestCase16 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase17()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T21(); 
obj.T22(); 
obj.T3(); 
obj.EndInactive();
			
		System.out.println("TestCase17 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase18()
	{
		Cruise obj = new Cruise();
               	obj.T5();
obj.T14();
obj.T19();
obj.T28();
obj.T17();
obj.T19();
obj.T28();
obj.T16();
obj.T21();
obj.T27();
obj.T16();
obj.T18();
obj.T15();
obj.T5();
obj.T8();
obj.T4();
obj.T4();
obj.T5();
obj.T8();
obj.T5();
obj.T14(); 
obj.T15();
obj.T1(); 
obj.EndInactive();
			
		System.out.println("TestCase18 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase19()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T11(); 
obj.EndActive();			
		System.out.println("TestCase19 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase20()
	{
		Cruise obj = new Cruise();
               	obj.T5();
obj.T9(); 
obj.EndActive();
			
		System.out.println("TestCase20 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase21()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T10(); 
obj.EndActive();
		
		System.out.println("TestCase21 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase22()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T12(); 
obj.EndActive();			
		System.out.println("TestCase22 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase23()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T13(); 
obj.EndActive();			
		System.out.println("TestCase23 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase24()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.EndCrusing();			
		System.out.println("TestCase24 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase25()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T16(); 
obj.EndCrusing();			
		System.out.println("TestCase25 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase26()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T17(); 
obj.EndCrusing();			
		System.out.println("TestCase26 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase27()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T18(); 
obj.EndCrusing();			
		System.out.println("TestCase27 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase28()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.EndStandby();			
		System.out.println("TestCase28 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase29()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T20(); 
obj.EndStandby();			
		System.out.println("TestCase29 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase30()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T21(); 
obj.EndStandby();			
		System.out.println("TestCase30 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase31()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T27(); 
obj.EndCrusing();			
		System.out.println("TestCase31 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase32()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T28(); 
obj.EndCrusing();			
		System.out.println("TestCase32 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase33()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T23(); 
obj.EndStandby();			
		System.out.println("TestCase33 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase34()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T24(); 
obj.EndStandby();			
		System.out.println("TestCase34 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase35()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T25(); 
obj.EndStandby();			
		System.out.println("TestCase35 reaches state:"+obj._fsm.getState().getName());
	}
         public static void TestCase36()
	{
		Cruise obj = new Cruise();
               	obj.T5(); 
obj.T14(); 
obj.T19(); 
obj.T26(); 
obj.EndStandby();			
		System.out.println("TestCase36 reaches state:"+obj._fsm.getState().getName());
	}
        public static void TestCase37()
	{
		Cruise obj = new Cruise();
               	obj.T4(); 
obj.T6();
obj.T6();
obj.T4();
obj.T3();
obj.T4();
obj.T2();
obj.T4();
obj.T1();
obj.T4();
obj.T6();
obj.T7();
obj.T7();
obj.T6();
obj.T3();
obj.T6();
obj.T2();
obj.T6();
obj.T1();
obj.T6();
obj.T7();
obj.T3();
obj.T7();
obj.T2();
obj.T7();
obj.T1();
obj.T7();
obj.T3();
obj.T2();
obj.T2();
obj.T3();
obj.T1();
obj.T3();
obj.T2();
obj.T1();
obj.T2();
obj.T1();
obj.T1();
obj.EndInactive();			
		System.out.println("TestCase37 reaches state:"+obj._fsm.getState().getName());
	}
}