package quindonc;
public class Quin{ 
public QuinContext _fsm;
public Quin() {_fsm = new QuinContext(this);}
public void dial() { _fsm.dial();}
public void wait1() { _fsm.wait1();}
public void star() { _fsm.star();}
public void num1() { _fsm.num1();}
public void num2() { _fsm.num2();}
public void bad() { _fsm.bad();}
public void one() { _fsm.one();}
public void two() { _fsm.two();}
public void eighteen() { _fsm.eighteen();}
public void end1() { _fsm.end1();}
public void end2() { _fsm.end2();}
public void end3() { _fsm.end3();}
public void end4() { _fsm.end4();}
public void end5() { _fsm.end5();}
public void end6() { _fsm.end6();}
public void end7() { _fsm.end7();}
public void end8() { _fsm.end8();}
public void end9() { _fsm.end9();}
public void end10() { _fsm.end10();}
public void end11() { _fsm.end11();}
}