public class main {
    public static void main(String[] args) 
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();;
        mallard.performFly();   

        Duck poorDuck = new ModelDuck();
        poorDuck.performFly();
        poorDuck.performQuack();

        poorDuck.setFlyBehaviour(new FlyRocketPowered());
        poorDuck.performFly();
    }
}
