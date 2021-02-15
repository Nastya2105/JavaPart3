package com.company;

public class Range {
    Integer min;
    Integer max;

    public Range(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public boolean isIn(Integer x) {
        if (this.max == null) {
            if (x >= min) {
                return true;
            } else {
                return false;
            }
        } else {
            if (x >= this.min && x <= this.max) {
                return true;
            } else {
                return false;
            }
        }
    }
    public String getName() {
        if (this.max == null) {
            return "от " + this.min + " до бесконечности";
        } else {
            return "от " + this.min + " до " + this.max;
        }
    }
}
