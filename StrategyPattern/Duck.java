
public abstract class Duck 
{
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    //Constructor 

    public Duck() {}

    // Methods
    public void performQuack() {
        quackBehaviour.quack();
    }
    public void swim() 
    {
        System.out.println("Mom, i'm SWIMMING");
    }
    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    } 

    public void setQuackBehaviour(QuackBehaviour qb) 
    {
        this.quackBehaviour = qb;
    }
    public abstract void display();
    public void performFly() 
    {
        flyBehaviour.fly();
    }




}