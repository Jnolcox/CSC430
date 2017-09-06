public class PersonTest {
    public static void main(String [] args) {
        Person p1 = new Person(18, "John");
        Person p2 = new Person(25, "Ashley");
        OrderedPair <Person> oi = new OrderedPair<>(p1,p2);

        System.out.println(p1);
        System.out.println(p2);

//        System.out.println("1: " + oi.getFirst().getName() + " " + oi.getFirst().getAge());
//        System.out.println("2: " + oi.getSecond().getName() + " " + oi.getSecond().getAge());

        oi.changeOrder();
        System.out.println("After changing the order:");

        System.out.println(p1);
        System.out.println(p2);
//        System.out.println("1: " + oi.getFirst().getName() + " " + oi.getFirst().getAge());
//        System.out.println("2: " + oi.getSecond().getName() + " " + oi.getSecond().getAge());
    }
}