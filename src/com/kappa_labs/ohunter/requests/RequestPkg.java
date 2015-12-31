
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Player;
import java.io.Serializable;

/**
 * Class for comunication with server. Creates sceleton for chosen Request
 * class, which will be reconstucted on the server side.
 */
public class RequestPkg implements Serializable {

    /**
     * Type of this request package.
     */
    private final Request.TYPE type;
    
    /**
     * Who created the request.
     */
    protected int uid;
    /**
     * Time of creation of the request.
     */
    private final long time;
    protected Player player;
    
    /**
     * Parameters of the appropriate constructor.
     */
    private Object[] params;

    
    /**
     * Create new Request package with unknown type.
     */
    public RequestPkg() {
        this.type = Request.TYPE.UNKNOWN;
        this.time = System.currentTimeMillis();
    }
    
    /**
     * Create new Request package with specified type.
     * @param type Type of the Request, which this package represents.
     */
    public RequestPkg(Request.TYPE type) {
        this.type = type;
        this.time = System.currentTimeMillis();
    }
    
    /**
     * Sets the parameters of the choosen class.
     * @param params Parameters of the choosen class.
     */
    public void setParams(Object[] params) {
        this.params = params;
    }
    
    /**
     * Gets the index-th parameter for the implementation class.
     * If the type is not consitent or not set, then null is returned.
     * 
     * @param <T> Desired type of the parametr.
     * @param index Index of the desired parameter.
     * @param clazz Class of the desired type.
     * @return The index-th parameter for the implementation class casted to required type.
     */
    public <T> T getParam(int index, Class<T> clazz) {
        if (params != null && params.length > index) {
            if (clazz.isInstance(params[index])) {
                return clazz.cast(params[index]);
            }
        }
        return null;
    }
    
    /**
     * Gets the type of request.
     * 
     * @return The type of request.
     */
    public Request.TYPE getType() {
        return type;
    }
    
}
