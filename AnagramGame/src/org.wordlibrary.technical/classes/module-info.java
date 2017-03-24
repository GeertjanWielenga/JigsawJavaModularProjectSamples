module org.wordlibrary.technical {
    requires com.wordlibrary;
    provides com.wordlibrary.spi.WordLibraryProvider 
            with org.wordlibrary.technical.TechnicalWordLibraryProvider;
}
