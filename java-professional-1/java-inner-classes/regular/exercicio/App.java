package regular.exercicio;

public class App {

    public static void main(String[] args) {

        Hero hero = new Hero(12);

        Hero.Weapon weapon = hero.new Weapon();

        weapon.shoot();
        weapon.shoot();
        weapon.shoot();

        System.out.println(hero.getAmmo());
    }
}
