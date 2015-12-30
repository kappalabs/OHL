
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Player;


/**
 * Request to block a place for all players.
 */
abstract public class BlockPlaceRequest extends Request {
    
    protected String placeKey;

    
    /**
     * Creates a new request to block given place for all the players.
     * 
     * @param player The player, who is requesting the blockage.
     * @param placeKey Identifier of the place, that should be blocked.
     */
    public BlockPlaceRequest(Player player, String placeKey) {
        this.player = player;
        this.placeKey = placeKey;
    }

    @Override
    public int getID() {
        return Request.BLOCK_PLACE;
    }

//    @Override
//    public Response execute() throws OHException {
//        DatabaseService ds = new DatabaseService();
//        ds.blockPlace(placeKey);
//        Response response = new Response(player);
//        
//        return response;
//    }

}
