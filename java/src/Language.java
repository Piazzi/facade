public class Language {

    public boolean compile() {
        return CompilerFacade.verifyCompilableLanguages(this);
    }
}
