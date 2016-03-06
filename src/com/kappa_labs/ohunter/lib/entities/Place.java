
package com.kappa_labs.ohunter.lib.entities;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class for storing information about place, retrieved by Google API.
 */
public class Place implements Serializable {
    
    /**
     * Place location longitude.
     */
    public double longitude;
    /**
     * Place location latitude.
     */
    public double latitude;
    /**
     * Stores information given from Google Place Details request.
     */
    public HashMap<String, String> gfields;
    
    /**
     * Stores all photos assigned to this specific place.
     */
    public transient ArrayList<Photo> photos;

    
    /**
     * Creates new place object to store the information retrieved by Google API.
     */
    public Place() {
        photos = new ArrayList<>();
        gfields = new HashMap<>(10);
    }
    
    /**
     * Gets the unique identifier for this place.
     * 
     * @return The unique identifier for this place.
     */
    public String getID() {
        return gfields.get("place_id");
    }
    
    @Override
    public String toString() {
        return "Place:"
                + " [" + String.format("%.7f", latitude) + ";" + String.format("%.7f", longitude) + "];"
                + " ID = " + getID() + ";"
                + " #photos = " + ((photos == null) ? "null" : photos.size());
    }
    
    /**
     * Serialization of this class including images.
     * 
     * @param oos Serialization stream.
     * @throws IOException On serialization error.
     */
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        ArrayList<Photo> phs = null;
        if (photos != null) {
            phs = new ArrayList<>();
            for (Photo p : photos) {
                if (p.sImage != null) {
                    p.sImage = new SImage(p.sImage);
                }
                if (p._sImage != null) {
                    p._sImage = new SImage(p._sImage);
                }
                phs.add(p);
            }
        }
        oos.writeObject(phs);
    }

    /**
     * Deserialization of this class including images.
     * 
     * @param ois Deserialization stream.
     * @throws IOException On deserialization error.
     * @throws ClassNotFoundException When saved data are incompatible.
     */
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        photos = (ArrayList<Photo>) ois.readObject();
    }
    
}
