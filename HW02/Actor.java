public abstract class Actor implements ActorBehavior {

    protected boolean isMakeOrder;
    protected boolean isTakeorder;
    protected String name;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getname();

}
