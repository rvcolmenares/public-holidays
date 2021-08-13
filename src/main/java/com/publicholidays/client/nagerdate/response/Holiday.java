package com.publicholidays.client.nagerdate.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@ToString
public class Holiday {

    private String date;
    private String localName;
    private Boolean global;
    private List<String> counties;

}
