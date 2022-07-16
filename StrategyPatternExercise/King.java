public class King extends Character 
{
    @Override
    public void fight() 
    {
        System.out.println("King Fighting");
        weapon.useWeapon();
    } 

}