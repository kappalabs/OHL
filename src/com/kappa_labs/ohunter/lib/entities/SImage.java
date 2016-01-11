
package com.kappa_labs.ohunter.lib.entities;

import java.io.Serializable;


/**
 * Class to store image with possibility to send it over TCP.
 */
public class SImage implements Serializable {
    
    public byte[] image;
    protected int width;
    protected int height;

    
    /**
     * Creates a new SImage with uninitialized fields.
     */
    public SImage() { }
    
    /**
     * Creates a new SImage with fields initialized to given values.
     * 
     * @param image Image data in 3BYTE BRG format.
     * @param width
     * @param height 
     */
    public SImage(byte[] image, int width, int height) {
        this.image = image;
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the image data of this SImage.
     * 
     * @return The image data of this SImage.
     */
    public byte[] getImage() {
        return image;
    }
    
    /**
     * Sets the image data of this SImage.
     * 
     * @param image The image data to be set to this SImage.
     */
    public void setImage(byte[] image) {
        this.image = image;
    }
    
    /**
     * Gets the height of this image.
     * 
     * @return The height of this image.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the width of this image.
     * 
     * @return The width of this image.
     */
    public int getWidth() {
        return width;
    }
    
}
