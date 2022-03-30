import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PagesTests extends TestBase {
    Logger logger = LoggerFactory.getLogger("PagesTests.class");
    String siteUrl;
    String actualTitle;

    @Tag("siiportal")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Logowanie na koncie"})
    public void siiPortalTitle(String expectedTitle) {
        siteUrl = "https://siiportal.sii.pl";
        driver.get(siteUrl);
        actualTitle = driver.getTitle();
        logger.info("<<<<<Provided site url is: " + siteUrl);
        logger.info("<<<<<expected site title is: " + expectedTitle);
        logger.info("<<<<<Actual site title is " + actualTitle);
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @Tag("kotuszkowo")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    public void kotuszkowoPageTitle(String expectedTitle) {
        siteUrl = "http://kotuszkowo.pl";
        driver.get(siteUrl);
        String actualTitle = driver.getTitle();
        logger.info("<<<<<Provided site url is: " + siteUrl);
        logger.info("<<<<<expected site title is: " + expectedTitle);
        logger.info("<<<<<Actual site title is " + actualTitle);
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @Tag("filmweb")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    public void filmwebPageTitle(String expectedTitle) {
        siteUrl = "https://www.filmweb.pl";
        driver.get(siteUrl);
        String actualTitle = driver.getTitle();
        logger.info("<<<<<Provided site url is: " + siteUrl);
        logger.info("<<<<<expected site title is: " + expectedTitle);
        logger.info("<<<<<Actual site title is " + actualTitle);
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @Tag("selenium")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    public void seleniumPageTitle(String expectedTitle) {
        siteUrl = "https://www.selenium.dev/documentation/en/webdriver";
        driver.get(siteUrl);
        String actualTitle = driver.getTitle();
        logger.info("<<<<<Provided site url is: " + siteUrl);
        logger.info("<<<<<expected site title is: " + expectedTitle);
        logger.info("<<<<<Actual site title is " + actualTitle);
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @Tag("onet")
    @Tag("Regression")
    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    public void onetPageTitle(String expectedTitle) {
        siteUrl = "https://www.onet.pl";
        driver.get(siteUrl);
        String actualTitle = driver.getTitle();
        logger.info("<<<<<Provided site url is: " + siteUrl);
        logger.info("<<<<<expected site title is: " + expectedTitle);
        logger.info("<<<<<Actual site title is " + actualTitle);
        assertThat(actualTitle, equalTo(expectedTitle));
    }
}
