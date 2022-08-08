package bai5;

import bai4.Main;

public class PhoneExampleTest {
    public static final String[] validPhone = new String[] { "(84)-(0978489648)" };
    public static final String[] invaliPhone = new String[] { "(a8)-(22222222)"};
    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        for (String Phone : validPhone) {
            boolean isvalid = phoneExample.validate(Phone);
            System.out.println("Phone is " + Phone +" is valid: "+ isvalid);
        }
        for (String Phone : invaliPhone) {
            boolean isvalid = phoneExample.validate(Phone);
            System.out.println("Phone is " + Phone +" is valid: "+ isvalid);
        }
    }
}
