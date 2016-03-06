
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
    protected Photo photo1, photo2;

    
    /**
     * Creates a new request for comparsion between given photos.
     * 
     * @param player Player, that creates the request.
     * @param photo1 First photo.
     * @param photo2 Second photo.
     */
    public CompareRequest(Player player, Photo photo1, Photo photo2) {
        super(player);
        
        this.photo1 = photo1;
        this.photo2 = photo2;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param request Request to be copied.
     */
    public CompareRequest(CompareRequest request) {
        super(request);
        
        photo1 = request.photo1;
        photo2 = request.photo2;
    }

}
