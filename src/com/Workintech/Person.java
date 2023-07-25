package com.Workintech;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private String hobby;
    private String education;

    public Person(String firstName,String lastName,int age) {
        this.age=age;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Person(String firstName, String lastName, int age, String occupation, String hobby, String education) {
        this(firstName,lastName,age);
        this.occupation = occupation;
        this.hobby = hobby;
        this.education = education;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    public boolean isTeen(){
        if(age>=13&&age<=19){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FirstName:"+firstName +"\n" +"LastName:"+lastName+"\n"+"Age:"+String.valueOf(age);
    }

}
