package ala.pft.addressbook.tests;

import ala.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().createContact(new ContactData
                ("test1", "test2", "testAddress", "1234567890", "test1.test2@gmail.com"));

    }

}
