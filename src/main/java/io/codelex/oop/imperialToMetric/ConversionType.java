package io.codelex.oop.imperialToMetric;

public enum ConversionType {

    METERS_TO_YARDS(new MetersToYardsConverter()),
    YARDS_TO_METERS(new YardsToMetersConverter()),
    CENTIMETERS_TO_INCHES(new CentimetersToInchesConverter()),
    INCHES_TO_CENTIMETERS(new InchesToCentimetersConverter()),
    KILOMETERS_TO_MILES(new KilometersToMilesConverter()),
    MILES_TO_KILOMETERS(new MilesToKilometersConverter());

    public Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }
}
