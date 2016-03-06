
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Photo;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to make a search and return places for given area.
 */
public class SearchRequest extends Request {

    /**
     * Latitude of the circular area.
     */
    protected double lat;
    /**
     * Longitude of the circular area.
     */
    protected double lng;
    /**
     * Radius of the circular area.
     */
    protected int radius;
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
     * Search will be based on given location and area radius. The dimension
     * of photos will be adjusted to suffice the requirements.
     * 
     * @param player The player who is requesting the search.
     * @param lat The latitude of location.
     * @param lng The longitude of location.
     * @param radius The radius of selected area in meters.
     * @param daytime The requested preffered daytime
     * @param width The maximum requested width of photos.
     * @param height The maximum requested height of photos.
     */
    public SearchRequest(Player player, double lat, double lng, int radius,
            Photo.DAYTIME daytime, int width, int height) {
        super(player);
        
        this.lat = lat;
        this.lng = lng;
        this.radius = radius;
        this.daytime = daytime;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param request Request to be copied.
     */
    public SearchRequest(SearchRequest request) {
        super(request);
        
        lat = request.lat;
        lng = request.lng;
        radius = request.radius;
        daytime = request.daytime;
        width = request.width;
        height = request.height;
    }
    
}
