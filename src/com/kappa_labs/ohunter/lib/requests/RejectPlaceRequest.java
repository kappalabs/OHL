package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to reject place for given player.
 */
public class RejectPlaceRequest extends Request {

    /**
     * Place ID from Google Places of the Place to block.
     */
    protected String placeID;
    /**
     * Number of points that should be removed for blocking this place.
     */
    protected int loss;

    
    /**
     * Creates a new request to reject given place, specified by place ID,
     * for given player.
     *
     * @param player Player, who is rejecting the place.
     * @param placeID Place ID from Google Places, that identifies the place
     * to be rejected.
     */
    public RejectPlaceRequest(Player player, String placeID) {
        super(player);

        this.placeID = placeID;
    }

    /**
     * Creates a new request to reject given place and subtract points from
     * given player.
     *
     * @param player Player, who is rejecting the place.
     * @param placeID Place ID from Google Places, that identifies the place
     * to be rejected.
     * @param loss The number of points that will be subtracted from player score.
     */
    public RejectPlaceRequest(Player player, String placeID, int loss) {
        super(player);

        this.placeID = placeID;
        this.loss = loss;
    }

    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends RejectPlaceRequest> RejectPlaceRequest(R request) {
        super(request);

        placeID = request.placeID;
        loss = request.loss;
    }

    /**
     * Gets the place ID from Google Places of the Place to block.
     *
     * @return The place ID from Google Places of the Place to block.
     */
    public String getPlaceID() {
        return placeID;
    }

    /**
     * Gets the number of points that should be removed for blocking this place.
     *
     * @return The number of points that should be removed for blocking
     * this place.
     */
    public int getLoss() {
        return loss;
    }

}
