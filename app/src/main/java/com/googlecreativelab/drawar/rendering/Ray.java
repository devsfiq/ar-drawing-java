package com.googlecreativelab.drawar.rendering;

import javax.vecmath.Vector3f;

/**
 * Created by Siddiq on 24/2/2018.
 */

public class Ray {

    public Vector3f origin;
    public Vector3f direction;

    public Ray(Vector3f origin, Vector3f direction) {
        this.origin = origin;
        this.direction = direction;
    }
}
