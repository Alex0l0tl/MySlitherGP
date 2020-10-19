package de.mat2095.my_slither;

import static de.mat2095.my_slither.MySlitherModel.PI2;


abstract class Player {

    final String name;

    Player(String name) {
        this.name = name;
    }

    public abstract Wish action(MySlitherModel model);

    static class Wish {

        final Double angle; // Measured in radians
        final Boolean boost;

        Wish(Double angle, Boolean boost) {
            // Check to see if angle variable is valid
            if (angle != null && (angle < 0 || angle >= PI2)) {
                // if not: throw an exception
                throw new IllegalArgumentException("angle not in range 0 to PI2");
            }
            this.angle = angle;
            this.boost = boost;
        }
    }
}
