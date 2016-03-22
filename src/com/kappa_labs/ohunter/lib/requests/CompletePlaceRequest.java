
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to complete a place for a player.
 */
public class CompletePlaceRequest extends Request {
    
    /**
     * Place ID, from Google Places, of the completed place.
     */
    protected String placeID;
    /**
     * Photo reference, from Google Places, of the image that was used as a reference photo.
     */
    protected String photoReference;

    
    /**
     * Creates a new request to complete a place, specified by given place key
     * for given player.
     * 
     * @param player Player, who completed the place.
     * @param placeID Place ID, from Google Places, of the completed place.
     * @param photoReference Photo reference, from Google Places, of the image that was used as a reference photo.
     */
    public CompletePlaceRequest(Player player, String placeID, String photoReference) {
        super(player);
        
        this.placeID = placeID;
        this.photoReference = photoReference;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param request Request to be copied.
     */
    public CompletePlaceRequest(CompletePlaceRequest request) {
        super(request);
        
        placeID = request.placeID;
        photoReference = request.photoReference;
    }

    /**
     * Gets the Place ID of the place to be completed.
     * 
     * @return The Place ID of the place to be completed.
     */
    public String getPlaceID() {
        return placeID;
    }

    /**
     * Gets the photo reference from Google Places of the photo, that was used as a reference photo.
     * 
     * @return The photo reference from Google Places of the photo, that was used as a reference photo.
     */
    public String getPhotoReference() {
        return photoReference;
    }

}
