package com.tms.doc_num_v2;

import java.io.IOException;
import java.util.Locale;

public class InsideSymbolsLoss extends IOException {
    InsideSymbolsLoss(){
        super("Your string doesn't include '"+ SymConstatns.INSIDE_SYM.toLowerCase(Locale.ROOT)+"' or " +
                "'"+ SymConstatns.INSIDE_SYM.toUpperCase(Locale.ROOT)+"'");
    }
}
