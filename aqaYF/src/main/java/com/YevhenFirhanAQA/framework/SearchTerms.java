package com.YevhenFirhanAQA.framework;

import io.cucumber.java.eo.Se;

public enum SearchTerms {

    goPro4k("go pro 4k");

    private final String SearchTerm;

    SearchTerms(String SearchTerm) {
        this.SearchTerm = SearchTerm;
    }

    public String gedSearchTerm() {
        return SearchTerm;
    }

}
