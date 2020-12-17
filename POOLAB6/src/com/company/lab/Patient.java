package com.company.lab;

import java.util.Date;

public class Patient extends Person {
    protected String id;
    protected String name = fullName;
    protected enum gender {male,female};
    protected Date birthDate;
    protected int age;
    protected Date accepted;
    protected String sickness;
    protected String[] prescriptions;
    protected String[] allergies;
    protected String[] specialReqs;
}
