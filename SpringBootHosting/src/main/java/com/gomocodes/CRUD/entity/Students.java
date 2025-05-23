package com.gomocodes.CRUD.entity;



public class Students {

    
    private Long id;

    private String name;

    private String email;

    private Long contact;

    
    public Students() {}

    public Students(String name, String email, Long contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }
}
