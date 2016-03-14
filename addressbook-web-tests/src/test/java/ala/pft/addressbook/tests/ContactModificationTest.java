package ala.pft.addressbook.tests;

import ala.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by Lida on 3/13/2016.
 */
public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification(){
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "testAddress", "1234567890", "test1.test2@gmail.com"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
    }
}
