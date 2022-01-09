import java.util.ArrayList;
import java.util.List;

public abstract class Compiler {

    private List<Language> acceptedLanguages = new ArrayList<Language>();

    public void addLanguage(Language language) {
        this.acceptedLanguages.add(language);
    }

    public boolean verifyIfLanguageCanBeTranslated(Language language){
        return this.acceptedLanguages.contains(language);
    }
}
