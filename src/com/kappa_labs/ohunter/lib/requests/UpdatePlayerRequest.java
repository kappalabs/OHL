
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.net.Request;
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
        super(player);
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends UpdatePlayerRequest> UpdatePlayerRequest(R request) {
        super(request.player);
    }

}
