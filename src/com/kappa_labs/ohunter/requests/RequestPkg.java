
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Photo;
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
    private Request.TYPE type;
    
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
    
//    /**
//     * Create new Request package with specified type.
//     * @param type Type of the Request, which this package represents.
//     */
//    public RequestPkg(Request.TYPE type) {
//        this.type = type;
//        this.time = System.currentTimeMillis();
//    }
    
//    /**
//     * Sets the parameters of the choosen class.
//     * @param params Parameters of the choosen class.
//     */
//    public void setParams(Object[] params) {
//        this.params = params;
//    }
    
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
    
    public void callBlockPlaceRequest(Player player, String placeKey) {
        type = Request.TYPE.BLOCK_PLACE;
        params = new Object[]{player, placeKey};
    }
    
    public void callChangePlasswordRequest(Player player, String oldPassword, String password) {
        type = Request.TYPE.CHANGE_PASSWORD;
        params = new Object[]{player, oldPassword, password};
    }
    
    public void callCompareRequest(Player player, Photo ph1, Photo ph2) {
        type = Request.TYPE.COMPARE;
        params = new Object[]{player, ph1, ph2};
    }
    
    public void callCompletePlaceRequest(Player player, String placeKey) {
        type = Request.TYPE.COMPLETE_PLACE;
        params = new Object[]{player, placeKey};
    }
    
    public void callLoginRequest(String nickname, String password) {
        type = Request.TYPE.LOGIN;
        params = new Object[]{nickname, password};
    }
    
    public void callRegisterRequest(String nickname, String password) {
        type = Request.TYPE.REGISTER;
        params = new Object[]{nickname, password};
    }
    
    public void callRejectPlaceRequest(Player player, String placeKey) {
        type = Request.TYPE.REJECT_PLACE;
        params = new Object[]{player, placeKey};
    }
    
    public void callRemovePlayerRequest(Player player) {
        type = Request.TYPE.REMOVE_PLAYER;
        params = new Object[]{player};
    }
    
    public void callResetPlayerRequest(Player player) {
        type = Request.TYPE.RESET_PLAYER;
        params = new Object[]{player};
    }
    
    public void callSearchRequest(Player player, double lat, double lng, int radius, int width, int height) {
        type = Request.TYPE.SEARCH;
        params = new Object[]{player, lat, lng, radius, width, height};
    }
    
    public void callUpdatePlayerRequest(Player player) {
        type = Request.TYPE.UPDATE_PLAYER;
        params = new Object[]{player};
    }
}
