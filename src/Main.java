public class Main {
    public static void main(String[] args) {
        Person person =new Person();
        person.firsname="Oksana";
        person.lastname="Saidilkanova";
        person.age=20;
        person.gender="jenskii";
        person.country="Kirgizia";
        person.birth="Dekabr";

        System.out.println(person.study(" Peaksoft" ));
        System.out.println(person.eat(" Vypechku"));
    }
}