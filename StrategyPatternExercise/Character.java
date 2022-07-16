public abstract class Character {

    WeaponBehaviour weapon;

    public void setWeapon(WeaponBehaviour w) 
    {
        this.weapon = w;
    }
    public abstract void fight();
}
