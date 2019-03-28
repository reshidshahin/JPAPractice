package model;

import javax.persistence.Embeddable;

@Embeddable // bu annotation ile eger user'in 2 dene veya cox email veya nomresi varsa
// bunu biz basqa class kimi yaziriq ve bu class'i biz o biri class ile elaqelendiririk db'de 1 table olur creation zamani.
public class Contact {

    private String email;
    private String phoneNumber;

    public Contact(){

    }

    public Contact(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
