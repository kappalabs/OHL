
package com.kappa_labs.ohunter.lib.entities;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class for storing information about place, retrieved by Google API.
 */
public class Place implements Serializable {

    /**
     * Default directory for storage of the photos.
     */
    public static final String PHOTOS_DIR = "places/";
    
    /**
     * Place location longitude.
     */
    public double longitude;
    /**
     * Place location latitude.
     */
    public double latitude;
    /**
     * Contains the URL of a suggested icon which may be displayed to
     * the user when indicating this result on a map.
     */
    public String icon;
    /**
     * Contains the human-readable address of this place.
     */
    public String formatted_address;
    /**
     * Contains the human-readable name for the returned result.
     */
    public String name;
    /**
     * Place unique identifier.
     */
    public String place_id;
    /**
     * Contains the URL of the official Google page for this place.
     */
    public String url;
    /**
     * The authoritative website for this place.
     */
    public String website;
    
    /**
     * Stores all photos assigned to this specific place.
     */
    public transient ArrayList<Photo> photos;

    
    /**
     * Creates new place object to store the information retrieved by Google API.
     */
    public Place() {
        photos = new ArrayList<>();
    }
    
//    /**
//     * Stores all photos in this object into local directory.
//     * 
//     * @param directory Directory, where the files should be stored
//     *                  (must end with separator), default is used when null.
//     */
//    public void saveToFile(String directory) {
//        try {
//            if (directory == null) {
//                directory = PHOTOS_DIR;
//            }
//            File fdir = new File(directory + place_id + File.separator);
//            fdir.mkdirs();
//            for (int i = 0; i < photos.size(); i++) {
//                Photo photo = photos.get(i);
//                File fphoto = new File(fdir.getPath() + File.separator + i + ".png");
//                ImageIO.write(photo.image.toBufferedImage(), "png", fphoto);
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(Photo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    @Override
    public String toString() {
        return "Place:"
                + " [" + String.format("%.7f", latitude) + ";" + String.format("%.7f", longitude) + "];"
                + " ID = " + place_id + ";"
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
                if (p.image != null) {//&& !(p.image instanceof SImage)) {
//                    p.image = p.image.getSImage();
                    p.image = new SImage(p.image.getImage(), p.image.width, p.image.height);
                }
                if (p._image != null) {//&& !(p._image instanceof SImage)) {
//                    p._image = p._image.getSImage();
                    p._image = new SImage(p._image.getImage(), p._image.width, p._image.height);
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
