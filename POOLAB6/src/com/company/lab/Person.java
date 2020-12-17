package com.company.lab;

import java.util.Date;

public class Person {
    protected String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;
    protected String fullName = (givenName+ " " + middleName + "" + familyName);
    protected Date birthDate;
    protected enum Gender {male,female};
    protected String homeAddress;
    protected String phone;

}
