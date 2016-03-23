package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;
import com.kappa_labs.ohunter.lib.net.OHException;
import com.kappa_labs.ohunter.lib.net.Response;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Class to provide interface for command pattern.
 */
abstract public class Request implements Serializable {

    /**
     * Unique identifier of the requester.
     */
    protected final int uid;
    /**
     * Timestamp of creation of the request.
     */
    protected final Timestamp timestamp;
    /**
     * Creator of this request.
     */
    protected final Player player;

    
    /**
     * Creates a new request, sets the timestamp to the current time.
     */
    public Request() {
        this.uid = 0;
        this.timestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
        this.player = null;
    }

    /**
     * Creates a new request for given player.
     *
     * @param player Player who makes the request.
     */
    public Request(Player player) {
        this.uid = player.getUID();
        this.timestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
        this.player = player;
    }

    /**
     * Creates a deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends Request> Request(R request) {
        this.uid = request.uid;
        this.timestamp = request.timestamp;
        this.player = request.player;
    }

    /**
     * Execute the request (done on server side) and return the result.
     *
     * @return The result of the request command.
     * @throws OHException When error arises during the execution.
     */
    public Response execute() throws OHException {
        throw new UnsupportedOperationException("Must be implemented only on the server side!");
    }

    /**
     * Gets the unique identifier of the requester.
     *
     * @return The unique identifier of the requester.
     */
    public int getUid() {
        return uid;
    }

    /**
     * Gets the timestamp of creation of this request.
     *
     * @return The timestamp of creation of this request.
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Gets the creator of this request.
     *
     * @return The creator of this request.
     */
    public Player getPlayer() {
        return player;
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
        return this.getClass().getSimpleName() + " [" + (player == null ? "uid" : player.getUID()) + "]: " + makeStamp();
    }

}
