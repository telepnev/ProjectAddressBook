package ru.telepnev.AddressBook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreationTests() {
        app.initContactCreation();
        app.fillContactForm(new ContactData("Evgeniy", "Telepnev", "Moscow", "+79211234567", "8(495)123 45 67", "terqw@mail.ru"));
        app.submitCreationForm();
        app.gotoHomePage();
    }
}
