public abstract class Vehicle {
    String name;
    double healthValue;
    double attackValue;

    public Vehicle(String inputName, double inputHealthValue, double inputAttackValue) {
        this.name = inputName;
        this.healthValue = inputHealthValue;
        this.attackValue = inputAttackValue;
    }


    public void takeDamage(double damage) {
        this.healthValue = this.healthValue - damage;
    }

    public double getAttackValue() {
        return attackValue;
    }

    public double getHealthValue() {
        return healthValue;
    }
}
