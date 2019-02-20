/*
 * ex: set ro:
 * DO NOT EDIT.
 * generated by smc (http://smc.sourceforge.net/)
 * from file : Cruise.sm
 */

package cruisecontrol_stateremoved;


public class CruiseContext
    extends statemap.FSMContext
{
//---------------------------------------------------------------
// Member methods.
//

    public CruiseContext(Cruise owner)
    {
        this (owner, MainMap.Inactive);
    }

    public CruiseContext(Cruise owner, CruiseState initState)
    {
        super (initState);

        _owner = owner;
    }

    @Override
    public void enterStartState()
    {
        getState().entry(this);
        return;
    }

    public void EndActive()
    {
        _transition = "EndActive";
        getState().EndActive(this);
        _transition = "";
        return;
    }

    public void EndCrusing()
    {
        _transition = "EndCrusing";
        getState().EndCrusing(this);
        _transition = "";
        return;
    }

    public void EndInactive()
    {
        _transition = "EndInactive";
        getState().EndInactive(this);
        _transition = "";
        return;
    }

    public void T1()
    {
        _transition = "T1";
        getState().T1(this);
        _transition = "";
        return;
    }

    public void T10()
    {
        _transition = "T10";
        getState().T10(this);
        _transition = "";
        return;
    }

    public void T11()
    {
        _transition = "T11";
        getState().T11(this);
        _transition = "";
        return;
    }

    public void T12()
    {
        _transition = "T12";
        getState().T12(this);
        _transition = "";
        return;
    }

    public void T13()
    {
        _transition = "T13";
        getState().T13(this);
        _transition = "";
        return;
    }

    public void T14()
    {
        _transition = "T14";
        getState().T14(this);
        _transition = "";
        return;
    }

    public void T15()
    {
        _transition = "T15";
        getState().T15(this);
        _transition = "";
        return;
    }

    public void T16()
    {
        _transition = "T16";
        getState().T16(this);
        _transition = "";
        return;
    }

    public void T17()
    {
        _transition = "T17";
        getState().T17(this);
        _transition = "";
        return;
    }

    public void T18()
    {
        _transition = "T18";
        getState().T18(this);
        _transition = "";
        return;
    }

    public void T2()
    {
        _transition = "T2";
        getState().T2(this);
        _transition = "";
        return;
    }

    public void T3()
    {
        _transition = "T3";
        getState().T3(this);
        _transition = "";
        return;
    }

    public void T4()
    {
        _transition = "T4";
        getState().T4(this);
        _transition = "";
        return;
    }

    public void T5()
    {
        _transition = "T5";
        getState().T5(this);
        _transition = "";
        return;
    }

    public void T6()
    {
        _transition = "T6";
        getState().T6(this);
        _transition = "";
        return;
    }

    public void T7()
    {
        _transition = "T7";
        getState().T7(this);
        _transition = "";
        return;
    }

    public void T8()
    {
        _transition = "T8";
        getState().T8(this);
        _transition = "";
        return;
    }

    public void T9()
    {
        _transition = "T9";
        getState().T9(this);
        _transition = "";
        return;
    }

    public CruiseState getState()
        throws statemap.StateUndefinedException
    {
        if (_state == null)
        {
            throw(
                new statemap.StateUndefinedException());
        }

        return ((CruiseState) _state);
    }

    protected Cruise getOwner()
    {
        return (_owner);
    }

    public void setOwner(Cruise owner)
    {
        if (owner == null)
        {
            throw (
                new NullPointerException(
                    "null owner"));
        }
        else
        {
            _owner = owner;
        }

        return;
    }

//---------------------------------------------------------------
// Member data.
//

    transient private Cruise _owner;

    //-----------------------------------------------------------
    // Constants.
    //

    private static final long serialVersionUID = 1L;

//---------------------------------------------------------------
// Inner classes.
//

    public static abstract class CruiseState
        extends statemap.State
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected CruiseState(String name, int id)
        {
            super (name, id);
        }

        protected void entry(CruiseContext context) {}
        protected void exit(CruiseContext context) {}

        protected void EndActive(CruiseContext context)
        {
            Default(context);
        }

        protected void EndCrusing(CruiseContext context)
        {
            Default(context);
        }

        protected void EndInactive(CruiseContext context)
        {
            Default(context);
        }

        protected void T1(CruiseContext context)
        {
            Default(context);
        }

        protected void T10(CruiseContext context)
        {
            Default(context);
        }

        protected void T11(CruiseContext context)
        {
            Default(context);
        }

        protected void T12(CruiseContext context)
        {
            Default(context);
        }

        protected void T13(CruiseContext context)
        {
            Default(context);
        }

        protected void T14(CruiseContext context)
        {
            Default(context);
        }

        protected void T15(CruiseContext context)
        {
            Default(context);
        }

        protected void T16(CruiseContext context)
        {
            Default(context);
        }

        protected void T17(CruiseContext context)
        {
            Default(context);
        }

        protected void T18(CruiseContext context)
        {
            Default(context);
        }

        protected void T2(CruiseContext context)
        {
            Default(context);
        }

        protected void T3(CruiseContext context)
        {
            Default(context);
        }

        protected void T4(CruiseContext context)
        {
            Default(context);
        }

        protected void T5(CruiseContext context)
        {
            Default(context);
        }

        protected void T6(CruiseContext context)
        {
            Default(context);
        }

        protected void T7(CruiseContext context)
        {
            Default(context);
        }

        protected void T8(CruiseContext context)
        {
            Default(context);
        }

        protected void T9(CruiseContext context)
        {
            Default(context);
        }

        protected void Default(CruiseContext context)
        {
            throw (
                new statemap.TransitionUndefinedException(
                    "State: " +
                    context.getState().getName() +
                    ", Transition: " +
                    context.getTransition()));
        }

    //-----------------------------------------------------------
    // Member data.
    //

        //-------------------------------------------------------
    // Constants.
    //

        private static final long serialVersionUID = 1L;
    }

    /* package */ static abstract class MainMap
    {
    //-----------------------------------------------------------
    // Member methods.
    //

    //-----------------------------------------------------------
    // Member data.
    //

        //-------------------------------------------------------
        // Constants.
        //

        public static final MainMap_Inactive Inactive =
            new MainMap_Inactive("MainMap.Inactive", 0);
        public static final MainMap_Active Active =
            new MainMap_Active("MainMap.Active", 1);
        public static final MainMap_Crusing Crusing =
            new MainMap_Crusing("MainMap.Crusing", 2);
        public static final MainMap_Final Final =
            new MainMap_Final("MainMap.Final", 3);
    }

    protected static class MainMap_Default
        extends CruiseState
    {
    //-----------------------------------------------------------
    // Member methods.
    //

        protected MainMap_Default(String name, int id)
        {
            super (name, id);
        }

    //-----------------------------------------------------------
    // Member data.
    //

        //---------------------------------------------------
        // Constants.
        //

        private static final long serialVersionUID = 1L;
    }

    private static final class MainMap_Inactive
        extends MainMap_Default
    {
    //-------------------------------------------------------
    // Member methods.
    //

        private MainMap_Inactive(String name, int id)
        {
            super (name, id);
        }

        @Override
        protected void EndInactive(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Final);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T1(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Inactive);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T2(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Inactive);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T3(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Inactive);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T4(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Inactive);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T5(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Active);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T6(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Inactive);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T7(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Inactive);
            (context.getState()).entry(context);
            return;
        }

    //-------------------------------------------------------
    // Member data.
    //

        //---------------------------------------------------
        // Constants.
        //

        private static final long serialVersionUID = 1L;
    }

    private static final class MainMap_Active
        extends MainMap_Default
    {
    //-------------------------------------------------------
    // Member methods.
    //

        private MainMap_Active(String name, int id)
        {
            super (name, id);
        }

        @Override
        protected void EndActive(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Final);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T10(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Active);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T11(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Active);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T12(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Active);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T13(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Active);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T14(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Crusing);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T8(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Inactive);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T9(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Active);
            (context.getState()).entry(context);
            return;
        }

    //-------------------------------------------------------
    // Member data.
    //

        //---------------------------------------------------
        // Constants.
        //

        private static final long serialVersionUID = 1L;
    }

    private static final class MainMap_Crusing
        extends MainMap_Default
    {
    //-------------------------------------------------------
    // Member methods.
    //

        private MainMap_Crusing(String name, int id)
        {
            super (name, id);
        }

        @Override
        protected void EndCrusing(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Final);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T15(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Inactive);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T16(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Crusing);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T17(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Crusing);
            (context.getState()).entry(context);
            return;
        }

        @Override
        protected void T18(CruiseContext context)
        {

            (context.getState()).exit(context);
            context.setState(MainMap.Crusing);
            (context.getState()).entry(context);
            return;
        }

    //-------------------------------------------------------
    // Member data.
    //

        //---------------------------------------------------
        // Constants.
        //

        private static final long serialVersionUID = 1L;
    }

    private static final class MainMap_Final
        extends MainMap_Default
    {
    //-------------------------------------------------------
    // Member methods.
    //

        private MainMap_Final(String name, int id)
        {
            super (name, id);
        }

    //-------------------------------------------------------
    // Member data.
    //

        //---------------------------------------------------
        // Constants.
        //

        private static final long serialVersionUID = 1L;
    }
}

/*
 * Local variables:
 *  buffer-read-only: t
 * End:
 */
