
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Photo;
import com.kappa_labs.ohunter.entities.Player;

/**
 * Request to make comparsion between given photos.
 */
abstract public class CompareRequest extends Request {
    
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

    @Override
    public int getID() {
        return Request.COMPARE;
    }
    
//    @Override
//    public Response execute() throws OHException {
//        float similarity = Analyzer.computeSimilarity(ph1, ph2);
//        Response response = new Response(uid);
//        response.similarity = similarity;
//        
//        return response;
//    }

}
