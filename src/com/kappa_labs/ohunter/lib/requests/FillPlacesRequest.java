package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Photo;
import com.kappa_labs.ohunter.lib.entities.Place;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to add details and photos to the given places.
 */
public class FillPlacesRequest extends Request {

    /**
     * Places with place ID set from previous RadarSearch Request.
     */
    protected Place[] places;
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
     * Search will be based on given location and area radius. Results will be
     * filtered based on given Player.
     *
     * @param player The player who is requesting.
     * @param places Array of Places with place ID set from previous RadarSearch
     * Request.
     * @param daytime The requested preffered daytime
     * @param width The maximum requested width of photos.
     * @param height The maximum requested height of photos.
     */
    public FillPlacesRequest(Player player, Place[] places, Photo.DAYTIME daytime, int width, int height) {
        super(player);

        if (places == null) {
            throw new NullPointerException("Array of Places cannot be null!");
        }
        this.places = places;
        this.daytime = daytime;
        this.width = width;
        this.height = height;
    }

    /**
     * Search will be based on given location and area radius. Results will be
     * filtered based on given Player.
     *
     * @param player The player who is requesting.
     * @param placeIDs Array of place IDs to be filled with data.
     * @param daytime The requested preffered daytime
     * @param width The maximum requested width of photos.
     * @param height The maximum requested height of photos.
     */
    public FillPlacesRequest(Player player, String[] placeIDs, Photo.DAYTIME daytime, int width, int height) {
        super(player);

        if (placeIDs == null) {
            throw new NullPointerException("Array of place IDs cannot be null!");
        }
        places = new Place[placeIDs.length];
        for (int i = 0; i < placeIDs.length; i++) {
            places[i] = new Place();
            places[i].setID(placeIDs[i]);
        }
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
    public <R extends FillPlacesRequest> FillPlacesRequest(R request) {
        super(request);

        places = request.places;
        daytime = request.daytime;
        width = request.width;
        height = request.height;
    }

    /**
     * Gets the array of places with place ID set from previous RadarSearch Request.
     * 
     * @return The array of places with place ID set from previous RadarSearch Request.
     */
    public Place[] getPlaces() {
        return places;
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
