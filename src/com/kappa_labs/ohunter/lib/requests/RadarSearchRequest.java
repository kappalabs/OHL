
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to make a radar search and return Places with only Place IDs from Google Places API.
 */
public class RadarSearchRequest extends Request {
    
    /**
     * Types of objects, that will be returned as result photos, supported by GAPI.
     */
    public static final String TYPES = "university|synagogue|city_hall|church|museum|mosque|";

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
     * Search will be based on given location and area radius. Results will
     * be filtered based on given Player.
     * 
     * @param player The player who is requesting the search.
     * @param lat The latitude of location.
     * @param lng The longitude of location.
     * @param radius The radius of selected area in meters.
     */
    public RadarSearchRequest(Player player, double lat, double lng, int radius) {
        super(player);
        
        this.lat = lat;
        this.lng = lng;
        this.radius = radius;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param request Request to be copied.
     */
    public RadarSearchRequest(RadarSearchRequest request) {
        super(request);
        
        lat = request.lat;
        lng = request.lng;
        radius = request.radius;
    }
    
}
