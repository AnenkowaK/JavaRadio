package ru.netology.radioservice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    public void increaseVolumeLimit() {
        Radio radio = new Radio();
        radio.currentVolume = 8;
        radio.increaseVolume();
        assertEquals(9, radio.currentVolume);
    }
    @Test
    public void increaseVolumeAboveLimit() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        assertEquals(10, radio.currentVolume);
    }


    @Test
    public void decreaseVolumeLimit() {
        Radio radio = new Radio();
        radio.currentVolume = 5;
        radio.decreaseVolume();
        assertEquals(4, radio.currentVolume);
    }
    @Test
    public void decreaseVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        assertEquals(0, radio.currentVolume);
    }

    @Test
    public void nextStationAboveLimit() {
        Radio radio = new Radio();
        radio.currentStation = 10;
        radio.nextStation();
        assertEquals(0, radio.currentStation);
    }

    @Test
    public void nextStationBelowLimit() {
        Radio radio = new Radio();
        radio.currentStation = 8;
        radio.nextStation();
        assertEquals(9, radio.currentStation);
    }

    @Test
    public void previousStation() {
        Radio radio = new Radio();
        radio.currentStation =0;
        radio.previousStation();
        assertEquals(9, radio.currentStation);
    }
    @Test
    public void previousStationBelowLimit() {
        Radio radio = new Radio();
        radio.currentStation =1;
        radio.previousStation();
        assertEquals(0, radio.currentStation);
    }
}


















