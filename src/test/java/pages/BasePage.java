package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    protected static WebDriver driver;
    
    private static WebDriverWait wait;

    //private static Actions action; ---- para utilizar los clicks(hover over, doubleclick, right click)
    
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public static void navigateTo(String url){
        driver.get(url);
    }
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        //que me devuelva el wenelement pero que espere 10 seg y luego lo mande

        //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))); 
    }

    //ahora usamos el webelement:
    public void clickElement(String locator){
        Find(locator).click(); 
    }

        //ubica usando Find el webElement, lo limpia si tiene un valor y luego escribe algo que se lo pasamos como arumento
    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    //PRUEBAS CON DROPTDOWN
    /* public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));

        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select(Find(locator));

        dropdown.selectByIndex(valueToSelect);
    }
    public void selectFromDropdownByText(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));

        dropdown.selectByVisibleText(valueToSelect);
    } */


    //-----------------------------------------------------------------------------
    //LOCATORS ACCIONES CON CLICK:
    /* public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));

    }

    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(Find(locator));
    } */

    //traer vaores de tablas:



}
