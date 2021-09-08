package ru.netology.radioservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    };

    @Test
    public void increaseVolumeLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }
    @Test
    public void increaseVolumeAboveLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextStationAboveLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStationBelowLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void previousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void previousStationBelowLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.previousStation();
        assertEquals(0, radio.getCurrentStation());
    }
}


















