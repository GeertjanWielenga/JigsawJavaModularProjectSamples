package org.wordlibrary.technical;

import com.wordlibrary.WordLibrary;
import com.wordlibrary.spi.WordLibraryProvider;

public class TechnicalWordLibraryProvider extends WordLibraryProvider {

    public TechnicalWordLibraryProvider() {
    }

    @Override
    public WordLibrary openWordLibrary() {
        return new TechnicalWordLibrary();
    }

}
