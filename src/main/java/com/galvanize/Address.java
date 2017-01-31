public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  //constructor
  public Address (String newStreet, String newCity, String newState, String newZip) {
    street = newStreet;
    city = newCity;
    state = newState;
    zip = newZip;
  }

  // getters
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

  // setters
  public void setStreet(String newStreet) {
    street = newStreet;
  }
  public void setCity(String newCity) {
    city = newCity;
  }
  public void setState(String newState) {
    state = newState;
  }
  public void setZip(String newZip) {
    zip = newZip;
  }

  //toString override

  @Override public String toString() {
    StringBuilder result = new StringBuilder();
    result.append(street + ", ");
    result.append(city + ", ");
    result.append(state + ", ");
    result.append(zip);
    return result.toString();
  }

}
