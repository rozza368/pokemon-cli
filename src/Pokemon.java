public class Pokemon {

    private class Initialise {

        private int health;
        private int maxHealth;
        private int level;
        private int damage;
        String type;


        public Initialise(int maxHealth, int level, int damage, String type) {
            int health = maxHealth;
        }


        void changeHealth(int amount) {
            health += amount;

            if (health < 0) {
                health = 0;
            } else if (health > maxHealth) {
                health = maxHealth;
            }
        }


        int getHealth() {
            return health;
        }


        int getLevel() {
            return level;
        }


        int attackDamage() {
            int chance = (int)Math.floor(Math.random()*10); // random, 0-9

            if (chance == 0) { // 1 in 10 chance to crit
                return damage * 2;
            }
            else {
                return damage;
            }
        }
    }

    Initialise test = new Initialise(10, 1, 3, "fire");
}