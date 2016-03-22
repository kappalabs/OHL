package com.kappa_labs.ohunter.lib.net;

import com.kappa_labs.ohunter.lib.entities.Place;
import com.kappa_labs.ohunter.lib.entities.Player;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Wrapper class for the response to previous Request.
 */
public class Response implements Serializable {

    /**
     * Unique identifier of the response requester.
     */
    private final int uid;
    /**
     * Timestamp of creation of the response.
     */
    private final Timestamp timestamp;

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
     * Sets the timestamp to the current time.
     *
     * @param uid The reciever player ID, who requested the command.
     */
    public Response(int uid) {
        this.uid = uid;
        
        this.timestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
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
     * Gets the timestamp of creation of this response.
     *
     * @return The timestamp of creation of this response.
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Returns a string with simple info about creation time.
     *
     * @return The string with simple info about creation time.
     */
    public String makeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return "created at " + sdf.format(timestamp);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + uid + "]: " + makeStamp();
    }

}
