public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Christian", 42);
        Person p2 = new Person("Jens", 65);
        Person p3 = new Person("Berit", 19);
        Person p4 = new Person("Lucas", 45);



        LivingRoom room1 =
            new LivingRoom("My favorite living room");

        System.out.println(room1.getPersonInChair());

        room1.setPersonInChair(p1);
        System.out.println(room1.getPersonInChair().getName());
        System.out.println("The number of people is: " + room1.getNumberOfPeople());

        room1.setPersonInCouchPosition1(p2);
        room1.setPersonInCouchPosition2(p3);
        System.out.println("The number of people is: " + room1.getNumberOfPeople());

        room1.setPersonInCouchPosition1(p4);
        System.out.println("The number of people is: " + room1.getNumberOfPeople());

    }
}
