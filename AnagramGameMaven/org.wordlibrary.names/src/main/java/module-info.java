
module org.wordlibrary.names {
    requires com.wordlibrary;
    provides com.wordlibrary.spi.WordLibraryProvider
            with org.wordlibrary.names.NameWordLibraryProvider;
}
