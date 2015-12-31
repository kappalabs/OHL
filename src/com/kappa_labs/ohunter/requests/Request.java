
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.net.OHException;
import com.kappa_labs.ohunter.net.Response;


/**
 * Class to provide interface for command pattern.
 */
abstract public class Request extends RequestPkg {
    
    /**
     * Request identifier for client usage.
     */
    public enum TYPE {
        UNKNOWN,
        LOGIN,
        REGISTER,
        COMPARE,
        SEARCH,
        REMOVE_PLAYER,
        RESET_PLAYER,
        UPDATE_PLAYER,
        CHANGE_PASSWORD,
        COMPLETE_PLACE,
        REJECT_PLACE,
        BLOCK_PLACE
    }

    
    /**
     * Creates a new request, makes a timestamp.
     */
    public Request() {
        super();
    }
    
//    /**
//     * Creates a new request of specified type, makes a timestamp.
//     * @param type
//     */
//    public Request(TYPE type) {
//        super(type);
//    }
    
    /**
     * Execute the request (done on server side) and return the result.
     * 
     * @return The result of the request command.
     * @throws OHException When error arises during the execution.
     */
    abstract public Response execute() throws OHException;
    
}
