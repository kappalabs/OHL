
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Player;

/**
 * Request to make a search and return places for given area.
 */
abstract public class SearchRequest extends Request {
    
    /**
     * Types of objects, that will be returned as result photos, supported by GAPI.
     */
    public static final String TYPES = "university|synagogue|city_hall|church|museum|mosque|";

    protected double lat;
    protected double lng;
    protected String keyWord;
    protected int radius;
    
    /**
     * Based on Android device, it can request photos with suitable dimensions.
     */
    protected int width, height;
    

    /**
     * Search will be based on given location and area radius. The dimension
     * of photos will be adjusted to suffice the requirements.
     * 
     * @param player The player who is requesting the search.
     * @param lat The latitude of location.
     * @param lng The longitude of location.
     * @param radius The radius of selected area.
     * @param width The requested width of photos.
     * @param height The requested height of photos.
     */
    public SearchRequest(Player player, double lat, double lng, int radius, int width, int height) {
        this.player = player;
        this.lat = lat;
        this.lng = lng;
        this.radius = radius;
        this.width = width;
        this.height = height;
        
        this.uid = player.getUID();
//        this.time = System.currentTimeMillis();
    }
    
    @Override
    public TYPE getType() {
        return TYPE.SEARCH;
    }
    
}