package pages;


public class AmazonSearchPage extends BasePage{
    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdResult = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String addedMessageText = "//*[contains(text(),'Agregando al carrito')]";

    public AmazonSearchPage(){
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com/");
    }

    public void enterSearchCriteria(String criteria){
        write(searchBox, criteria);
    }

    public void clickSearch(){
        clickElement(searchButton);
    }

    public void goToPage(String pageNumber){
        goToLinkText(pageNumber);

    }

    public void pick3erdItem(){
        clickElement(thirdResult);
    }

    public void addToCart(){
        clickElement(addToCartButton);
    }

    public String addedToCartMessage(){
        return textFromElement(addedMessageText);
    }


}