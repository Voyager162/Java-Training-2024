public class Me {
    String name;
    int age;
    Me(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void name() {
        System.out.println(name);
    }
    void age() {
        System.out.println(age);
    }
}

class Main {
    public static void main(String[] args) {
        Me weston = new Me("Weston", 16);
        weston.name();
        weston.age();
    }
}