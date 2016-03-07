
package com.kappa_labs.ohunter.lib.net;

import com.kappa_labs.ohunter.lib.entities.Place;
import com.kappa_labs.ohunter.lib.entities.Player;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Wrapper class for the response to previous Request.
 */
public class Response implements Serializable {
    
    /**
     * Who created the request.
     */
    private final int uid;
    /**
     * Time of creation of the request.
     */
    private final long time;
    
    /**
     * Player data object if requested, otherwise null.
     */
    public Player player;
    /**
     * Similarity measure if requested, otherwise NaN.
     */
    public float similarity = Float.NaN;
    /**
     * List of Places if requested, otherwise null.
     */
    public Place[] places;
    
    
    /**
     * Create a new response by specifying the reciever of it.
     * 
     * @param uid The reciever player ID, who requested the command.
     */
    public Response(int uid) {
        this.uid = uid;
        this.time = System.currentTimeMillis();
    }

    /**
     * Create a new response by specifying the reciever of it.
     * 
     * @param player The reciever player, who requested the command.
     */
    public Response(Player player) {
        this(player.getUID());
        
        this.player = player;
    }

    /**
     * Gets the unique identifier of the response requester.
     * 
     * @return The unique identifier of the response requester.
     */
    public int getUid() {
        return uid;
    }
    
    /**
     * Gets the time of creation of this response.
     * 
     * @return The time of creation of this response.
     */
    public long getTime() {
        return time;
    }
    
    /**
     * Return a string with simple info about time creation.
     * 
     * @return A string with simple info about time creation.
     */
    public String getTimeStamp() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return "created at "+sdf.format(cal.getTime());
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + uid + "]: " + getTimeStamp();
    }
    
}
