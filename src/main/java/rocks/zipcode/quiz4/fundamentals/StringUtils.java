package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String front = str.substring(0,str.length()/2);
        String mid = invertCasing(getMiddleCharacter(str).toString());
        String back = str.substring((str.length()/2)+1);
        return front.concat(mid).concat(back);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String front = str.substring(0,str.length()/2);
        String mid = invertCasing(getMiddleCharacter(str).toString());
        String back = str.substring((str.length()/2)+1);
        return front.concat(mid).concat(back);
    }

    public static Boolean isIsogram(String str) {
        Set<Character> charSet = new HashSet<>();
        for(int i =0 ; i < str.length();i++){
            charSet.add(str.charAt(i));
        }
        return str.length() == charSet.size();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String noDups = str;
        for(int i = 1; i < str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i-1) || str.charAt(i) == str.charAt(i+1)){
                noDups = noDups.replaceAll(String.valueOf(str.charAt(i)),"");
            }
        }
        return noDups;
    }

    public static String invertCasing(String str) {
//       Character toInvert = getMiddleCharacter(str);
//       if(Character.isUpperCase(toInvert)){
//           return String.valueOf(toInvert).toLowerCase();
//       }else{
//           return String.valueOf(toInvert).toUpperCase();
//       }
        StringBuilder invertSB = new StringBuilder();
        for(int i =0 ;i < str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                if(Character.isUpperCase(str.charAt(i))){
                    invertSB.append(String.valueOf(str.charAt(i)).toLowerCase());
                }else {
                    invertSB.append(String.valueOf(str.charAt(i)).toUpperCase());

                }
            }else{
                invertSB.append(str.charAt(i));
            }
        }
        return invertSB.toString();
    }
}