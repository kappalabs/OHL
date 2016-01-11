
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;


/**
 * Request to update players settings in database.
 */
public class UpdatePlayerRequest extends Request {

    /**
     * Creates a new request to update values of given player in database.
     * 
     * @param player The player, whose values should be updated in database.
     */
    public UpdatePlayerRequest(Player player) {
        this.player = player;
    }
    
    public UpdatePlayerRequest(UpdatePlayerRequest upr) {
        player = upr.player;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.UPDATE_PLAYER,
//                new Object[]{player});
//    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.UPDATE_PLAYER;
//    }

}
