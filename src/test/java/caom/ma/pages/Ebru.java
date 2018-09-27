package caom.ma.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ma.utilities.Driver;


public class Ebru {
  
  public Ebru() {
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(id = "menu-item-4795")
  public WebElement classes;

  @FindBy(xpath = "//a[@class='sf-with-ul'][contains(.,'Art')]")
  public WebElement art;
  
  @FindBy(linkText = "Ebru – Water Marbling Classes")
  public WebElement ebru;
  
  @FindBy(xpath = "//select[@class='js-d-select-box']")
  public WebElement selectDate;
  
  @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/p/iframe")
  public WebElement iframe;
  
  @FindBy(xpath = "//button[@type='button']")
  public WebElement ticket;
  
  @FindBy(xpath = "//select[@class='ticket-box-quantity js-d-select-box js-ticket-quantity-select']")
	public WebElement regularTickets;
  
  
}
