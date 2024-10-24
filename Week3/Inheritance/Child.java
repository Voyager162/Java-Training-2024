package Week3.Inheritance;

class Child extends Parent {

    String firstName;

    Child(String firstName, String eyeColor, String lastName) {
        super(eyeColor, lastName);
        this.firstName = firstName;
    }
 
    public String printName() {
        return firstName + " " + lastName;
    }

    public String parentEyeColor() {
        return eyeColor;
    }

    public static void main(String[] args) {
        Child me = new Child("weston", "blue", "gardner");
        System.out.println(me.firstName + me.lastName);
        System.out.println(me.lastName);
    }
}

