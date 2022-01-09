public class CompilerFacade {

    public static boolean verifyCompilableLanguages(Language language) {
        if(FrontEnd.getInstance().verifyIfLanguageCanBeTranslated(language))
            return true;
        return false;
    }
}
