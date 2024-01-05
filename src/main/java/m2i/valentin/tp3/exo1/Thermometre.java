package m2i.valentin.tp3.exo1;

public class Thermometre {

    public int checkTemperature(int[] temperature) {

        if (temperature.length == 0) {
            return 0;
        }

        int closestToZero = temperature[0];

        for (int index = 1; index < temperature.length; index++) {
            int currentTemperature = temperature[index];
            if (currentTemperature < temperature[index - 1]) {
                closestToZero = currentTemperature;
            }
            if (Math.abs(currentTemperature) == Math.abs(closestToZero)) {
                if (currentTemperature > 0) {
                    closestToZero = currentTemperature;
                }
            }
        }

        return closestToZero;
    }
}
