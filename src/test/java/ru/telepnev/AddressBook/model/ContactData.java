package ru.telepnev.AddressBook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String adress;
    private final String mobilePhone;
    private final String workPhone;
    private final String email;
    private String group;

    public ContactData(String firstname, String lastname, String adress,
                       String mobilePhone, String workPhone, String email, String group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.email = email;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAdress() {
        return adress;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }
}
