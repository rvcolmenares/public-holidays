package com.publicholidays.client.nagerdate;

import com.publicholidays.client.response.Country;
import com.publicholidays.client.response.Holiday;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface NagerDateClient {

    @RequestLine("GET /v3/CountryInfo/{countryCode}")
    Country getCountry(@Param String countryCode);

    @RequestLine("GET /v3/NextPublicHolidays/{countryCode}")
    List<Holiday> getNextPublicHolidays(@Param String countryCode);

}
