//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("The value is 3, 4 or 5");
                break;
            default:
                System.out.println("The value is not 1, 2, 3, 4 or 5");
        }
    }
}