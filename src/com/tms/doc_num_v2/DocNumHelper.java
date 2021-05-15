package com.tms.doc_num_v2;

import com.tms.doc_num_v2.BeginsWithUnknownSymbols;

public class DocNumHelper {

    public static String onlyLetters(String doc){
        return getString(doc);
    }

    public static String onlyLettersExtend(String doc){
        return "Letters: " + getString(doc).toString().toUpperCase();
    }

    public static void searchForInsideSym(String doc) throws InsideSymbolsLoss {
        if(doc.contains(SymConstatns.INSIDE_SYM) || doc.contains(SymConstatns.INSIDE_SYM.toUpperCase()))
            System.out.println("содержит");
        else
            throw new InsideSymbolsLoss();
    }

    public static String getDigitBlocks(String doc){
        String[] array =doc.split("-");
        return array[0]+array[2];
    }

    public static String fillWithStars(String doc){
        String[] array =doc.split("-");
        array[1]="***";
        array[3]="***";
        StringBuilder docNum2 = new StringBuilder();
        for(String s : array) docNum2.append(s).append("-");
        return docNum2.toString();
    }

    public static void startsWithSym(String s) throws BeginsWithUnknownSymbols {
        if(s.startsWith(SymConstatns.STARTING_SYM))
            System.out.println("Начинается с "+ SymConstatns.STARTING_SYM);
        else
            throw new BeginsWithUnknownSymbols();
    }

    public static void endsWithSym(String s) throws EndsWithUnknownSymbols {
        if(s.endsWith(SymConstatns.ENDING_SYM))
            System.out.println("Заканчивается на "+ SymConstatns.ENDING_SYM);
        else
            throw new EndsWithUnknownSymbols();
    }

    private static String getString(String doc) {
        StringBuilder docLetters = new StringBuilder();
        char[] array2 = doc.toLowerCase().toCharArray();
        docLetters.append(array2[5]);
        docLetters.append(array2[6]);
        docLetters.append(array2[7]);
        docLetters.append("/");
        docLetters.append(array2[14]);
        docLetters.append(array2[15]);
        docLetters.append(array2[16]);
        docLetters.append("/");
        docLetters.append(array2[19]);
        docLetters.append("/");
        docLetters.append(array2[21]);
        return docLetters.toString();
    }
}

