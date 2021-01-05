package ru.telepnev.AddressBook.tests;

import org.testng.annotations.*;
import ru.telepnev.AddressBook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreationTests() {
        app.getContactHelper().createContact(new ContactData("Evgeniy", "Telepnev",
                "Moscow", "+79211234567", "8(495)123 45 67",
                "terqw@mail.ru"));
        app.getNavigationHelper().gotoHomePage();
    }
}
