package ala.pft.addressbook.tests;

import ala.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by Lida on 3/13/2016.
 */
public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().goToHomePage();
        if(! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData
                    ("test1", "test2", "testAddress", "1234567890", "test1.test2@gmail.com"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().closeAlertForDeletion();
    }
}
