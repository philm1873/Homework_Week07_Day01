public class Land extends Kaiju implements IHelper {
    public Land(String inputName, double inputHealthValue, double inputAttackValue) {
        super(inputName, inputHealthValue, inputAttackValue);
    }

    public <T> double attack(T inputVehicle) {
        if (inputVehicle instanceof Jet) {
            return this.attackValue * 0.1;
        } else {
            return this.attackValue;
        }
    }

}
