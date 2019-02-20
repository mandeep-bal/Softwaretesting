package quindonc;

public class TestDriverforEdgePair2 {
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
		testCase14();
		testCase15();
		testCase16();
		testCase17();
		testCase18();
		testCase19();
		testCase20();
		testCase21();
		testCase22();
		testCase23();
		testCase24();
		testCase25();
		testCase26();
		testCase27();
		testCase28();
		testCase29();
		testCase30();
		testCase31();
		testCase32();
		testCase33();
		testCase34();
		testCase35();
		testCase36();
		testCase37();
		testCase38();
		testCase39();
		testCase40();
		testCase41();
		testCase42();
		testCase43();
		testCase44();
		testCase45();
		testCase46();
		testCase47();
		testCase48();
		testCase49();
		testCase50();
		testCase51();
		testCase52();
		testCase53();
		testCase54();
		testCase55();
		testCase56();
		testCase57();
		testCase58();
		testCase59();
		testCase60();
		testCase61();
		testCase62();
		testCase63();
		testCase64();
		testCase65();
		testCase66();
		
		
	}

	public static void testCase1()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();			
		obj.wait1();			
		obj.wait1();
		obj.end1();		
		System.out.println("Testcase1 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase2()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();			
		obj.wait1();
		obj.two();
		obj.wait1();
		obj.star();
		obj.bad();
		obj.end5();
		System.out.println("Testcase2 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase3()
	{
		Quin obj = new Quin();
		obj.dial();			
		obj.star();
		obj.num2();
		obj.wait1();
		obj.one();
		obj.wait1();
		obj.wait1();
		obj.end11();
		System.out.println("Testcase3 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase4()
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
		obj.wait1();
		obj.star();
		obj.end5();
		System.out.println("Testcase4 reaches state:"+obj._fsm.getState().getName());
	}

	public static void testCase5()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();			
		obj.wait1();			
		obj.num2();
		obj.one();
		obj.wait1();
		obj.wait1();
		obj.one();
		obj.star();
		obj.end5();			
		System.out.println("Testcase5 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase6()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();			
		obj.wait1();			
		
		obj.one();
		
		obj.wait1();
		obj.star();
		
		obj.end5();
		System.out.println("Testcase6 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase7()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.num1();
		obj.num1();
		obj.num2();
		obj.star();
		obj.end5();
		System.out.println("Testcase7 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase8()
	{
		Quin obj = new Quin();
		obj.dial();		
		obj.star();
		
		obj.wait1();			
		obj.wait1();			
		
		obj.bad();
		obj.wait1();
		obj.wait1();			
		obj.end7();
		System.out.println("Testcase8 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase9()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.star();			
		obj.bad();
		obj.num1();
		obj.end5();
		System.out.println("Testcase9 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase10()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.star();			
		obj.bad();
		obj.bad();
		obj.end5();
		System.out.println("Testcase10 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase11()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.bad();
		obj.bad();
		obj.num2();
		obj.star();	
		obj.num2();
		obj.wait1();
		obj.end10();		
		System.out.println("Testcase11 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase12()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();		
		obj.wait1();
		obj.star();	
		obj.wait1();
		obj.num1();
		obj.num1();
		obj.eighteen();
		obj.star();		
		obj.bad();
		obj.end5();
		System.out.println("Testcase12 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase13()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();	
		obj.wait1();
		obj.wait1();
		obj.num1();
		obj.num1();
		obj.wait1();
		obj.eighteen();
		obj.wait1();
		obj.dial();
		obj.wait1();
		obj.end3();
		
		
		System.out.println("Testcase13 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase14()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.num1();
		obj.num2();
		obj.star();	
		obj.wait1();
		obj.num2();
		obj.one();
		obj.star();
		obj.wait1();
		obj.eighteen();
		obj.star();
		obj.num2();
		obj.star();
		obj.end5();
		System.out.println("Testcase14 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase15()
	{

		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.wait1();
		obj.star();	
		obj.num1();
		obj.wait1();
		obj.wait1();
		obj.eighteen();
		obj.star();
		obj.eighteen();
		obj.star();
		obj.wait1();
		obj.bad();
		obj.eighteen();
		obj.star();
		obj.num1();
		obj.end5();			
		System.out.println("Testcase15 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase16()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.wait1();
		obj.one();
		obj.wait1();
		obj.star();		
		obj.num2();
		obj.wait1();
		obj.wait1();
		obj.wait1();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.eighteen();
		obj.end8();
		System.out.println("Testcase16 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase17()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.one();
		obj.wait1();
		obj.star();		
		obj.wait1();
		obj.wait1();
		obj.wait1();
		obj.dial();
		obj.wait1();
		obj.star();	
		obj.eighteen();
		obj.wait1();
		obj.dial();
		obj.end2();
		System.out.println("Testcase17 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase18()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.eighteen();
		obj.wait1();
		obj.dial();
		obj.wait1();
		obj.wait1();			
		obj.star();
		obj.eighteen();	
		obj.end8();
		System.out.println("Testcase18 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase19()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();				
		obj.wait1();			
		obj.wait1();
		obj.dial();
		obj.star();
		obj.eighteen();
		obj.wait1();
		obj.end1();
		System.out.println("Testcase19 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase20()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();	
		obj.bad();
		obj.wait1();			
		obj.end6();
		
		System.out.println("Testcase20 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase21()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();	
		obj.num1();
		obj.num2();
		obj.end9();
		System.out.println("Testcase21 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase22()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.wait1();
		obj.star();
		obj.num2();
		obj.one();
		obj.two();		
		obj.one();
		obj.end9();
		System.out.println("Testcase22 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase23()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.num1();
		obj.num1();
		obj.num1();
		obj.bad();
		obj.num2();
		obj.two();
		obj.two();
		obj.end9();
		System.out.println("Testcase23 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase24()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.num1();
		obj.num2();
		obj.star();			
		obj.num1();
		obj.end5();
		System.out.println("Testcase24 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase25()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();			
		obj.bad();
		obj.bad();
		obj.wait1();
		obj.wait1();			
		obj.num2();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.wait1();
		obj.end1();
		System.out.println("Testcase25 reaches state:"+obj._fsm.getState().getName());
	}
	
public static void testCase26()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.wait1();
		obj.star();
		obj.bad();
		obj.wait1();
		obj.wait1();
		obj.num1();
		obj.eighteen();
		obj.star();
		obj.end5();
		System.out.println("Testcase26 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase27()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.num2();			
		obj.end9();
		System.out.println("Testcase27 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase28()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.star();	
		obj.num1();
		obj.eighteen();
		obj.star();
		obj.wait1();
		obj.num2();	
		obj.wait1();
		obj.star();	
		obj.num1();
		obj.end5();
		System.out.println("Testcase28 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase29()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.star();
		obj.eighteen();
		obj.end8();
	System.out.println("Testcase29 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase30()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.star();
		obj.wait1();
		obj.num2();
		obj.two();
		obj.star();
		obj.wait1();
		obj.num1();
		obj.wait1();
		obj.wait1();
		obj.bad();
		obj.eighteen();
		obj.end8();
			
		System.out.println("Testcase30 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase31()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.star();
		obj.wait1();
		obj.num2();
		obj.star();
		obj.bad();
		obj.end5();
	System.out.println("Testcase31 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase32()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.wait1();
		obj.wait1();
		obj.end1();
	System.out.println("Testcase33 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase33()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.num1();
		obj.bad();
		obj.num1();
		obj.num2();
		obj.star();
		obj.eighteen();
		obj.end8();
	System.out.println("Testcase33 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase34()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.wait1();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.star();
		obj.eighteen();
		obj.end8();
	System.out.println("Testcase34 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase35()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.end5();
		System.out.println("Testcase35 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase36()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.wait1();
		obj.end4();
	System.out.println("Testcase36 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase37()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.star();
		obj.bad();
		obj.end5();
	System.out.println("Testcase37 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase38()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.star();
		obj.end5();
		System.out.println("Testcase38 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase39()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.wait1();
		obj.wait1();
		obj.star();
		obj.end5();
	System.out.println("Testcase39 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase40()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.bad();
		obj.eighteen();
		obj.end8();
	System.out.println("Testcase40 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase41()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.num1();
		obj.end5();
	System.out.println("Testcase41 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase42()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.bad();
		obj.end5();
	System.out.println("Testcase42 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase43()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.num1();
		obj.bad();
		obj.end5();
	System.out.println("Testcase43 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase44()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.num1();
		obj.num1();
		obj.end5();
	System.out.println("Testcase44 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase45()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.num1();
		obj.end5();
	System.out.println("Testcase45 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase46()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.eighteen();
		obj.end8();
	System.out.println("Testcase46 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase47()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.bad();
		obj.bad();
		obj.end5();
	System.out.println("Testcase47 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase48()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.bad();
		obj.num1();
		obj.end5();
	System.out.println("Testcase48 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase49()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.bad();
		obj.end5();
	System.out.println("Testcase49 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase50()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.wait1();
		obj.wait1();
		obj.num2();
		obj.end9();
	System.out.println("Testcase50 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase51()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.star();
		obj.end5();
	System.out.println("Testcase51 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase52()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.one();
		obj.one();
		obj.end9();
	System.out.println("Testcase52 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase53()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.one();
		obj.two();
		obj.end9();
	System.out.println("Testcase53 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase54()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.one();
		obj.end9();
	System.out.println("Testcase54 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase55()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.two();
		obj.one();
		obj.end9();
System.out.println("Testcase55 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase56()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.two();
		obj.two();
		obj.end9();
System.out.println("Testcase56 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase57()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.two();
		obj.end9();
System.out.println("Testcase57 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase58()
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
	System.out.println("Testcase58 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase59()
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
	System.out.println("Testcase59 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase60()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.wait1();
		obj.one();
		obj.end9();
	System.out.println("Testcase60 reaches state:"+obj._fsm.getState().getName());
	}
	public static void testCase61()
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
	System.out.println("Testcase61 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase62()
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
System.out.println("Testcase62 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase63()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.wait1();
		obj.two();
		obj.end9();
	System.out.println("Testcase63 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase64()
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
	System.out.println("Testcase64 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase65()
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
	System.out.println("Testcase65 reaches state:"+obj._fsm.getState().getName());
	}
public static void testCase66()
	{
		Quin obj = new Quin();
		obj.dial();
		obj.star();
		obj.num2();
		obj.wait1();
		obj.wait1();
		obj.star();
		obj.end5();
		System.out.println("Testcase66 reaches state:"+obj._fsm.getState().getName());
	}


}
