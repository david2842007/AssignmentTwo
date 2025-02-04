package bgu.spl.mics.application.objects;

/**
 * CloudPoint represents a specific point in a 3D space as detected by the LiDAR.
 * These points are used to generate a point cloud representing objects in the environment.
 */
public class CloudPoint {
    private double x;
    private double y;

    // Constructor
    public CloudPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static CloudPoint average(CloudPoint oldCoordinate, CloudPoint newCoordinate) {
        double x = (oldCoordinate.getX() + newCoordinate.getX()) / 2;
        double y = (oldCoordinate.getY() + newCoordinate.getY()) / 2;
        return new CloudPoint(x, y);
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


}