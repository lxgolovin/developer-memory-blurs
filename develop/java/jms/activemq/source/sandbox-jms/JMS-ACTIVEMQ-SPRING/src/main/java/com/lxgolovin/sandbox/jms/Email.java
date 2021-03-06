package com.lxgolovin.sandbox.jms;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Email {

    private Date date;

    private String name;

    private String to;

    private List<Person> persons;
}
