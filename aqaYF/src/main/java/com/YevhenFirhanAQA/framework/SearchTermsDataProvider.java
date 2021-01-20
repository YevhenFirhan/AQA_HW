package com.YevhenFirhanAQA.framework;

import io.cucumber.java.eo.Se;

public class SearchTermsDataProvider {

    public static Object [] [] getAllSearchTerms() {

        Object [] [] searchTerms = new Object [1] [1];
        searchTerms [0] [0] = SearchTerms.goPro4k.gedSearchTerm();
        return searchTerms;
    }
}
