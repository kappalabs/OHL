
package com.kappa_labs.ohunter.lib.entities;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

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
     * Always not null.
     */
    private final HashMap<String, String> gfields;
    
    /**
     * Stores all photos assigned to this specific place.
     * Always not null.
     */
    private transient List<Photo> photos;

    
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
    
    /**
     * Sets the unique identifier for this place.
     * 
     * @param placeID The unique identifier for this place.
     */
    public void setID(String placeID) {
        gfields.put("place_id", placeID);
    }
    
    /**
     * Gets the number of photos stored in this place.
     * 
     * @return The number of photos stored in this place.
     */
    public int getNumberOfPhotos() {
        return photos.size();
    }
    
    /**
     * Puts given field value to hash table with field name as key.
     * 
     * @param fieldName Value used as key to internal hash table.
     * @param fieldValue Value of that is stored to the hash table.
     * @return Previous value with the same key.
     */
    public String putGField(String fieldName, String fieldValue) {
        return gfields.put(fieldName, fieldValue);
    }
    
    /**
     * Gets field with given name from internal hash table.
     * 
     * @param fieldName The name of field to retrieve.
     * @return The retrieved field, null if does not exist.
     */
    public String getGField(String fieldName) {
        return gfields.get(fieldName);
    }

    /**
     * Gets the whole hash table of gFields.
     * 
     * @return The whole hash table of gFields.
     */
    public HashMap<String, String> getGfields() {
        return gfields;
    }
    
    /**
     * Adds a photo to internal list.
     * 
     * @param photo Photo to be added into the list.
     * @return True if the list changed as a result of the call.
     */
    public boolean addPhoto(Photo photo) {
        return photos.add(photo);
    }
    
    /**
     * Adds collection of photos to the internal list.
     * 
     * @param addPhotos Photos to be added.
     * @return True if this list changed as a result of the call.
     */
    public boolean addPhotos(Collection <? extends Photo> addPhotos) {
        return photos.addAll(addPhotos);
    }
    
    /**
     * Returns the photo at the specified position in the list.
     * 
     * @param index Index of the element to return.
     * @return The photo at the specified position in the list.
     */
    public Photo getPhoto(int index) {
        return photos.get(index);
    }

    /**
     * Gets the list of all photos for this place.
     * 
     * @return The list of all photos for this place.
     */
    public List<Photo> getPhotos() {
        return photos;
    }
    
    @Override
    public String toString() {
        return "Place:"
                + " [" + String.format("%.7f", latitude) + ";" + String.format("%.7f", longitude) + "];"
                + " ID = " + getID() + ";"
                + " #photos = " + getNumberOfPhotos();
    }
    
    /**
     * Serialization of this class including images.
     * 
     * @param oos Serialization stream.
     * @throws IOException On serialization error.
     */
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        List<Photo> phs = new ArrayList<>();
        for (Photo p : photos) {
            if (p.sImage != null) {
                p.sImage = new SImage(p.sImage);
            }
            if (p._sImage != null) {
                p._sImage = new SImage(p._sImage);
            }
            phs.add(p);
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
        photos = (List<Photo>) ois.readObject();
        /* Photos cannot be null */
        if (photos == null) {
            photos = new ArrayList<>();
        }
    }
    
}
