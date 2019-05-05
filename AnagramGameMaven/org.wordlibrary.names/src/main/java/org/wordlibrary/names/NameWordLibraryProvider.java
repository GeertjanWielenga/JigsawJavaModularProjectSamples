package org.wordlibrary.names;

import com.wordlibrary.WordLibrary;
import com.wordlibrary.spi.WordLibraryProvider;

public class NameWordLibraryProvider extends WordLibraryProvider {

    public NameWordLibraryProvider() {
    }

    @Override
    public WordLibrary openWordLibrary() {
        return new NameWordLibrary();
    }

}
