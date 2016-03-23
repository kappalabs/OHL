package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to change password of existing player.
 */
public class ChangePasswordRequest extends Request {

    /**
     * The old password to be changed.
     */
    protected String oldPassword;
    /**
     * The new password to be set.
     */
    protected String newPassword;

    
    /**
     * Creates a new request to change password of given player to new one.
     *
     * @param player The Player, whose newPassword will be changed.
     * @param oldPassword The old password to be changed.
     * @param newPassword The new password to be set.
     */
    public ChangePasswordRequest(Player player, String oldPassword, String newPassword) {
        super(player);

        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    /**
     * Create deep copy of the given request.
     *
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends ChangePasswordRequest> ChangePasswordRequest(R request) {
        super(request);

        oldPassword = request.oldPassword;
        newPassword = request.newPassword;
    }

}
