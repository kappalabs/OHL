
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to retrieve a list of the best players in the game.
 */
public class BestPlayersRequest extends Request {
    
    /**
     * The maximum number of best players to be retrieved.
     */
    protected int count;
    
    
    /**
     * Creates a new request to retrieve a list of best players in the game.
     * 
     * @param requester The player who requests the list.
     * @param count The maximum number of best players to be returned.
     */
    public BestPlayersRequest(Player requester, int count) {
        super(requester);
        
        this.count = count;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends BestPlayersRequest> BestPlayersRequest(R request) {
        super(request);
        
        this.count = request.count;
    }

}
