public class ConvertNumber {
    public int toDecimal(String romanNumber) {
        int decimalNumber = 0;
        int rightNumber = 0;

        romanNumber = romanNumber.toUpperCase();

        for (int index = romanNumber.length() - 1; index >= 0; index--) {
            char caracter = romanNumber.charAt(index);

            int valueCaracter = (int) convertCaracter(caracter);
            decimalNumber += valueCaracter * Math.signum(valueCaracter + 0.5 - rightNumber);
            rightNumber = valueCaracter;
        }

        return decimalNumber;
    }

    private double convertCaracter(char caractere) {
        double tensMultiple = Math.floor(Math.pow(10, "IXCM".indexOf(caractere)));
        double fivesMultiple = 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));

        return tensMultiple + fivesMultiple;
    }
}
