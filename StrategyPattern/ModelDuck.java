public class ModelDuck extends Duck {


    public ModelDuck () 
    {
        this.setFlyBehaviour(new FlyNoWay());
        this.setQuackBehaviour(new Quack());

    }


    @Override
    public void display () 
    {
        System.out.println("I am Poor Duck");
    }
    
}
