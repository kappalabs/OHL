
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to make a radar search and return Places with only Place IDs from Google Places API.
 */
public class RadarSearchRequest extends Request {

    /**
     * Latitude of the circular area.
     */
    protected double latitude;
    /**
     * Longitude of the circular area.
     */
    protected double longitude;
    /**
     * Radius of the circular area.
     */
    protected int radius;
    
    
    /**
     * Creates a new request to search for places in circular area defined by
     * given location and area radius. Results will be filtered based on given
     * Player.
     *
     * @param player The player who is requesting the search.
     * @param latitude The latitude of location.
     * @param longitude The longitude of location.
     * @param radius The radius of selected area in meters.
     */
    public RadarSearchRequest(Player player, double latitude, double longitude, int radius) {
        super(player);
        
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends RadarSearchRequest> RadarSearchRequest(R request) {
        super(request);
        
        latitude = request.latitude;
        longitude = request.longitude;
        radius = request.radius;
    }

    /**
     * Gets the latitude of the circular area.
     * 
     * @return The latitude of the circular area.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the longitude of the circular area.
     * 
     * @return The longitude of the circular area.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Gets the radius of the circular area.
     * 
     * @return The radius of the circular area.
     */
    public int getRadius() {
        return radius;
    }
    
}
