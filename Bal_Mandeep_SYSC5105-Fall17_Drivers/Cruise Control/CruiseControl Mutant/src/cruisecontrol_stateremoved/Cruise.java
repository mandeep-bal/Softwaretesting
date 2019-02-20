package cruisecontrol_stateremoved;
public class Cruise {
public CruiseContext _fsm;
public Cruise() { _fsm = new CruiseContext(this); }
public void T1() { _fsm.T1(); }
public void T2() { _fsm.T2(); }
   public void T3() { _fsm.T3(); }
   public void T4() { _fsm.T4(); }
   public void T5() { _fsm.T5(); }
   public void T6() { _fsm.T6(); }
   public void T7() { _fsm.T7(); }
public void EndInactive() { _fsm.EndInactive(); }
   public void T9() { _fsm.T9(); }
   public void T10() { _fsm.T10(); }
   public void T11() { _fsm.T11(); }
   public void T12() { _fsm.T12(); }
   public void T13() { _fsm.T13(); }
public void T14() { _fsm.T14(); }
   public void T8() { _fsm.T8(); }
   public void EndActive() { _fsm.EndActive(); }
   public void T15() { _fsm.T15(); }
   public void T16() { _fsm.T16(); }
   public void T17() { _fsm.T17(); }
   public void T18() { _fsm.T18(); }
   public void T19() { _fsm.T19(); }
public void T20() { _fsm.T20(); }
   public void T21() { _fsm.T21(); }
   public void EndCrusing() { _fsm.EndCrusing(); }
   public void T27() { _fsm.T27(); }
   public void T28() { _fsm.T28(); }
   public void T23() { _fsm.T23(); }
   public void T24() { _fsm.T24(); }
   public void T25() { _fsm.T25(); }
public void T26() { _fsm.T26(); }
   public void T22() { _fsm.T22(); }
   public void EndStandby() { _fsm.EndStandby(); }
}