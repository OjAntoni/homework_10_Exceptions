package com.tms.user_data;

public class WrongPasswordException extends Throwable{
    WrongPasswordException(){
        super();
    }

    WrongPasswordException(String str){
        super(str);
    }
}
