package com.tms.user_data;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(!checkData());
    }

    public static boolean checkData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Login: ");
        String login = s.nextLine();
        System.out.print("Password: ");
        String password = s.nextLine();
        System.out.print("Confirm password: ");
        String confirmPassword = s.nextLine();
        try {
            DataChecker.check(login,password,confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
