package ala.pft.addressbook.tests;

import ala.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "1234567890", "test1.test2@gmail.com"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().goToHomePage();
    }

}
