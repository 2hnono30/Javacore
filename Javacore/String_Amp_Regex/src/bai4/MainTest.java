package bai4;

public class MainTest {
    public static final String[] validClassName = new String[] { "C0318G" };
    public static final String[] invaliClassName = new String[] { "M0318G", "P0323A"};
    public static void main(String[] args) {
        Main main = new Main();
        for (String className : validClassName) {
            boolean isvalid = main.validate(className);
            System.out.println("className is " + className +" is valid: "+ isvalid);
        }
        for (String className : invaliClassName) {
            boolean isvalid = main.validate(className);
            System.out.println("className is " + className +" is valid: "+ isvalid);
        }
    }
}
