package model;

public class Contacts {

    int id;
    private ContactType contactType;
    String  contact;

    public Contacts(ContactType contactType, String contact) {
        this.contactType = contactType;
        this.contact = contact;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
