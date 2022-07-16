public class Main {
    public static void main(String[] args) 
    {

        Character queenElizabeth = new Queen();
        queenElizabeth.setWeapon(new KnifeBehaviour());
        queenElizabeth.fight();

        queenElizabeth.setWeapon(new SwordBehaviour());
        queenElizabeth.fight();
    }
    
}
