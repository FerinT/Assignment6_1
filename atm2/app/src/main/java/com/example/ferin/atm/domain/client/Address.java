package com.example.ferin.atm.domain.client;

/**
 * Created by Ferin on 2016-10-31.
 */
public class Address {

    private String street;
    private String areaCode;
    private String houseNumber;

    private Address(){}

    public Address(Builder builder){
        this.street = builder.street;
        this.areaCode = builder.areaCode;
        this.houseNumber = builder.houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public static class Builder{
        private String street;
        private String areaCode;
        private String houseNumber;

        public Builder street(String street){
            this.street = street;
            return this;
        }

        public Builder areaCode(String areaCode){
            this.areaCode = areaCode;
            return this;
        }

        public Builder houseNumber(String houseNumber){
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder copy(Address address){
            this.houseNumber = address.houseNumber;
            this.areaCode = address.areaCode;
            this.street = address.street;
            return this;
        }

        public Address build(){
            return new Address(this);
        }

    }

}
