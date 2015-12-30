
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Player;


/**
 * Request to complete a place for a player.
 */
abstract public class CompletePlaceRequest extends Request {
    
    protected String placeKey;

    
    /**
     * Creates a new request to complete a place, specified by given place key
     * for given player.
     * 
     * @param player Player, who completed the place.
     * @param placeKey Identifier of the place, that was completed.
     */
    public CompletePlaceRequest(Player player, String placeKey) {
        this.player = player;
        this.placeKey = placeKey;
    }
    
    @Override
    public int getID() {
        return Request.COMPLETE_PLACE;
    }

//    @Override
//    public Response execute() throws OHException {
//        DatabaseService ds = new DatabaseService();
//        ds.completePlace(player, placeKey);
//        Response response = new Response(player);
//        
//        return response;
//    }

}
