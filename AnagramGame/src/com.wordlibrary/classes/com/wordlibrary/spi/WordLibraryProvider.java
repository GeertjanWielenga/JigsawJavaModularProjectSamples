package com.wordlibrary.spi;

import com.wordlibrary.WordLibrary;

public abstract class WordLibraryProvider {

    protected WordLibraryProvider() {
    }
    
    public abstract WordLibrary openWordLibrary();

}
