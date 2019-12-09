package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }
//redo
    public static String[] removeMiddleElement(String[] values) {
        String[] newArray = new String [values.length -1];
        int count = 0;
        for(int i =0 ; i <= values.length -1; i++){
            if(values[i].equals(getMiddleElement(values))){
                continue;
            }
            newArray[count] = values[i];
            count++;
        }
        return newArray;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values,values.length-1);
    }
}