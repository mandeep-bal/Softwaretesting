package quindonc;

public class TestDriverforEdgePair {

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
			TestCase38();
			TestCase39();
			TestCase40();
			TestCase41();
			TestCase42();
			TestCase43();
			TestCase44();
			TestCase45();
			TestCase46();
			TestCase47();
			TestCase48();
			TestCase49();
			TestCase50();
			TestCase51();
			TestCase52();
			TestCase53();
			TestCase54();
			TestCase55();
			TestCase56();
			TestCase57();
			TestCase58();
			TestCase59();
			TestCase60();
			TestCase61();
			TestCase62();
			TestCase63();
			TestCase64();
			TestCase65();
			TestCase66();
			TestCase67();
			TestCase68();
			TestCase69();
			TestCase70();
			TestCase71();
			TestCase72();
			TestCase73();
			TestCase74();
			TestCase75();
			TestCase76();
			TestCase77();
			TestCase78();
			TestCase79();
			TestCase80();
			TestCase81();
			TestCase82();
			TestCase83();
			TestCase84();
			TestCase85();
			TestCase86();
			TestCase87();
			TestCase88();
			TestCase89();
			TestCase90();
			TestCase91();
			TestCase92();
			TestCase93();
			TestCase94();
			TestCase95();
			TestCase96();
			TestCase97();
			TestCase100();
			TestCase101();
			TestCase102();
			TestCase103();
			TestCase104();
			TestCase105();
			TestCase106();
			TestCase107();
			TestCase108();
			TestCase109();
			TestCase110();
			TestCase111();
			TestCase112();
			TestCase113();
			TestCase114();
			TestCase115();
			TestCase116();
			TestCase117();
			TestCase118();
			TestCase119();
			TestCase120();
			TestCase121();
			TestCase122();
			TestCase123();
			TestCase124();
			TestCase125();
		}

		public static void TestCase1()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.end3();		
			System.out.println("TestCase1 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase2()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.end5();
			System.out.println("TestCase2 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase3()
		{
			Quin obj = new Quin();
			obj.dial();			
			obj.star();
			obj.wait1();
			obj.end6();
			System.out.println("TestCase3 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase4()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.wait1();
			obj.star();
			obj.end5();
			System.out.println("TestCase4 reaches state:"+obj._fsm.getState().getName());
		}

		public static void TestCase5()
		{
			Quin obj = new Quin();
			obj.dial();
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
			obj.wait1();
			obj.star();
			obj.eighteen();
			obj.end8();
			System.out.println("TestCase6 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase7()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.star();	
			obj.wait1();
			obj.end6();
			System.out.println("TestCase7 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase8()
		{
			Quin obj = new Quin();
			obj.dial();	
			obj.wait1();
			obj.star();
			obj.num2();
			obj.end9();
			System.out.println("TestCase8 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase9()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.star();			
			obj.bad();
			obj.end5();
			System.out.println("TestCase9 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase10()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.num1();
			obj.end5();
			System.out.println("TestCase10 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase11()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.wait1();
			obj.star();
			obj.eighteen();
			obj.end8();		
			System.out.println("TestCase11 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase12()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();		
			obj.wait1();			
			obj.star();			
			obj.wait1();		
			obj.end6();
			System.out.println("TestCase12 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase13()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.wait1();
			obj.star();
			obj.num2();
			obj.end9();
			System.out.println("TestCase13 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase14()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.wait1();			
			obj.star();
			obj.bad();
			obj.end5();
			System.out.println("TestCase14 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase15()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.wait1();			
			obj.star();
			obj.num1();
			obj.end5();			
			System.out.println("TestCase15 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase16()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.wait1();			
			obj.wait1();
			obj.dial();
			obj.end2();
			System.out.println("TestCase16 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase17()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.eighteen();
			obj.star();
			obj.end5();
			System.out.println("TestCase17 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase18()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.eighteen();
			obj.wait1();			
			obj.end1();
			System.out.println("TestCase18 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase19()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();			
			obj.wait1();			
			obj.end7();
			System.out.println("TestCase19 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase20()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();			
			obj.eighteen();
			obj.end8();
			
			System.out.println("TestCase20 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase21()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();
			obj.num1();
			obj.end5();
			System.out.println("TestCase21 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase22()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();
			obj.bad();
			obj.end5();
			System.out.println("TestCase22 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase23()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.bad();			
			obj.num2();
			obj.end9();
			System.out.println("TestCase23 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase24()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();			
			obj.star();
			obj.end5();
			System.out.println("TestCase24 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase25()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.bad();
			obj.wait1();			
			obj.end6();
			System.out.println("TestCase25 reaches state:"+obj._fsm.getState().getName());
		}
		
	public static void TestCase26()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.bad();
			obj.num2();		
			obj.end9();
			System.out.println("TestCase26 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase27()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.bad();
			obj.bad();			
			obj.end5();
			System.out.println("TestCase27 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase28()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.bad();
			obj.num1();			
			obj.end5();
			System.out.println("TestCase28 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase29()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.bad();
			obj.eighteen();
			obj.end8();
			System.out.println("TestCase29 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase30()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num1();			
			obj.wait1();			
			obj.end6();
			System.out.println("TestCase30 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase31()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num1();	
			obj.num2();
			obj.end9();
			System.out.println("TestCase31 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase32()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num1();
			obj.bad();			
			obj.end5();
			System.out.println("TestCase33 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase33()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num1();
			obj.num1();
			obj.end5();
			System.out.println("TestCase33 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase34()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.wait1();
			obj.end1();
			System.out.println("TestCase34 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase35()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num1();
			obj.end5();
			System.out.println("TestCase35 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase36()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.bad();
			obj.eighteen();
			obj.end8();		
			System.out.println("TestCase36 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase37()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num1();
			obj.end5();		
			System.out.println("TestCase37 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase38()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.eighteen();
			obj.star();
			obj.end5();		
			System.out.println("TestCase38 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase39()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.eighteen();
			obj.star();
			obj.end5();
			System.out.println("TestCase39 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase40()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.eighteen();
			obj.wait1();
			obj.end1();		
			System.out.println("TestCase40 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase41()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();		
			obj.wait1();			
			obj.num1();			
			obj.eighteen();		
			obj.end8();
			System.out.println("TestCase41 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase42()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.num1();
			obj.wait1();
			obj.end6();
			
			System.out.println("TestCase42 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase43()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.num1();
			obj.num2();
			obj.end9();
			System.out.println("TestCase43 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase44()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.bad();
			obj.num1();
			obj.end5();			
			System.out.println("TestCase44 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase45()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.num1();
			obj.num1();
			obj.end5();			
			System.out.println("TestCase45 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase46()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();		
			obj.wait1();			
			obj.bad();			
			obj.eighteen();		
			obj.end8();
			System.out.println("TestCase46 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase47()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();		
			obj.wait1();			
			obj.bad();			
			obj.wait1();		
			obj.end6();
			System.out.println("TestCase47 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase48()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();		
			obj.wait1();			
			obj.bad();			
			obj.num2();		
			obj.end9();
			System.out.println("TestCase48 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase49()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();		
			obj.wait1();			
			obj.bad();			
			obj.bad();		
			obj.end5();
			System.out.println("TestCase49 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase50()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();		
			obj.wait1();			
			obj.bad();			
			obj.num1();		
			obj.end5();
			System.out.println("TestCase50 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase51()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.num2();
			obj.star();
			obj.end5();
			System.out.println("TestCase51 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase52()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.num2();
			obj.wait1();
			obj.end10();
			System.out.println("TestCase52 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase53()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.num2();
			obj.one();			
			obj.end9();
			System.out.println("TestCase53 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase54()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();			
			obj.num2();
			obj.two();			
			obj.end9();
			System.out.println("TestCase54 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase55()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();			
			obj.wait1();
			obj.wait1();			
			obj.dial();
			obj.end2();
			System.out.println("TestCase55 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase56()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();
			obj.wait1();			
			obj.bad();
			obj.eighteen();
			obj.end8();
			System.out.println("TestCase56 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase57()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();
			obj.wait1();
			obj.bad();
			obj.wait1();
			obj.end6();
			System.out.println("TestCase57 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase58()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.bad();			
			obj.num2();
			obj.end9();
			System.out.println("TestCase58 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase59()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.wait1();
			obj.bad();
			obj.bad();
			obj.end5();
			System.out.println("TestCase59 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase60()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.bad();
			obj.wait1();
			obj.wait1();
			obj.num1();			
			obj.end5();
			System.out.println("TestCase60 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase61()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.eighteen();
			obj.star();
			obj.end5();
			System.out.println("TestCase61 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase62()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.eighteen();
			obj.wait1();		
			obj.end1();
			System.out.println("TestCase62 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase63()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num1();
			obj.eighteen();			
			obj.end8();
			System.out.println("TestCase63 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase64()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num1();
			obj.wait1();			
			obj.end6();
			System.out.println("TestCase64 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase65()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num1();
			obj.num2();
			obj.end9();
			System.out.println("TestCase65 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase66()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();			
			obj.wait1();
			obj.bad();			
			obj.end5();
			System.out.println("TestCase66 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase67()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num1();
			obj.num1();			
			obj.end5();
			System.out.println("TestCase67 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase68()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num2();
			obj.star();			
			obj.end5();
			System.out.println("TestCase68 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase69()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num2();
			obj.wait1();
			obj.end10();
			System.out.println("TestCase69 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase70()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num2();
			obj.one();
			obj.end9();		
			System.out.println("TestCase70 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase71()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num2();
			obj.two();
			obj.end9();
			System.out.println("TestCase71 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase72()
		{
			Quin obj = new Quin();
			obj.dial();			
			obj.star();
			obj.eighteen();
			obj.star();
			obj.eighteen();
			obj.end8();
			System.out.println("TestCase72 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase73()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.eighteen();
			obj.star();
			obj.wait1();
			obj.end6();
			System.out.println("TestCase73 reaches state:"+obj._fsm.getState().getName());
		}

		public static void TestCase74()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.eighteen();
			obj.star();
			obj.num2();
			obj.end9();			
			System.out.println("TestCase74 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase75()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.eighteen();
			obj.star();
			obj.bad();
			obj.end5();
			System.out.println("TestCase75 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase76()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.eighteen();			
			obj.star();
			obj.num1();
			obj.end5();
			System.out.println("TestCase76 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase77()
		{
			Quin obj = new Quin();
			obj.dial();		
			obj.star();
			obj.eighteen();
			obj.wait1();
			obj.dial();			
			obj.end2();
			System.out.println("TestCase77 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase78()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.star();
			obj.eighteen();
			obj.end8();
			System.out.println("TestCase78 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase79()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.star();
			obj.wait1();
			obj.end6();
			System.out.println("TestCase79 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase80()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.star();
			obj.num2();
			obj.end9();		
			System.out.println("TestCase80 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase81()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();		
			obj.num2();			
			obj.star();			
			obj.bad();		
			obj.end5();
			System.out.println("TestCase81 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase82()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.star();
			obj.num1();
			obj.end5();
			System.out.println("TestCase82 reaches state:"+obj._fsm.getState().getName());
		}
		
		
		public static void TestCase83()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.num2();			
			obj.wait1();
			obj.wait1();
			obj.end11();			
			System.out.println("TestCase83 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase84()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();			
			obj.wait1();
			obj.num2();
			obj.star();
			obj.end5();
			System.out.println("TestCase84 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase85()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();	
			obj.num2();
			obj.wait1();
			obj.one();
			obj.end9();
			System.out.println("TestCase85 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase86()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.two();			
			obj.end9();
			System.out.println("TestCase86 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase87()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();	
			obj.one();
			obj.star();
			obj.end5();
			System.out.println("TestCase87 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase88()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.one();
			obj.wait1();
			obj.end10();
			System.out.println("TestCase88 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase89()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.one();
			obj.one();
			obj.end9();
			System.out.println("TestCase89 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase90()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.one();
			obj.two();
			obj.end9();
			System.out.println("TestCase90 reaches state:"+obj._fsm.getState().getName());
		}
public static void TestCase91()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();			
			obj.two();
			obj.star();
			obj.end5();
			System.out.println("TestCase91 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase92()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.two();
			obj.wait1();
			obj.end10();
			System.out.println("TestCase92 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase93()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.two();
			obj.one();
			obj.end9();
			System.out.println("TestCase93 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase94()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.two();
			obj.two();
			obj.end9();
			System.out.println("TestCase94 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase95()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();	
			obj.wait1();
			obj.wait1();		
			obj.end1();
			System.out.println("TestCase95 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase96()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();	
			obj.wait1();
			obj.wait1();
			obj.one();
			obj.end9();
			System.out.println("TestCase96 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase97()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.wait1();
			obj.two();
			obj.end9();
			System.out.println("TestCase97 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase98()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();			
			obj.wait1();
			obj.wait1();
			obj.star();			
			obj.end5();
			System.out.println("TestCase98 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase99()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.star();
			obj.eighteen();			
			obj.end8();
			System.out.println("TestCase99 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase100()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.star();
			obj.wait1();
			obj.end6();
			System.out.println("TestCase100 reaches state:"+obj._fsm.getState().getName());
		}
	public static void TestCase101()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.star();
			obj.num2();
			obj.end9();
			System.out.println("TestCase101 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase102()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.star();
			obj.bad();
			obj.end5();		
			System.out.println("TestCase102 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase103()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.star();
			obj.num1();
			obj.end5();
			System.out.println("TestCase103 reaches state:"+obj._fsm.getState().getName());
		}
		
		public static void TestCase104()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();
			obj.num2();
			obj.wait1();
			obj.end10();
			System.out.println("TestCase104 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase105()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.wait1();
			obj.star();
			obj.num2();
			obj.one();
			obj.star();
			obj.end5();
			System.out.println("TestCase105 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase106()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.one();
			obj.one();
			obj.end9();
			System.out.println("TestCase106 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase107()
		{
			Quin obj = new Quin();
			obj.dial();		
			obj.star();
			obj.num2();
			obj.wait1();
			obj.one();
			obj.two();			
			obj.end9();
			System.out.println("TestCase107 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase108()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();	
			obj.num2();
			obj.wait1();
			obj.two();
			obj.star();
			obj.end5();
			System.out.println("TestCase108 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase109()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.two();
			obj.wait1();
			obj.end10();
			System.out.println("TestCase109 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase110()
		{
			Quin obj = new Quin();
			obj.dial();		
			obj.star();
			obj.num2();
			obj.wait1();
			obj.one();
			obj.two();			
			obj.end9();		
			System.out.println("TestCase110 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase111()
		{
			Quin obj = new Quin();
			obj.dial();		
			obj.star();
			obj.num2();
			obj.wait1();
			obj.two();
			obj.two();			
			obj.end9();
			System.out.println("TestCase111 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase112()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.wait1();
			obj.wait1();
			obj.dial();
			obj.end2();
			System.out.println("TestCase112 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase113()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.wait1();
			obj.wait1();			
			obj.num2();
			obj.one();
			obj.star();
			obj.end5();
			System.out.println("TestCase113 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase114()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.one();
			obj.wait1();			
			obj.end10();			
			System.out.println("TestCase114 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase115()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();
			obj.one();
			obj.one();
			obj.end9();
			System.out.println("TestCase115 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase116()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();
			obj.one();
			obj.two();
			obj.end9();
			System.out.println("TestCase116 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase117()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();
			obj.wait1();
			obj.two();
			obj.star();			
			obj.end5();
			System.out.println("TestCase117 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase118()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();			
			obj.wait1();			
			obj.wait1();
			obj.two();
			obj.wait1();			
			obj.end10();
			System.out.println("TestCase118 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase119()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();			
			obj.two();
			obj.one();
			obj.end9();
			
			System.out.println("TestCase119 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase120()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();			
			obj.two();
			obj.two();
			obj.end9();
			System.out.println("TestCase120 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase121()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();
			obj.star();
			obj.eighteen();
			obj.end8();
			System.out.println("TestCase121 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase122()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();
			obj.star();
			obj.wait1();
			obj.end6();
			System.out.println("TestCase122 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase123()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();
			obj.star();
			obj.num2();
			obj.end9();
			System.out.println("TestCase123 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase124()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();
			obj.star();
			obj.bad();
			obj.end5();
			System.out.println("TestCase124 reaches state:"+obj._fsm.getState().getName());
		}
		public static void TestCase125()
		{
			Quin obj = new Quin();
			obj.dial();
			obj.star();
			obj.num2();
			obj.wait1();			
			obj.wait1();
			obj.star();
			obj.num1();
			obj.end5();
			System.out.println("TestCase125 reaches state:"+obj._fsm.getState().getName());
		}
	}
