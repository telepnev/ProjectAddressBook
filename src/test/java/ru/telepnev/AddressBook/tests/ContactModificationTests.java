package ru.telepnev.AddressBook.tests;

import org.testng.annotations.Test;
import ru.telepnev.AddressBook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        if( ! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Evgeniy", "Telepnev",
                    "Moscow", "+79211234567", "8(495)123 45 67",
                    "terqw@mail.ru"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov",
                "New York city", "+1 01 02 03", "1(002)123 45 67",
                "qwerty111w@mail.ru"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();

    }
}
