public class Main {

    public static void main(String[] args) {

        Human human = new Human(null);
        human.name = "Vovan";

        Market market = new Market();
        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
        market.update();

    }
}
