import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        IHelper godzilla = new Land("Godzilla", 500, 200);
        IHelper mothra = new Air("Mothra", 250, 100);
        IHelper battleTank = new Tank("Battle Tank", 100, 60);
        IHelper f35 = new Jet("F35", 80, 90);

        ArrayList<IHelper> belligerents = new ArrayList<>(Arrays.asList(godzilla, mothra, battleTank, f35));



    }
}
