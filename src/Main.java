public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setBossHealth(500);
        boss1.setBossDamage(50);
        boss1.setTypeOfDefence("Physical");

        System.out.println("Информация о боссе: " + boss1.getTypeOfDefence() + " "
                + boss1.getBossDamage() + " " + boss1.getBossHealth());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Heal Points: " + createHeroes()[i].getHeroesHealth() +  ", Damage: " +
                    createHeroes()[i].getHeroesDamage() + ", Superpower: " + createHeroes()[i].getSuperpower());
        }
    }

        private static Hero[] createHeroes () {
            Hero Axe = new Hero(20, 100, "IronArms");
            Hero Antimag = new Hero(15, 90, "Teleportation");
            Hero Rylai = new Hero(18, 95, "FrostBite");

            Hero[] allHeroes = {Axe, Antimag, Rylai};
            return allHeroes;
        }

    }

