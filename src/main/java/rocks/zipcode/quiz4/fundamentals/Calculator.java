package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return Math.pow(value,2);
    }

    public static Double[] squareRoots(Double... value) {
        Double[] squareRootArr = new Double[value.length];
        for (int i = 0; i < value.length; i++) {
            squareRootArr[i] = squareRoot(value[i]);
        }
        return squareRootArr;
    }

    public static Double[] squares(Double... values) {
        Double[] l7s = new Double[values.length];
        for (int i = 0; i < values.length; i++) {
            l7s[i] = square(values[i]);
        }
        return l7s;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
