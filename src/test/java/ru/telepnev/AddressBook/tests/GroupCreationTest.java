package ru.telepnev.AddressBook.tests;

import org.testng.annotations.*;
import ru.telepnev.AddressBook.model.GroupData;


public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createGroup(new GroupData("Test1", "Test2", "Test3"));
  }
}
