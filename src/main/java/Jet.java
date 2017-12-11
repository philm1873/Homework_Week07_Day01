public class Jet extends Vehicle implements IHelper {
    public Jet(String inputName, int inputHealthValue, int inputAttackValue) {
        super(inputName, inputHealthValue, inputAttackValue);
    }

    public <T> double attack(T inputKaiju) {
        if (inputKaiju instanceof Land) {
            return this.attackValue * 0.1;
        } else {
            return this.attackValue;
        }
    }
}
