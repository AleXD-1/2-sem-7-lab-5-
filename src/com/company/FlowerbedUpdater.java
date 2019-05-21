package com.company;

public class FlowerbedUpdater {
    public void water(Plant plant) {
        if (plant.getStatus().equals("Faded")) {
            plant.setStatus("Watered");
        }
    }
}
