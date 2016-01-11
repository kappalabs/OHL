
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;


/**
 * Request to block a place for all players.
 */
public class BlockPlaceRequest extends Request {
    
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
    
    public BlockPlaceRequest(BlockPlaceRequest bpr) {
        player = bpr.player;
        placeKey = bpr.placeKey;
    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.BLOCK_PLACE;
//    }

}
