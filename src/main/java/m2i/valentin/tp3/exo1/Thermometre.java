package m2i.valentin.tp3.exo1;

public class Thermometre {

    public int checkTemperature(int[] temperature) {

        if (temperature.length == 0) {
            return 0;
        }

        return temperature[0];
    }
}
