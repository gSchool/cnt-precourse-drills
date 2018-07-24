package com.galvanize;
import java.util.List;
import java.util.ArrayList;


  public class Business implements Addressable {

    private String name;
    private List<Address> addresses = new ArrayList<Address>();

    public Business(String argName) {
        name = argName;
    }

    public String getName() {
        return name;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public List<Address> getAddresses() {
        return new ArrayList<Address>(addresses);
    }
}
