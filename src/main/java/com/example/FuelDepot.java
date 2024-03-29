package com.example;

import java.util.List;

public class FuelDepot {
    /** The robot used to move the filling mechanism */
    private FuelRobot filler;

    /** The list of fuel tanks */
    private List<FuelTank> tanks;

    /**
     * Constructs a FuelDepot object.
     *
     * @param filler The robot used to move the filling mechanism.
     * @param tanks  The list of fuel tanks.
     */
    public FuelDepot(FuelRobot filler, List<FuelTank> tanks) {
        this.filler = filler;
        this.tanks = tanks;
    }

    // Method to implement for a)
    public int nextTankToFill(int threshold) {
        // Your implementation here
        for (int i = 0; i < this.tanks.size(); i++) {
            if (this.tanks.get(i).getFuelLevel() >= threshold) {
                return i + 1;
        }
    }
        return this.filler.getCurrentIndex();
    }

    // Method to implement for b)
    public void moveToLocation(int locIndex) {
        // Your implementation here
        this.filler.setCurrentIndex(locIndex);
    }
}
