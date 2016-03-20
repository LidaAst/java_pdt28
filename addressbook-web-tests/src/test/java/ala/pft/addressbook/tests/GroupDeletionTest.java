package ala.pft.addressbook.tests;

import ala.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by Lida on 3/13/2016.
 */
public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion(){
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().ifThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupDeletion();
        app.getGroupHelper().returnToGroupPage();

    }
}
