package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    @Test
    public void shouldSetRequiredStation() {
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStation() {
        radio.setCurrentStation(4);
        radio.increaseStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseCurrentStationIfLimit() {
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void shouldDecreaseCurrentStation() {
        radio.setCurrentStation(3);
        radio.decreaseStation();
        int expected = 2;

        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseCurrentStationIfLimit() {
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(3);
        radio.increaseVolume();
        int expected = 4;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolumeIfOverLimit() {
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 10;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        int expected = 6;

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolumeIfUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        radio.decreaseVolume();
        int expected = 0;

        assertEquals(expected, radio.getCurrentVolume());
    }
}