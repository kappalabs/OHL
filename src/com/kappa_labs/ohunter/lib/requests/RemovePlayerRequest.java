package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to remove player from database.
 */
public class RemovePlayerRequest extends Request {

    /**
     * Creates a new request to remove given player from the database.
     *
     * @param player Player, who should be removed from the database.
     */
    public RemovePlayerRequest(Player player) {
        super(player);
    }

    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends RemovePlayerRequest> RemovePlayerRequest(R request) {
        super(request);
    }

}
