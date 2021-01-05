package ru.telepnev.AddressBook.tests;

import org.testng.annotations.Test;
import ru.telepnev.AddressBook.model.GroupData;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        if( ! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("Test1", "Test2", "Test3"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initModificationGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test3", "Test3"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToGroupPage();
    }
}
