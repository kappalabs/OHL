
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Player;


/**
 * Request to remove player from database.
 */
abstract public class RemovePlayerRequest extends Request {

    /**
     * Creates a new request to remove given player from the database.
     * 
     * @param player Player, who should be removed from the database.
     */
    public RemovePlayerRequest(Player player) {
        this.player = player;
    }
    
    @Override
    public int getID() {
        return Request.REMOVE_PLAYER;
    }
    
//    @Override
//    public Response execute() throws OHException {
//        DatabaseService ds = new DatabaseService();
//        ds.removePlayer(player);
//        
//        return null;
//    }

}
