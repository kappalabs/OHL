
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Player;


/**
 * Request to reset all the progress of this player, as if it was a new player.
 */
abstract public class ResetPlayerRequest extends Request {

    /**
     * Creates a new request to reset progress of given player,
     * as if it was a new player.
     * 
     * @param player The player, which will be reset.
     */
    public ResetPlayerRequest(Player player) {
        this.player = player;
    }
    
    @Override
    public Request.TYPE getType() {
        return Request.TYPE.RESET_PLAYER;
    }

}
