public class Method2 {
    // my own method
    static void myMethod(String fName){
        System.out.println(fName + " Potter");
    }
    static void secondMethod(String fName, String lName){
        System.out.println(fName + " " + lName);
    }
    // create method 3, passing 3 parameters fName, mName, lName
    static void thirdMethod(String fName, String mName, String lName){
        System.out.println(fName+ " "+mName+" "+lName);
    }

    public static void main(String[] args) {
        // pass on parameters values
        myMethod("James");
        myMethod("Lilly");
        // now your turn, pass on two more first names on your method calling
        myMethod("Bill" );
        myMethod("Pedro");
        secondMethod("Albus", "Dumbledore");
        thirdMethod ("Draco", "Lucius", "Malfoy");

    }
}
