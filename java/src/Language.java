public class Language {

    public boolean compile() {
        return LanguageFacade.verifyCompilableLanguages(this);
    }
}
