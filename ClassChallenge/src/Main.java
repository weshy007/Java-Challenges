public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


//        Wall wall = new Wall(5,4);
//        System.out.println("area= " + wall.getArea());
//
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());


//        Customer weshy = new Customer("Weshy", 1000.0, "weshy@weshy.co");

//        Account weshysAccount = new Account("12345", 1000.00, "Weshy Joe",
//                "weshyjoes@gmail.com", "(254) 101-236688");

//        Account weshysAccount = new Account();

//        Account weshysAccount = new Account();
//
//        weshysAccount.setAccountNumber("12345678");
//        weshysAccount.setAccountBalance(1000);
//        weshysAccount.setCustomerName("Weshy Joe");
//        weshysAccount.setEmail("weshyjoe@weshy.com");
//        weshysAccount.setPhoneNumber("(254)703-536688");

//        weshysAccount.withdrawFunds(100.0);
//        weshysAccount.depositFunds(500.0);
//        weshysAccount.withdrawFunds(2700.0);

//        SimpleCalculator calculator = new SimpleCalculator();

//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Person person = new Person();

//        person.setFirstName("");// firstName is set to empty string
//        person.setLastName(""); // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John"); // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith"); // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

    }
}