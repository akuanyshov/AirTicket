package Azat;

import java.io.Serializable;
import java.util.ArrayList;

public class AircraftsDate implements Serializable {
    public  String operationType;
    public Aircrafts aircraft;

    public AircraftsDate(String operationType, Aircrafts aircraft) {
        this.operationType = operationType;
        this.aircraft = aircraft;
    }
}
