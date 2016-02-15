
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Photo;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to make a search and return places for given area.
 */
public class SearchRequest extends Request {
    
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
     * @param radius The radius of selected area in meters.
     * @param daytime The requested preffered daytime
     * @param width The requested width of photos.
     * @param height The requested height of photos.
     */
    public SearchRequest(Player player, double lat, double lng, int radius,
            Photo.DAYTIME daytime, int width, int height) {
        this.player = player;
        this.lat = lat;
        this.lng = lng;
        this.radius = radius;
        this.width = width;
        this.height = height;
        
        this.uid = player.getUID();
    }
    
    public SearchRequest(SearchRequest sr) {
        player = sr.player;
        lat = sr.lat;
        lng = sr.lng;
        radius = sr.radius;
        width = sr.width;
        height = sr.height;
        
        uid = sr.uid;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.SEARCH,
//                new Object[]{player, lat, lng, radius, width, height});
//    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.SEARCH;
//    }
    
}