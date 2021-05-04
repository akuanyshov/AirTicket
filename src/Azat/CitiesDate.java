package Azat;

import java.io.Serializable;
import java.util.ArrayList;

public class CitiesDate implements Serializable {
    String operationType;
    Cities cityDate;

    public CitiesDate(String operationType, Cities city) {
        this.operationType = operationType;
        this.cityDate = city;
    }
}
