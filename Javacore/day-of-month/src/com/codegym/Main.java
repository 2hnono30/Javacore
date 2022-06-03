package com.codegym;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng muốn biết có bn ngày?");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 2:
                daysInMonth="28or29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (!daysInMonth.equals("")) System.out.printf("The Month '%xd' has %s days!",month,daysInMonth);
        else System.out.println("invarlid input!");
    }
}
