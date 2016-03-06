
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to complete a place for a player.
 */
public class CompletePlaceRequest extends Request {
    
    /**
     * Place ID from Google Places of the Place to block.
     */
    protected String placeID;

    
    /**
     * Creates a new request to complete a place, specified by given place key
     * for given player.
     * 
     * @param player Player, who completed the place.
     * @param placeID Place ID from Google Places of the place, that was completed.
     */
    public CompletePlaceRequest(Player player, String placeID) {
        super(player);
        
        this.placeID = placeID;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param request Request to be copied.
     */
    public CompletePlaceRequest(CompletePlaceRequest request) {
        super(request);
        
        placeID = request.placeID;
    }

}
