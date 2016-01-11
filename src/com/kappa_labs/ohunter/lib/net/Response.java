
package com.kappa_labs.ohunter.lib.net;

import com.kappa_labs.ohunter.lib.entities.Place;
import com.kappa_labs.ohunter.lib.entities.Player;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * Wrapper class for the response to previous Request.
 */
public class Response implements Serializable {
    
    /**
     * Who created the request.
     */
    protected int uid;
    /**
     * Time of creation of the request.
     */
    protected long time;
    
    //NOTE: supported data objects
    public Player player;
    public float similarity = Float.NaN;
    public ArrayList<Place> places;
    
    
    /**
     * Create a new response by specifiing the reciever of it.
     * 
     * @param uid The reciever player ID, who requested the command.
     */
    public Response(int uid) {
        this.uid = uid;
        this.time = System.currentTimeMillis();
    }

    /**
     * Create a new response by specifiing the reciever of it.
     * 
     * @param player The reciever player, who requested the command.
     */
    public Response(Player player) {
        this(player.getUID());
        
        this.player = player;
    }
    
}
