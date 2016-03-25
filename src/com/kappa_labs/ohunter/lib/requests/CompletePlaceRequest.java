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
     * Photo reference, from Google Places, of the image that was used as
     * a reference photo.
     */
    protected String photoReference;
    /**
     * Number of points given for finding this target.
     */
    protected int discoveryGain;
    /**
     * Number of points given for photo similarity.
     */
    protected int similarityGain;

    
    /**
     * Creates a new request to complete a place, specified by given place key
     * for given player.
     *
     * @param player Player, who completed the place.
     * @param placeID Place ID, from Google Places, of the completed place.
     * @param photoReference Photo reference, from Google Places, of the image
     * that was used as a reference photo.
     */
    public CompletePlaceRequest(Player player, String placeID, String photoReference) {
        super(player);

        this.placeID = placeID;
        this.photoReference = photoReference;
    }

    /**
     * Creates a new request to complete a place and add a score gain to the player.
     *
     * @param player Player, who completed the place.
     * @param placeID Place ID, from Google Places, of the completed place.
     * @param photoReference Photo reference, from Google Places, of the image
     * that was used as a reference photo.
     * @param discoveryGain The number of points given for finding this target.
     * @param similarityGain The number of points given for photo similarity.
     */
    public CompletePlaceRequest(Player player, String placeID, String photoReference, int discoveryGain, int similarityGain) {
        super(player);

        this.placeID = placeID;
        this.photoReference = photoReference;
        this.discoveryGain = discoveryGain;
        this.similarityGain = similarityGain;
    }

    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends CompletePlaceRequest> CompletePlaceRequest(R request) {
        super(request);

        placeID = request.placeID;
        photoReference = request.photoReference;
        discoveryGain = request.discoveryGain;
        similarityGain = request.similarityGain;
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
     * Gets the photo reference from Google Places of the photo, that was used
     * as a reference photo.
     *
     * @return The photo reference from Google Places of the photo, that was
     * used as a reference photo.
     */
    public String getPhotoReference() {
        return photoReference;
    }

    /**
     * Gets the number of points given for finding this target.
     * 
     * @return The number of points given for finding this target.
     */
    public int getDiscoveryGain() {
        return discoveryGain;
    }

    /**
     * Gets the number of points given for photo similarity.
     * 
     * @return The number of points given for photo similarity.
     */
    public int getSimilarityGain() {
        return similarityGain;
    }

}
