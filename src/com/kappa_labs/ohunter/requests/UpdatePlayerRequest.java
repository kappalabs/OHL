
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Player;


/**
 * Request to update players settings in database.
 */
abstract public class UpdatePlayerRequest extends Request {

    /**
     * Creates a new request to update values of given player in database.
     * 
     * @param player The player, whose values should be updated in database.
     */
    public UpdatePlayerRequest(Player player) {
        this.player = player;
    }
    
    @Override
    public TYPE getType() {
        return TYPE.UPDATE_PLAYER;
    }

}
