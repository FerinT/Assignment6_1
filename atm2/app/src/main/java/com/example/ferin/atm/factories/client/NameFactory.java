package com.example.ferin.atm.factories.client;

import com.example.ferin.atm.domain.client.Name;

/**
 * Created by Ferin on 2016-10-31.
 */
public class NameFactory {

    public static Name createName(String firstName, String secondName, String lastName, String title){

        Name name = new Name.Builder()
                .lastName(lastName)
                .firstName(firstName)
                .secondName(secondName)
                .title(title)
                .build();
        return name;
    }

}
