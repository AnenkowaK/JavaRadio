package ru.netology.radioservice;

public class Radio {

    private int currentVolume = 0;
    private int currentStation = 0;


    public void increaseVolume() {
        if (getCurrentVolume() < 10) {
            setCurrentVolume(getCurrentVolume() + 1);
        }
    }

    public void decreaseVolume() {
        if (getCurrentVolume() > 0) {
            setCurrentVolume(getCurrentVolume() - 1);
        }
    }

    public void nextStation() {
        if (getCurrentStation() == 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(getCurrentStation() + 1);
        }
    }

    public void previousStation() {
        if (getCurrentStation() == 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(getCurrentStation() - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        int minStation = 0;
        int maxStation = 9;
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        int minVolume = 0;
        int maxVolume = 10;
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}

