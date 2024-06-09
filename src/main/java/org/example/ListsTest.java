package org.example;
import java.util.ArrayList;
import java.util.HashSet;

public class ListsTest {

    // One type of for loop
    public static boolean checkElementInArray(String element, String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Another type of for loop + dded a keyword here
    public static boolean checkElementInList(String element, ArrayList<String> stringList) {
        boolean isElementInList = false;
        for (String string : stringList) {
            if (string.equals(element)) {
                isElementInList = true;
                break;
            }
        }
        return isElementInList;
    }

    public static void convertListToSet(ArrayList<String> stringList) {
        HashSet<String> stringSet = new HashSet<>(stringList);
        System.out.println(stringSet);
    }
}
