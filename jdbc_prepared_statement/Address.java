import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    private int addressId;
    private String street;
    private String City;
    private String state;
    private String zip;

    public Address(String City, String street, String state, String zip) {
        this.city = City;
        this.street = street;
        this.state = state;
        this.zip = zip;
    }
}
