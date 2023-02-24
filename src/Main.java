import inheritance.Child;
import inheritance.Parent;
import inheritance.SubClass;
import inheritance.SuperClass;

public class Main {
    public static void main(String[] args) {
        Parent baby = new Parent();
        baby.showMessage();
        SuperClass babe = new SubClass();
        babe.showMessage();
    }
}