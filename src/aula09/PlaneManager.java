package aula09;


import java.util.HashMap;
import java.util.Map;

public class PlaneManager {
    private static Map<String, Plane> planes;

    public PlaneManager() {
        planes = new HashMap<>();
    }

    public void addPlane(Plane plane) {
        planes.put(plane.getId(), plane);
    }

    public void removePlane(String id) {
        if (planes.get(id) == null) System.out.println("Plane not found.");
        else planes.remove(id);
    }

    public Plane searchPlane(String id) {
        Plane plane = planes.get(id);
        if (plane != null) {
            return plane;
        } else {
            System.out.println("Plane not found.");
            return null;
        }
    }
    

    public String getAllPlanes() {
        String s = "";
        for (Plane plane : planes.values()) {
            s += plane.toString() + "\n";
        }
        if (s.equals("")) {
            s = "No planes in fleet.";
        }
        return s;
    }

    public String getCommercialPlanes() {
        String s = "Commercial Planes:\n";
        for (Plane plane : planes.values()) {
            if (plane instanceof CommercialPlane) {
                s += plane.toString() + "\n";
            }
        }
        if (s.equals("Commercial Planes:\n")) {
            s = "No commercial planes found.";
        }
        return s;
    }

    public String getMilitaryPlanes() {
        String s = "Military Planes:\n";
        for (Plane plane : planes.values()) {
            if (plane instanceof MilitaryPlane) {
                s += plane.toString() + "\n";
            }
        }
        if (s.equals("Military Planes:\n")) {
            s = "No military planes found.";
        }
        return s;
    }

    public Plane getFastestPlane() {
        Plane fastestPlane = null;
        for (Plane plane : planes.values()) {
            if (fastestPlane == null || plane.getMaxVel() > fastestPlane.getMaxVel()) {
                fastestPlane = plane;
            }
        }
        return fastestPlane;
    }


    







}