package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.net.Request;
import com.kappa_labs.ohunter.lib.entities.Photo;
import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to make comparison between given photos.
 */
public class CompareRequest extends Request {

    /**
     * Reference Photo, similarity is measured to this one.
     */
    protected Photo referencePhoto;
    /**
     * Images, that will be match against reference.
     */
    protected Photo[] similarPhotos;

    
    /**
     * Creates a new request for comparison between given reference photo and
     * an array of photos. Only the highest similarity will be returned.
     *
     * @param player Player, that creates the request.
     * @param referencPhoto Reference Photo, similarity is measured to this one.
     * @param similarPhotos Images, that will be compared to the reference photo.
     */
    public CompareRequest(Player player, Photo referencPhoto, Photo[] similarPhotos) {
        super(player);

        this.referencePhoto = referencPhoto;
        this.similarPhotos = similarPhotos;
    }

    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends CompareRequest> CompareRequest(R request) {
        super(request);

        referencePhoto = request.referencePhoto;
        similarPhotos = request.similarPhotos;
    }

    /**
     * Gets the reference Photo, to which the similarity is measured.
     *
     * @return The reference Photo, to which the similarity is measured.
     */
    public Photo getReferencePhoto() {
        return referencePhoto;
    }

    /**
     * Gets the array of photos, that will be compared to the reference photo.
     *
     * @return The array of photos, that will be compared to the reference photo.
     */
    public Photo[] getSimilarPhotos() {
        return similarPhotos;
    }

}
