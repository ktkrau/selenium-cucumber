package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage{
    private String searchField = "//body/form[1]/input[1]";
    private String searchResults = "name";

    public ListPage(){
        super(driver);
    }

    public void navigateToListPage(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }
    public void enterSearchCriteria(String state) throws InterruptedException{
        //puede que no se presente el webelement, y nos va a apuntar el elemento que no se encontró, pero para que sea mas informativo hacemos:
        try{
            Thread.sleep(600); //decirle al sistema que se frene por 600 milisegundos o si no, no me trae todas las opciones
            write(searchField, state);
        }catch(NoSuchElementException e){
            System.out.println("The WebElement Search Field couldn't be found.");
            e.printStackTrace();
        }
    }

    //crear la lista texto en base a la lista webelement: (pasarlo a string para que lo pueda leer)
    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<String>();
        for(WebElement e :list){
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }
    
}
