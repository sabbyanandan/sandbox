package com.example.channing;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("bazzzzzz")
public class ChanningAppPropertiesOne {

    /**
     * The first name of the person. 
     */
    private String firstName;
    /**
     * The last name of the person.
     */
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}