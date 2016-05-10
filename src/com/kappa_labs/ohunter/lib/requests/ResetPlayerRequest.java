package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.net.Request;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to reset all the progress of this player, as if it was a new player.
 */
public class ResetPlayerRequest extends Request {

    /**
     * Creates a new request to reset progress of given player, as if it was
     * a new player.
     *
     * @param player The player, which will be reset.
     */
    public ResetPlayerRequest(Player player) {
        super(player);
    }

    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends ResetPlayerRequest> ResetPlayerRequest(R request) {
        super(request);
    }

}
