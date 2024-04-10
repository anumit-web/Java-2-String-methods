/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode2.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode2
*/

// import

public class JavaCode2 {

    public static void main(String[] args) {
        System.out.println("Java Code 2");
        System.out.println("Java Strings");

        // print string
        String lord_of_the_rings_1 = "The Lord of the Rings: The Fellowship of the Ring (2001)";
        String lord_of_the_rings_2 = "The Lord of the Rings: The Two Towers (2002)";
        String lord_of_the_rings_3 = "The Lord of the Rings: The Return of the King (2003)";

        // String length
        System.out.println("" + lord_of_the_rings_1);
        System.out.println("The length of the txt string is: " + lord_of_the_rings_1.length());

        // String upper case and lower case
        System.out.println(lord_of_the_rings_2);
        System.out.println(lord_of_the_rings_2.toUpperCase());
        System.out.println(lord_of_the_rings_2.toLowerCase());

        // Finding a Character in a String
        System.out.println(lord_of_the_rings_3.indexOf("Rings"));

        // String replace method
        String IPaddress = "104.21.68.182"; // Official Massachusetts Travel Guide - visitma.com
        String defanged_IPaddress = IPaddress.replace(".", "[.]");
        System.out.println("Original = " + IPaddress + ", New = " + defanged_IPaddress);

        // Find a character in a string 
        String mithril = "Mithril";
        char character_found = mithril.charAt(3); // 0 based indexing
        System.out.println("String = " + mithril + ", Character at index 3 = " + character_found);

        // Array of strings
        String[] lord_of_the_rings_cities = {"Minas Tirith", "Gondor", "Edoras" };
        for (int i =0; i < lord_of_the_rings_cities.length; i++) {
            System.out.println(lord_of_the_rings_cities[i]);
        }

        // String equals 
        String city1 = "Lindon";
        System.out.println("Lindon string equals = " + city1.equals("Lindon"));

        String lord_of_the_rings_best_quote = "One ring to rule them all, one ring to find them, one ring to bring them all and in the darkness bind them.";

        


    }
    
}