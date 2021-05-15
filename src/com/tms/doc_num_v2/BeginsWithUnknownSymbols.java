package com.tms.doc_num_v2;

import java.io.IOException;
import java.util.Locale;

class BeginsWithUnknownSymbols extends IOException {
    public BeginsWithUnknownSymbols(){
        super("Your string doesn't begin with '"+ SymConstatns.STARTING_SYM.toLowerCase(Locale.ROOT)+"' or" +
                "'"+ SymConstatns.STARTING_SYM.toUpperCase(Locale.ROOT)+"'");
    }
}
