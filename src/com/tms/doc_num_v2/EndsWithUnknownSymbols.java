package com.tms.doc_num_v2;

import java.io.IOException;
import java.util.Locale;

public class EndsWithUnknownSymbols extends IOException {
    EndsWithUnknownSymbols(){
        super("Your string doesn't begin with '"+ SymConstatns.ENDING_SYM.toLowerCase(Locale.ROOT)+"' or " +
                "'"+ SymConstatns.ENDING_SYM.toUpperCase(Locale.ROOT)+"'");
    }
}
