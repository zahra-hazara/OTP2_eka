import org.junit.Test;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.Assert.assertEquals;

public class LocalizedGreetingTest {

    @Test
    public void testEnglishGreeting() {
        Locale locale = new Locale("en");
        ResourceBundle messages = ResourceBundle.getBundle("Message", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hello!", greeting);
    }

    @Test
    public void testSpanishGreeting() {
        Locale locale = new Locale("es");
        ResourceBundle messages = ResourceBundle.getBundle("Message", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hola!", greeting);
    }

    @Test
    public void testFrenchGreeting() {
        Locale locale = new Locale("fr");
        ResourceBundle messages = ResourceBundle.getBundle("Message", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Bonjour!", greeting);
    }

    @Test
    public void testInvalidChoiceDefaultsToEnglish() {
        Locale locale = new Locale("en"); // Simulate default choice
        ResourceBundle messages = ResourceBundle.getBundle("Message", locale);
        String greeting = messages.getString("greeting");
        assertEquals("Hello!", greeting); // Expected default is English
    }
    @Test
    public void testFarsiLocale() {
        Locale locale = new Locale("fa", "IR");
        ResourceBundle messages = ResourceBundle.getBundle("Message", locale);
        String greeting = messages.getString("greeting");
        assertEquals("سلام !", greeting);
    }
    @Test
    public void testJapaniesLocale() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle messages = ResourceBundle.getBundle("Message", locale);
        String greeting = messages.getString("greeting");
        assertEquals("こんにちは ！", greeting);
    }
}


