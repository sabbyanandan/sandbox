package com.example.channing;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("fooooooz")
public class ChanningAppPropertiesTwo {

    /**
     * The person's middle name.
     */
    private String middleName;
    /**
     * The date of birth.
     */
    private String birthdate;

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

}