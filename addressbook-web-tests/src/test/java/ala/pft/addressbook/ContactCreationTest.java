package ala.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {


    @Test
    public void testContactCreation() {

        initContactCreation();
        fillContactForm(new ContactData("test1", "test2", "1234567890", "test1.test2@gmail.com"));
        submitContactCreation();
        goToHomePage();
    }

}
