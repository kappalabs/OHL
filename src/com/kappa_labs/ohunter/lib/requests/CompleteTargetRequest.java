package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.net.Request;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to complete a target for a player.
 */
public class CompleteTargetRequest extends Request {

    /**
     * Place ID, from Google Places, of the completed target.
     */
    protected String placeID;
    /**
     * Photo reference, from Google Places, of the image that was used as a
     * reference photo.
     */
    protected String photoReference;
    /**
     * Number of points given for finding the target.
     */
    protected int discoveryGain;
    /**
     * Number of points given for photo similarity.
     */
    protected int similarityGain;
    /**
     * The number of hunt, in which the target was completed.
     */
    protected int huntNumber;

    
    /**
     * Creates a new request to complete a target, specified by given place ID
     * for given player.
     *
     * @param player Player, who completed the target.
     * @param placeID Place ID, from Google Places, of the completed target.
     * @param photoReference Photo reference, from Google Places, of the image
     * that was used as a reference photo.
     */
    public CompleteTargetRequest(Player player, String placeID, String photoReference) {
        super(player);

        this.placeID = placeID;
        this.photoReference = photoReference;
    }

    /**
     * Creates a new request to complete a target and add a score gain to the
     * player.
     *
     * @param player Player, who completed the place.
     * @param placeID Place ID, from Google Places, of the completed target.
     * @param photoReference Photo reference, from Google Places, of the image
     * that was used as a reference photo.
     * @param discoveryGain The number of points given for finding this target.
     * @param similarityGain The number of points given for photo similarity.
     * @param huntNumber The number of hunt, in which the target was completed.
     */
    public CompleteTargetRequest(Player player, String placeID, String photoReference, int discoveryGain, int similarityGain, int huntNumber) {
        super(player);

        this.placeID = placeID;
        this.photoReference = photoReference;
        this.discoveryGain = discoveryGain;
        this.similarityGain = similarityGain;
        this.huntNumber = huntNumber;
    }

    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends CompleteTargetRequest> CompleteTargetRequest(R request) {
        super(request);

        placeID = request.placeID;
        photoReference = request.photoReference;
        discoveryGain = request.discoveryGain;
        similarityGain = request.similarityGain;
        huntNumber = request.huntNumber;
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

    /**
     * Gets the number of hunt, in which the target was completed.
     *
     * @return The number of hunt, in which the target was completed.
     */
    public int getHuntNumber() {
        return huntNumber;
    }

}
