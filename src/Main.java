import com.hora.computers.Computer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Computer laptopOfTheBoss;
        laptopOfTheBoss = new Computer("ABC Alfa", 1.6, 15.2, true );
        laptopOfTheBoss.setModel("ABC Alfa 1600");

        System.out.println(laptopOfTheBoss.getModel());

        List<Computer> computerList = new ArrayList<>();
        computerList.add(laptopOfTheBoss);
        computerList.add(new Computer());

    }
}