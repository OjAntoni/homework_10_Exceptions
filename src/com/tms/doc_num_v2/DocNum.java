package com.tms.doc_num_v2;

import com.tms.doc_num_v2.BeginsWithUnknownSymbols;

import java.util.Scanner;

public class DocNum {
    public static void main(String[] args) {
        System.out.println("x - число, у - буква");
        System.out.println("xxxx-yyy-xxxx-yyy-xyxy");
        Scanner s = new Scanner(System.in);
        String doc = s.nextLine();
        s.close();
        divide();
        System.out.println(DocNumHelper.onlyLetters(doc));
        divide();
        System.out.println(DocNumHelper.onlyLettersExtend(doc));
        divide();
        System.out.println(DocNumHelper.fillWithStars(doc));
        divide();
        System.out.println(DocNumHelper.getDigitBlocks(doc));
        divide();
        try{
            DocNumHelper.startsWithSym(doc);
        } catch (BeginsWithUnknownSymbols e) {
            System.out.println(e.getMessage());
        }
        divide();
        try{
            DocNumHelper.endsWithSym(doc);
        } catch (EndsWithUnknownSymbols e){
            System.out.println(e.getMessage());
        }
        divide();
        try{
            DocNumHelper.searchForInsideSym(doc);
        } catch (InsideSymbolsLoss e){
            System.out.println(e.getMessage());
        }
        divide();
    }

    private static void divide(){
        for(int i =0; i < 35; i++) System.out.print("-");
        System.out.println();
    }
}
