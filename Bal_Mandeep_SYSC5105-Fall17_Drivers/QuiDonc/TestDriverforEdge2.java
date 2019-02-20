package quindonc;

public class TestDriverforEdge2 {

		public static void main(String[] args) throws InterruptedException 
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
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.wait1();			
			obj.two();
			obj.two();
			obj.wait1();
			obj.two();
			obj.one();			
			obj.wait1();
			obj.one();
			obj.one();
			obj.end9();
			System.out.println("TestCase1 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase2()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.wait1();
			obj.num2();
			obj.one();
			obj.two();			
			obj.end9();
			System.out.println("TestCase2 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase3()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.wait1();
			obj.bad();			
			obj.end5();
			System.out.println("TestCase3 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase4()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.eighteen();
			obj.end8();
			System.out.println("TestCase4 reaches state:"+obj._fsm.getState().getName());
		}

		public static void TestCase5()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.num2();
			obj.wait1();			
			obj.wait1();
			obj.wait1();			
			obj.end1();
			
			System.out.println("TestCase5 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase6()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.wait1();
			obj.bad();
			obj.bad();			
			obj.num1();
			obj.num1();
			obj.end5();
			System.out.println("TestCase6 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase7()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.eighteen();
			obj.wait1();
			obj.end1();
			System.out.println("TestCase7 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase8()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.num1();
			obj.num1();			
			obj.num1();
			obj.num1();
			obj.end5();
			System.out.println("TestCase8 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase9()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.bad();
			obj.bad();			
			obj.bad();
			obj.bad();
			obj.end5();
			System.out.println("TestCase9 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase10()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.star();	
			obj.wait1();			
			obj.wait1();
			obj.wait1();
			obj.end1();
			System.out.println("TestCase10 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase11()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.eighteen();
			obj.star();			
			obj.end5();		
			System.out.println("TestCase11 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase12()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.wait1();	
			obj.wait1();
			obj.dial();
			obj.wait1();
			obj.star();
			obj.wait1();
			obj.num2();
			obj.star();
			obj.end5();
			System.out.println("TestCase12 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase13()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.star();
			obj.wait1();
			obj.num1();
			obj.end5();
			
			
			System.out.println("TestCase13 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase14()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.num2();
			obj.star();
			obj.end5();
			System.out.println("TestCase14 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase15()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.wait1();
			obj.one();
			obj.end9();			
			System.out.println("TestCase15 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase16()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.wait1();
			obj.star();
			obj.end5();
			System.out.println("TestCase16 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase17()
		{
			Quin obj = new Quin();
			obj.dial();			
			obj.end2();
			System.out.println("TestCase17 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase18()
		{
			Quin obj = new Quin();
			obj.dial();			
			obj.wait1();			
			obj.end3();
			System.out.println("TestCase18 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase19()
		{
			Quin obj = new Quin();
			obj.dial();			
			obj.wait1();			
			obj.wait1();			
			obj.end4();
			System.out.println("TestCase19 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase20()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();			
			obj.end6();			
			System.out.println("TestCase20 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase21()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();			
			obj.end7();
			System.out.println("TestCase21 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase22()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.end10();
			System.out.println("TestCase22 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase23()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.wait1();
			obj.end11();
			System.out.println("TestCase23 reaches state:"+obj._fsm.getState().getName());
		}
	}
