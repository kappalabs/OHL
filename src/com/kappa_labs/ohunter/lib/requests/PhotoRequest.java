
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.net.Request;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request for a photo for given photo reference from Google Places API.
 */
public class PhotoRequest extends Request {

    /**
     * References to photos for retrieval from Google Places API.
     */
    protected String[] photoReferences;
    /**
     * Maximum width of the images.
     */
    protected int width;
    /**
     * Maximum height of the images.
     */
    protected int height;

    
    /**
     * Creates a new request to retrive photos with given photo references from Google Places API.
     * 
     * @param player The player that is requesting.
     * @param photoReferences References to photos from Google Places API.
     * @param width Maximum width of the photos.
     * @param height Maximum height of the photos.
     */
    public PhotoRequest(Player player, String[] photoReferences, int width, int height) {
        super(player);

        if (photoReferences == null) {
            throw new NullPointerException("Array of photo references cannot be null!");
        }
        this.photoReferences = photoReferences;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Create copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends PhotoRequest> PhotoRequest(R request) {
        super(request);

        photoReferences = request.photoReferences;
        width = request.width;
        height = request.height;
    }

    /**
     * Gets the references to photos for retrieval from Google Places API.
     * 
     * @return The references to photos for retrieval from Google Places API.
     */
    public String[] getPhotoReferences() {
        return photoReferences;
    }

    /**
     * Gets the maximum width of the images.
     * 
     * @return The maximum width of the images.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the maximum height of the images.
     * 
     * @return The maximum height of the images.
     */
    public int getHeight() {
        return height;
    }
    
}
