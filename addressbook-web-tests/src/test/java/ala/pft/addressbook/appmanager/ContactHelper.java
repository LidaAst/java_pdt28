package ala.pft.addressbook.appmanager;

import ala.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Lida on 3/9/2016.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("address"),contactData.getAddress());
        type(By.name("home"), contactData.getHomephone());
        type(By.name("email"),contactData.getEmail());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.id("2"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void initContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void deleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void closeAlertForDeletion() {
        wd.switchTo().alert().accept();
    }
}
