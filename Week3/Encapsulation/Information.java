package Week3.Encapsulation;

public class Information {
    private String name;
    private int age;
    private char gender;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public boolean canGetDrunk() {
        if (age >= 21) {
            return true;
        }
        return false;
    }
    
}


class Main {
    public static void main(String[] args) {
        Information weston = new Information();
        weston.setName("weston");
        weston.setAge(16);
        weston.setGender('m');
        Information bob = new Information();
        bob.setName("bob");
        bob.setAge(23);
        bob.setGender('m');
        System.out.println(weston.canGetDrunk() + weston.getName() + weston.getGender());
        System.out.println(bob.canGetDrunk() + bob.getName() + bob.getGender());
    }
}