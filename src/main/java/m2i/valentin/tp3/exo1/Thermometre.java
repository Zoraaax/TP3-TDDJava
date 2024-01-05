package m2i.valentin.tp3.exo1;

public class Thermometre {

    public int checkTemperature(int[] temperature) {

        int index;

        if (temperature.length == 0) {
            return 0;
        }

        for(index = 0; index < temperature.length; index++) {
            if (temperature[index] < temperature[index + 1]) {
                return temperature[index];
            }
        }

        return 0;
    }
}
