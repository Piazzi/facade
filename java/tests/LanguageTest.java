import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LanguageTest {

    @Test
    public void shouldReturnAcceptableLanguage(){
        Language language = new Language();
        FrontEnd.getInstance().addLanguage(language);
        assertEquals(true, language.compile());
    }

    @Test
    public void shouldReturnNonAcceptableLanguage(){
        Language language = new Language();
        assertEquals(false, language.compile());
    }

}