package ala.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Lida on 3/13/2016.
 */
public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion(){
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupDeletion();
        app.getGroupHelper().returnToGroupPage();

    }
}
