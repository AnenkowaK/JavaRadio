package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int countStation) {

        this.maxStation = countStation-1;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxStation) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minVolume;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void previousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }


}

