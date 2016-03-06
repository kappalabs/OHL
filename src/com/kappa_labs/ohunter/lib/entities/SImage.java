
package com.kappa_labs.ohunter.lib.entities;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Class to store bytes with possibility to send it over TCP (Serializable Image).
 */
public class SImage implements Serializable {
    
    /**
     * Image stored in encoded form in byte array.
     */
    public byte[] bytes;
    /**
     * Width of the stored image.
     */
    protected int width;
    /**
     * Height of the stored image.
     */
    protected int height;

    
    /**
     * Creates a new SImage with uninitialized fields.
     */
    public SImage() { }
    
    /**
     * Creates a new SImage with fields initialized to given values.
     * 
     * @param bytes Byte data of the image.
     * @param width Width of the image.
     * @param height Height of the image.
     */
    public SImage(byte[] bytes, int width, int height) {
        this.bytes = bytes;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Creates a deep copy of the given SImage.
     * 
     * @param sImage The SImage to be copied.
     */
    public SImage(SImage sImage) {
        if (sImage.bytes != null) {
            this.bytes = Arrays.copyOf(sImage.bytes, sImage.bytes.length);
        }
        this.width = sImage.width;
        this.height = sImage.height;
    }

    /**
     * Gets the byte data of this image.
     * 
     * @return The byte data of this image.
     */
    public byte[] getBytes() {
        return bytes;
    }
    
    /**
     * Sets the byte data of this image.
     * 
     * @param image The byte data to be set.
     */
    public void setBytes(byte[] image) {
        this.bytes = image;
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
