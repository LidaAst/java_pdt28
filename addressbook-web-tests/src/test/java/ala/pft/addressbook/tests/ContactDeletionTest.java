package ala.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Lida on 3/13/2016.
 */
public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().closeAlertForDeletion();
    }
}
