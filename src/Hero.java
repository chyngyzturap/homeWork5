public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String superpower;

    public Hero(int heroesDamage, int heroesHealth, String superpower) {
        this.heroesDamage = heroesDamage;
        this.heroesHealth = heroesHealth;
        this.superpower = superpower;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;

    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getSuperpower() {
        return superpower;
    }
}