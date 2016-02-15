
package com.kappa_labs.ohunter.lib.entities;

import java.io.Serializable;

/**
 * Class for storing the information about photo retrieved by Google API.
 */
public class Photo implements Serializable {
    
    /**
     * Enum for information about the time this photo was taken in.
     */
    public static enum DAYTIME {
        DAY,
        NIGHT,
        UNKNOWN
    }
    
    /**
     * Stores information about the time this photo was taken in.
     */
    public DAYTIME daytime = DAYTIME.UNKNOWN;
    /**
     * Reference retrieved from Google API.
     */
    public String reference;
    /**
     * The image retrieved from Google API.
     */
    public SImage image;
    /**
     * Stores segmented photo for debug purposes.
     */
    public SImage _image;
    
    
    /**
     * Return the widht of assigned image or 0 if not initialized yet.
     * @return The widht of assigned image or 0 if not initialized yet.
     */
    public int getWidth() {
        return (image == null) ? 0 : image.getWidth();
    }
    
    /**
     * Return the height of assigned image or 0 if not initialized yet.
     * @return The height of assigned image or 0 if not initialized yet.
     */
    public int getHeight() {
        return (image == null) ? 0 : image.getHeight();
    }

    /**
     * Get string description of this instance.
     * 
     * @return String description of this instance.
     */
    @Override
    public String toString() {
        return "Photo: " + getWidth() + "x" + getHeight() + "; ref = " + reference;
    }
    
}
