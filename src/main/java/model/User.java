package model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String surname;
    private int age;
    private String salary;

    @Embedded // bu annotation ile eger user'in 2 dene veya cox email veya nomresi varsa
              // bunu biz basqa class kimi yaziriq ve bu class'i biz o biri class ile elaqelendiririk
              // db'de 1 table olur creation za
    //@AttributeOverride(name = "phoneNumber", column = @Column(name = "telefon", length = 10)) // bu tek olandi asagida cox olan ile yazmisam. belede istifade ede bilerik, elede

    @AttributeOverrides({
            @AttributeOverride(name = "phoneNumber", column = @Column(name = "telefon", length = 10)),
            @AttributeOverride(name = "email", column = @Column(name = "Email", length = 30))
    })
    private Contact contact;


    public User() {
    }

    public User(String name, String surname, int age, String salary, Contact contact) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.contact = contact;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                ", contact=" + contact +
                '}';
    }
}
