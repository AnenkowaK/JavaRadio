package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldUseConstructor() {
        Radio radio=new Radio(1);
    }

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }
    @Test
    public void increaseVolumeLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }
    @Test
    public void decreaseVolumeLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
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
    public void nextStationWithCount() {
        Radio radio = new Radio(4);
        radio.setCurrentStation(3);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
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
    @Test
    public void AboveLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void BelowLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentStation());
    }


}
















