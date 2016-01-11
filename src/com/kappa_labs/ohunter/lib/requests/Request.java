
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;
import com.kappa_labs.ohunter.lib.net.OHException;
import com.kappa_labs.ohunter.lib.net.Response;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Class to provide interface for command pattern.
 */
abstract public class Request implements Serializable {
    
//    /**
//     * Request identifier for client usage.
//     */
//    public enum TYPE {
//        UNKNOWN,
//        LOGIN,
//        REGISTER,
//        COMPARE,
//        SEARCH,
//        REMOVE_PLAYER,
//        RESET_PLAYER,
//        UPDATE_PLAYER,
//        CHANGE_PASSWORD,
//        COMPLETE_PLACE,
//        REJECT_PLACE,
//        BLOCK_PLACE
//    }

    /**
     * Who created the request.
     */
    protected int uid;
    
    /**
     * Time of creation of the request.
     */
    private final long time;
    
    /**
     * Creator of this request.
     */
    protected Player player;
    
    
    /**
     * Creates a new request, makes a timestamp.
     */
    public Request() {
        this.time = System.currentTimeMillis();
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
     * Gets the time of creation of this request.
     * 
     * @return The time of creation of this request.
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
        return this.getClass().getName() + ": " + getTimeStamp();
    }
    
}
