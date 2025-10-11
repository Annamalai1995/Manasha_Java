package Core_Java.Operator;

public class Logical {
    public static void main(String[] args) {
        int alpha=150;
        int beta=250;
        int gamma=20;
        System.out.println(alpha>beta&&beta<gamma);
        System.out.println(alpha<beta||beta<gamma);

        String name="Manasha";
        String name1="manasha";
        String name2="Manasha";
        System.out.println(name1==name && name2==name);
        System.out.println(name1==name || name==name2);
        System.out.println(!(name==name2));

    }
}
