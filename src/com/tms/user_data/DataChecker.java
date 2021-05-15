package com.tms.user_data;

public class DataChecker {
    public static boolean check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException
    {
        if(login.length()>20) throw new WrongLoginException("Длинна логина дожна быть меньше 20 символов");
        if(password.length()>20) throw new WrongPasswordException("Длинна пароля дожна быть меньше 20 символов");
        if(checkForSpaces(password)) throw new WrongPasswordException("Пароль не должен содержать пробелов");
        if(!checkForDigits(password)) throw new WrongPasswordException("Пароль должен содержать как минимум одну цифру");
        if(!password.equals(confirmPassword)) throw new WrongPasswordException("Пароли не совпадают");
        return true;
    }

    private static boolean checkForSpaces(String str){
        return str.indexOf(" ") > 0;
    }

    private static boolean checkForDigits(String str){
        for(int i = 0; i < 10; i++){
            if(str.indexOf((char)(i+'0'))>0) return true;
        }
        return false;
    }
}
