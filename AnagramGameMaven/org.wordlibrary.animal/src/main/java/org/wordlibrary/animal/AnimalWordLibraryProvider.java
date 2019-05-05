package org.wordlibrary.animal;

import com.wordlibrary.WordLibrary;
import com.wordlibrary.spi.WordLibraryProvider;

public class AnimalWordLibraryProvider extends WordLibraryProvider {

    public AnimalWordLibraryProvider() {
    }

    @Override
    public WordLibrary openWordLibrary() {
        return new AnimalWordLibrary();
    }

}
