public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String argStreet, String argCity, String argState, String argZip) {
        street = argStreet;
        city = argCity;
        state = argState;
        zip = argZip;
    }

    public String getStreet() {
      return street;
    }

    public String getCity() {
      return city;
    }

    public String getState() {
      return state;
    }

    public String getZip() {
      return zip;
    }

    public void setStreet(String newStreet) {
      street = newStreet;
    }

    public void setCity(String newCity) {
      street = newCity;
    }

    public void setState(String newState) {
      street = newState;
    }

    public void setZip(String newZip) {
      street = newZip;
    }
}
