package org.firstinspires.ftc.teamcode;

public class Vector2D {
    double x;
    double y;

    public Vector2D(double comp1, double comp2, boolean isCart) {
        if (isCart) {
            x = comp1;
            y = comp2;
                    }
        else {
            //maths (convert to cartesian)
            //comp1 = magnitude
            //comp2 = direction
            x = Math.cos(comp2)*comp1;
            y = Math.sin(comp2)*comp1;
        }
    }
    public Vector2D sub(Vector2D vec2) {
        return new Vector2D(x - vec2.x, y - vec2.y, true);
    }
    public Vector2D add(Vector2D vec2) {
        return new Vector2D(x + vec2.x, y + vec2.y, true);
    }
    public Vector2D rotate(double degrees) {
        double theta = Math.atan2(y, x) + degrees;
        double magnitude = Math.sqrt(y*y + x*x);

        return new Vector2D(magnitude, theta, false);

    }
}
