import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PagesTests {

    private WebDriver driver;

    @BeforeAll
    static void beforeAll() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {

        driver.quit();
    }

    @Tag("siiportal")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Logowanie na koncie"})
    public void siiPortalTitle(String expectedTitle) {
        driver.get("https://siiportal.sii.pl");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @Tag("kotuszkowo")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    public void kotuszkowoPageTitle(String expectedTitle) {
        driver.get("http://kotuszkowo.pl");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @Tag("filmweb")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    public void filmwebPageTitle(String expectedTitle) {
        driver.get("https://www.filmweb.pl");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @Tag("selenium")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    public void seleniumPageTitle(String expectedTitle) {
        driver.get("https://www.selenium.dev/documentation/en/webdriver");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @Tag("onet")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    public void onetPageTitle(String expectedTitle) {
        driver.get("https://www.onet.pl");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }
}
