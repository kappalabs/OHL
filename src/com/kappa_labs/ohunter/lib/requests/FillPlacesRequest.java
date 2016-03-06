
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Photo;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to add details and photos to the given places.
 */
public class FillPlacesRequest extends Request {
    
    /**
     * Place IDs of the places to be filled.
     */
    protected String[] placeIDs;
    /**
     * Preffered daytime.
     */
    protected Photo.DAYTIME daytime;
    /**
     * Maximum width of the images.
     */
    protected int width;
    /**
     * Maximum height of the images.
     */
    protected int height;

    
    /**
     * Search will be based on given location and area radius. Results will
     * be filtered based on given Player.
     * 
     * @param player The player who is requesting.
     * @param placeIDs Array of place IDs to be filled with data.
     * @param daytime The requested preffered daytime
     * @param width The maximum requested width of photos.
     * @param height The maximum requested height of photos.
     */
    public FillPlacesRequest(Player player, String[] placeIDs, Photo.DAYTIME daytime, int width, int height) {
        super(player);
        
        this.placeIDs = placeIDs;
        this.daytime = daytime;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param request Request to be copied.
     */
    public FillPlacesRequest(FillPlacesRequest request) {
        super(request);
        
        placeIDs = request.placeIDs;
        daytime = request.daytime;
        width = request.width;
        height = request.height;
    }

}
