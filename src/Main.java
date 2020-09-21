public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setBossHealth(500);
        boss1.setBossDamage(50);
        boss1.setTypeOfDefence("Physical");

        System.out.println("Информация о боссе: " + boss1.getTypeOfDefence() + " "
                + boss1.getBossDamage() + " " + boss1.getBossHealth());

        private static Hero createHeroes () {
            Hero hero1 = new Hero(20, 100, "IronArms");
            Hero hero2 = new Hero(15, 90, "Teleportation");
            Hero hero3 = new Hero(18, 95, "FrostBite");

            Hero[] allHeroes = {hero1, hero2, hero3};
            return;
        }
        System.out.println(allHeroes);


    }

}
