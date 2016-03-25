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
    public SImage sImage;
    /**
     * Can be used for debug purposes.
     */
    public SImage _sImage;

    
    /**
     * Return the width of assigned image or 0 if not initialized yet.
     *
     * @return The width of assigned image or 0 if not initialized yet.
     */
    public int getWidth() {
        return (sImage == null) ? 0 : sImage.getWidth();
    }

    /**
     * Return the height of assigned image or 0 if not initialized yet.
     *
     * @return The height of assigned image or 0 if not initialized yet.
     */
    public int getHeight() {
        return (sImage == null) ? 0 : sImage.getHeight();
    }

    /**
     * Get string description of this instance.
     *
     * @return String description of this instance.
     */
    @Override
    public String toString() {
        return "Photo: " + getWidth() + "x" + getHeight() + "; " + daytime.name() + "; ref = " + reference;
    }

    /**
     * Generates a name for this object of a given maximum length.
     *
     * @param maxLength Maximum length of the name.
     * @return The name for this object of a given maximum length.
     */
    public String generateName(int maxLength) {
        String name = "photo_" + daytime.name() + "_" + getWidth() + "x" + getHeight() + "_" + (reference == null ? System.currentTimeMillis() : reference);
        return name.substring(0, Math.min(name.length(), maxLength));
    }

}
