public abstract class Kaiju {
    String name;
    double healthValue;
    double attackValue;

    public Kaiju(String inputName, double inputHealthValue, double inputAttackValue) {
        this.name = inputName;
        this.healthValue = inputHealthValue;
        this.attackValue = inputAttackValue;
    }

    public String roar() {
        return "RAAAAAAR";
    }

    public void takeDamage(double damage) {
        this.healthValue = this.healthValue - damage;
    }


}
