
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;


/**
 * Request to reject place for given player.
 */
public class RejectPlaceRequest extends Request {
    
    protected String placeKey;
    
    
    /**
     * Creates a new request to reject given place, specified by place key
     * for given player.
     * 
     * @param player Player, who is rejecting the place.
     * @param placeKey The place key, that identifies the place to be rejected.
     */
    public RejectPlaceRequest(Player player, String placeKey) {
        this.player = player;
        this.placeKey = placeKey;
    }
    
    public RejectPlaceRequest(RejectPlaceRequest rpr) {
        player = rpr.player;
        placeKey = rpr.placeKey;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.REJECT_PLACE,
//                new Object[]{player, placeKey});
//    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.REJECT_PLACE;
//    }

}
