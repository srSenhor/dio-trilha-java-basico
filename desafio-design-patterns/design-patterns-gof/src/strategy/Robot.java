package strategy;

public class Robot {

    private Act action;

    public Robot() {
        super();
        setAction(new NormalAct());
    }

    public void setAction(Act action) {
        this.action = action;
    }

    public void doAct() {
        action.doAct();
    }

}
