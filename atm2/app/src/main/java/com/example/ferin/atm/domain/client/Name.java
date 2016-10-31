package com.example.ferin.atm.domain.client;

/**
 * Created by Ferin on 2016-10-31.
 */
public class Name {

    private String title;
    private String firstName;
    private String secondName;
    private String lastName;

    private Name(){}

    public Name(Builder builder){
        this.title = builder.title;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.secondName = builder.secondName;
    }

    public String getTitle() {
        return title;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private String title;
        private String firstName;
        private String secondName;
        private String lastName;

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder secondName(String secondName){
            this.secondName = secondName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name){
            this.lastName = name.lastName;
            this.firstName = name.firstName;
            this.title = name.title;
            this.secondName = name.secondName;

            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
