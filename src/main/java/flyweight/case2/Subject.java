package flyweight.case2;

public class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
        System.out.println("create : " + name);
    }
}
