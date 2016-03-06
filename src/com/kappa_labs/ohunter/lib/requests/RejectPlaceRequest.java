
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
     * Creates a new request to reject given place, specified by place key
     * for given player.
     * 
     * @param player Player, who is rejecting the place.
     * @param placeID Place ID from Google Places, that identifies the place to be rejected.
     */
    public RejectPlaceRequest(Player player, String placeID) {
        super(player);
        
        this.placeID = placeID;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param request Request to be copied.
     */
    public RejectPlaceRequest(RejectPlaceRequest request) {
        super(request);
        
        placeID = request.placeID;
    }

}
