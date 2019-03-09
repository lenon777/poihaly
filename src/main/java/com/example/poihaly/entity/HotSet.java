package com.example.poihaly.entity;

public class HotSet {
    private HotTour first;
    private HotTour second;
    private HotTour third;

    public HotSet() {
    }

    public HotSet(HotTour first, HotTour second, HotTour third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public HotTour getFirst() {
        return first;
    }

    public void setFirst(HotTour first) {
        this.first = first;
    }

    public HotTour getSecond() {
        return second;
    }

    public void setSecond(HotTour second) {
        this.second = second;
    }

    public HotTour getThird() {
        return third;
    }

    public void setThird(HotTour third) {
        this.third = third;
    }
}

