package org.example;
import java.util.ArrayList;

public class App 
{
    static ArrayList<String> citiesList = new ArrayList<>();
    static String[] citiesArray = new String[] {"Prague", "Warsaw", "London", "Kyiv"};
    public static void main( String[] args )
    {
        checkCityArrayPrinter(citiesArray, "Warsaw", "Amsterdam");

        populateList();
        checkCityListPrinter(citiesList, "Ternopil", "Lutsk");

        System.out.println("----------");
        System.out.println("Current list: " + citiesList);
        System.out.println("List converted to set:");
        ListsTest.convertListToSet(citiesList);
    }
    public static void checkCityArrayPrinter(String[] citiesArray, String ... cities) {
        boolean result;

        for (String city : cities) {
            result = ListsTest.checkElementInArray(city, citiesArray);
            System.out.println(city + " is in the list - " + result);
        }
    }

    public static void checkCityListPrinter(ArrayList<String> citiesList, String ... cities) {
        boolean result;

        for (String city : cities) {
            result = ListsTest.checkElementInList(city, citiesList);
            System.out.println(city + " is in the list - " + result);
        }
    }

    public static void populateList() {
        citiesList.add("Lviv");
        citiesList.add("Lviv");
        citiesList.add("Rivne");
        citiesList.add("Kyiv");
        citiesList.add("Ternopil");
    }
}
