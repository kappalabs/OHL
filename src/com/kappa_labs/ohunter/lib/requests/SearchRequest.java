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

        this.latitude = lat;
        this.longitude = lng;
        this.radius = radius;
        this.daytime = daytime;
        this.width = width;
        this.height = height;
    }

    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends SearchRequest> SearchRequest(R request) {
        super(request);

        latitude = request.latitude;
        longitude = request.longitude;
        radius = request.radius;
        daytime = request.daytime;
        width = request.width;
        height = request.height;
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

    /**
     * Gets the preffered daytime.
     * 
     * @return The preffered daytime.
     */
    public Photo.DAYTIME getDaytime() {
        return daytime;
    }

    /**
     * Gets the maximum width of the images.
     * 
     * @return The maximum width of the images.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the maximum height of the images.
     * 
     * @return The maximum height of the images.
     */
    public int getHeight() {
        return height;
    }
    
}
