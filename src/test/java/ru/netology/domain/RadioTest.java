package ru.netology.radioservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @ParameterizedTest
    @CsvSource(value = {
            " increaseVolume, 8, 9",
            " increaseVolumeLimit, 10, 10",
            " decreaseVolume, 5, 4",
            "decreaseVolumeLimit, 0, 0",
            "AboveLimitVolume, 11, 0",
            "BelowLimitVolume, -1, 0"})
    public void Volume(String testName, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }






    @Test
    public void nextStationLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void previousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.previousStation();
        assertEquals(7, radio.getCurrentStation());
    }



    @Test
    public void previousStationLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void AboveLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void BelowLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }


}


















