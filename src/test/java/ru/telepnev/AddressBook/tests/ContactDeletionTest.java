package ru.telepnev.AddressBook.tests;

import org.testng.annotations.Test;
import ru.telepnev.AddressBook.model.ContactData;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoHomePage();
        if( ! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Evgeniy", "Telepnev",
                    "Moscow", "+79211234567", "8(495)123 45 67",
                    "terqw@mail.ru", "Test1"), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.closeAlert();




    }

}
