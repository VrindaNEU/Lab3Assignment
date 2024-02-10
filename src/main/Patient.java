/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author vrind
 */
public class Patient {
    
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String message;
    private String patientType;
    private String appointMentDate;
    private String  gender;
    private String photoUrl;

    //Constructor
    public Patient(String firstName, String lastName, String age, String email, String message, String patientType, String appointMentDate, String gender, String photoUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.message = message;
        this.patientType = patientType;
        this.appointMentDate = appointMentDate;
        this.gender = gender;
        this.photoUrl = photoUrl;
    }
    
    //Getters And Setters

    public String getAge() {
        return age;
    }

    public String getAppointMentDate() {
        return appointMentDate;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMessage() {
        return message;
    }

    public String getPatientType() {
        return patientType;
    }


    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAppointMentDate(String appointMentDate) {
        this.appointMentDate = appointMentDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    
    
    
    

    
    
    
    
    
}
