public class Tank extends Vehicle implements IHelper {

    public Tank(String inputName, double inputHealthValue, double inputAttackValue) {
        super(inputName, inputHealthValue, inputAttackValue);
    }


    public <T> double attack(T inputKaiju) {
        if (inputKaiju instanceof Air) {
            return this.attackValue * 0.1;
        } else {
            return this.attackValue;
        }
    }

}
