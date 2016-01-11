
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Photo;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to make comparsion between given photos.
 */
public class CompareRequest extends Request {
    
    /**
     * Photos to be compared.
     */
    protected Photo ph1, ph2;

    
    /**
     * Creates a new request for comparsion between given photos.
     * 
     * @param player Who created the request.
     * @param ph1 First photo.
     * @param ph2 Second photo.
     */
    public CompareRequest(Player player, Photo ph1, Photo ph2) {
        this.player = player;
        this.ph1 = ph1;
        this.ph2 = ph2;
    }
    
    public CompareRequest(CompareRequest cr) {
        player = cr.player;
        ph1 = cr.ph1;
        ph2 = cr.ph2;
    }
    
//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.COMPARE,
//                new Object[]{player, ph1, ph2});
//    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.COMPARE;
//    }

}
