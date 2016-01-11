
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;


/**
 * Request to reset all the progress of this player, as if it was a new player.
 */
public class ResetPlayerRequest extends Request {

    /**
     * Creates a new request to reset progress of given player,
     * as if it was a new player.
     * 
     * @param player The player, which will be reset.
     */
    public ResetPlayerRequest(Player player) {
        this.player = player;
    }
    
    public ResetPlayerRequest(ResetPlayerRequest rpr) {
        player = rpr.player;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.RESET_PLAYER,
//                new Object[]{player});
//    }
    
//    @Override
//    public Request.TYPE getType() {
//        return Request.TYPE.RESET_PLAYER;
//    }

}
