package com.tms.user_data;

public class WrongLoginException extends Throwable{
    WrongLoginException(){
        super();
    }
    WrongLoginException(String str){
        super(str);
    }
}
