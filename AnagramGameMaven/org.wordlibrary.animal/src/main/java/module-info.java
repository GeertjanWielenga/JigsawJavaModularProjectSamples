module org.wordlibrary.animal {
    requires com.wordlibrary;
    provides com.wordlibrary.spi.WordLibraryProvider 
            with org.wordlibrary.animal.AnimalWordLibraryProvider;
}
