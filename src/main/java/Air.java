public class Air extends Kaiju implements IHelper {
    public Air(String inputName, double inputHealthValue, double inputAttackValue) {
        super(inputName, inputHealthValue, inputAttackValue);
    }

    public <T> double attack(T inputVehicle) {
        if (inputVehicle instanceof Tank) {
            return this.attackValue * 0.1;
        } else {
            return this.attackValue;
        }
    }
}
