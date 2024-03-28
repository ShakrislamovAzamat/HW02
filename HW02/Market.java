import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehavior, QueueBehavior {

    List<Actor> actors = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();

    @Override
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getname() + " joined the queue");
    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().isTakeorder();
        System.out.println(actorsQueue.peek().getname() + " took the order");
    }

    @Override
    public void giveOrders() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getname() + " made an order");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getname() + " left the queue");
        actorsQueue.poll();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getname() + " entered the market");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.println(actor.getname() + " left the market");
    }

    @Override
    public void update() {
    }

}
