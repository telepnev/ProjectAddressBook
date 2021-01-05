package ru.telepnev.AddressBook;

import org.testng.annotations.Test;


public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.gotoHomePage();
        app.selectGroup();
        app.deleteSelectedGroups();
//        app.returnToGroupPage();
    }
}

