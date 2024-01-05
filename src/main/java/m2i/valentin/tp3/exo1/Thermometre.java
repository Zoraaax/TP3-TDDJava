package m2i.valentin.tp3.exo1;

public class Thermometre {

    public int checkTemperature(int[] temperature) {

        int[] emptyArray = {};

        if (temperature == emptyArray) {
            return 0;
        }

        return temperature[0];
    }
}
