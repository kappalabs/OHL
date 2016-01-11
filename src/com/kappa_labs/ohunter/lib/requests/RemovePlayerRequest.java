
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
        this.player = player;
    }
    
    public RemovePlayerRequest(RemovePlayerRequest rpr) {
        player = rpr.player;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.REMOVE_PLAYER,
//                new Object[]{player});
//    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.REMOVE_PLAYER;
//    }

}
