package com.example.ferin.atm.domain.client.impl;


import com.example.ferin.atm.domain.client.Address;
import com.example.ferin.atm.domain.client.Client;

import java.io.Serializable;

public class Business implements Client, Serializable {

    private Long id;
    private String idNumber;
    private String name;
    private String memberShipType;
    private String emailAddress;
    private Address address;


    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String getMembershipType() {
        return "business";
    }

    private Business(Builder builder) {
        this.idNumber = builder.idNumber;
        this.name = builder.name;
        this.memberShipType = builder.memberShipType;
        this.id = builder.id;
        this.emailAddress = builder.emailAddress;
        this.address = builder.address;
    }

    public static class Builder
    {
        private String idNumber;
        private String name;
        private String memberShipType;
        private Long id;
        private String emailAddress;
        private Address address;

        public Builder address(Address address){
            this.address = address;
            return this;
        }

        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder idNumber(String value){
            this.idNumber = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder membershipType(String memberShipType){
            this.memberShipType = memberShipType;
            return this;
        }

        public Builder copy(Business business)
        {
            this.idNumber = business.idNumber;
            this.name = business.name;
            this.memberShipType = business.memberShipType;
            this.id = business.id;
            this.emailAddress = business.emailAddress;

            return this;
        }

        public Business build() {
            return new Business(this);
        }

    }
}
