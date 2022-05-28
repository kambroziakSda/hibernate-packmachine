package packmachine.http.request_response;

public class Person {

    private String email;

    private String city;

    private String street;

    public Person(String email, String city, String street) {
        this.email = email;
        this.city = city;
        this.street = street;
    }

    public Person() {
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "PersonResponse{" +
                "email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
