package client.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Country {

    private String commonName;
    private String officialName;
    private String countryCode;

}
