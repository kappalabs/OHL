
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;


/**
 * Request to complete a place for a player.
 */
public class CompletePlaceRequest extends Request {
    
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
    
    public CompletePlaceRequest(CompletePlaceRequest cpr) {
        player = cpr.player;
        placeKey = cpr.placeKey;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.COMPLETE_PLACE,
//                new Object[]{player, placeKey});
//    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.COMPLETE_PLACE;
//    }

}
