package m2i.valentin.tp3.exo1;

public class Thermometre {

    /**
     * Retourne la température la plus proche de 0.
     * @param temperature
     * @return int - température la plus proche de 0
     * @throws IllegalArgumentException
     */
    public int checkTemperature(int[] temperature) throws IllegalArgumentException {

        throwExceptionIfTemperatureArrayIsTooLong(temperature);

        checkIfTemperatureArrayIsEmpty(temperature);

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

    /**
     * Retourne 0 si le tableau des températures est vide.
     * @param temperature
     * @return int - 1 si le tableau des températures n'est pas vide
     */
    private int checkIfTemperatureArrayIsEmpty(int[] temperature) {
        if (temperature.length == 0) {
            return 0;
        }
        return 1;
    }

    /**
     * Lève une exception si le tableau des températures est trop grand.
     * @param temperature
     */
    private void throwExceptionIfTemperatureArrayIsTooLong(int[] temperature) {
        if (temperature.length > 1000) {
            throw new IllegalArgumentException("Le tableau des températures doit être inférieur à 1000 éléments.");
        }
    }
}
