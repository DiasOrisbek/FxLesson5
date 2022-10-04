import java.util.ArrayList;
import java.util.Collections;

////CopyPast

////Task1
//
//public class main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//    }
//}


////Task2
//public class main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        cars.add("Bugatti");
//        cars.add("Nissan");
//        cars.add("Toyota");
//        for (int i = 0; i < cars.size(); i++)
//        {
//            System.out.println(cars.get(i));
//        }
//    }
//}


////Task3
//public class main {
//        public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        cars.add("Bugatti");
//        cars.add("Nissan");
//        cars.add("Toyota");
//        for (String i: cars){
//            System.out.println(i);
//        }
//    }
//}

////Task4
//public class main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//    }
//}

////Task5
//public class main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        Collections.sort(cars);// Sort cars
//        for (String i : cars){
//            System.out.println(i);
//        }
//    }
//}

//public class main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>() ;
//        myNumbers. add (33) ;
//        myNumbers.add(15) ;
//        myNumbers.add(20) ;
//        myNumbers. add (34) ;
//        myNumbers. add (8) ;
//        myNumbers.add(12) ;
//        Collections.sort(myNumbers); // Sort myNumbers
//        for (int i : myNumbers) {
//            System.out.println(i) ;
//        }
//    }
//}

//public class main{
//        public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//
//        String car = cars.get(0);
//        System.out.println("get method:" +car);
//
//        cars.set(0, "Opel");
//        System.out.println("set method:" +cars);
//
//        cars.remove( 0);
//        System.out.println("remove method:" +cars);
//
//        cars.clear();
//        System.out.println("clear method:" +cars);
//
//        int s = cars.size();
//        System.out.println("list size" +s);
//        }
//    }

//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Red");
//        colors.add("Blue");
//        colors.add("Pink");
//        colors.add("Gray");
//        colors.add("White");
//
//        System.out.println(colors);
//    }
//}
////CopyPastEnd


////ProblemSolving
////Problem1
//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Red");
//        colors.add("Blue");
//        colors.add("Pink");
//        colors.add("Gray");
//        colors.add("White");
//
//        colors.set(0, "White");
//
//        System.out.println(colors);
//    }
//}

////Problem2
//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> games = new ArrayList<>();
//        games.add("RDR");
//        games.add("RDR2");
//        games.add("Fifa");
//        games.add("CsGo");
//
//        String RDR = games.get(0);
//        System.out.println(RDR);
//    }
//}


////Problem3
//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> games = new ArrayList<>();
//        games.add("RDR");
//        games.add("RDR2");
//        games.add("Fifa");
//        games.add("CsGo");
//
//        String RDR = games.get(0);
//        System.out.println(RDR);
//    }
//}


////Problem4
//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> games = new ArrayList<>();
//        games.add("RDR");
//        games.add("RDR2");
//        games.add("Fifa");
//        games.add("CsGo");
//
//        games.set(3, "Stray");
//        System.out.println(games);
//    }
//}

////Problem5
//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> games = new ArrayList<>();
//        games.add("RDR");
//        games.add("RDR2");
//        games.add("Fifa");
//        games.add("CsGo");
//
//        games.remove(3);
//        System.out.println(games);
//    }
//}


////Problem6
//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> games = new ArrayList<>();
//        games.add("RDR");
//        games.add("RDR2");
//        games.add("Fifa");
//        games.add("CsGo");
//
//        if (games.contains("RDR")) {
//            System.out.println("Found the element");
//        }
//        else{
//            System.out.println("There is no such element");
//        }
//    }
//}


////Problem7
//public class main {
//    public static void main(String[] args) {
//        ArrayList<String> comps = new ArrayList<String>();
//        comps.add("Hp");
//        comps.add("Lenovo");
//        comps.add("Asus");
//        comps.add("Mac");
//        System.out.println("List1: " + comps);
//
//        ArrayList<String> ps = new ArrayList<String>();
//        ps.add("1");
//        ps.add("2");
//        ps.add("3");
//        ps.add("4");
//        System.out.println("List2: " + ps);
//        // Copy List2 to List1
//        Collections.copy(comps, ps);
//        System.out.println("Copy List2 to List1");
//        System.out.println("List1: " + comps);
//    }
//}

////Problem8
//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Red");
//        colors.add("Blue");
//        colors.add("Pink");
//        colors.add("Gray");
//        colors.add("White");
//
//        Collections.shuffle(colors);
//        System.out.println(colors);
//    }
//}

////Problem9
//public class main{
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Red");
//        colors.add("Blue");
//        colors.add("Pink");
//        colors.add("Gray");
//        colors.add("White");
//
//        Collections.reverse(colors);
//        System.out.println(colors);
//    }
//}











