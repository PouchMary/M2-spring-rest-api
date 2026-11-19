package kh.edu.istad.b02m2restapi.model;

import jdk.jfr.Enabled;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@Enitity

public class Product {


    private Integer id;
    private String name;
    private String description ;
    private BigDecimal price;
    private Integer quatity;
    private boolean isAvailable;
}
