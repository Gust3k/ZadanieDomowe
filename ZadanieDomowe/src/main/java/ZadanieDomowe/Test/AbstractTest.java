package ZadanieDomowe.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

    public abstract class AbstractTest {

        protected static WebDriver driver;

        @BeforeSuite
        public void setUp() {
            // Wskazanie zewnętrznego pliku drivera dla przeglądarki Firefox/Chrome
            String userPath = System.getProperty("user.dir");
            System.setProperty(
                    "webdriver.gecko.driver",userPath+
                    "\\src\\main\\resources\\geckodriver.exe"
            );
            //Stworzenie i zainicjalizowanie obiektu DRIVER przeglądarką Firefox/Chrome
            driver = new FirefoxDriver();
            // Ustawienie globalnego timeouta na 5 sekund
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // Ustawienie zmaksymalizowanego okna
            driver.manage().window().maximize();
            // przejście na wskazaną stronę
            driver.get("https://www.zalando.pl/login");
        }

        @AfterSuite
        public void tearDown() {
            //Zamknięcie przeglądarki
            driver.quit();
        }
    }

