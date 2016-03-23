package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to block a place for all players.
 */
public class BlockPlaceRequest extends Request {

    /**
     * Place ID from Google Places of the Place to block.
     */
    protected String placeID;

    
    /**
     * Creates a new request to block given place for all the players.
     *
     * @param player Player, that creates the request.
     * @param placeID Place ID from Google Places of the place, that should be
     * blocked.
     */
    public BlockPlaceRequest(Player player, String placeID) {
        super(player);

        this.placeID = placeID;
    }
    
    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends BlockPlaceRequest> BlockPlaceRequest(R request) {
        super(request);

        placeID = request.placeID;
    }

    /**
     * Gets the Place ID of the Place to block.
     *
     * @return The Place ID of the Place to block.
     */
    public String getPlaceID() {
        return placeID;
    }

}
