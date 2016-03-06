
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;

/**
 * Request to change newPassword of existing player.
 */
public class ChangePasswordRequest extends Request {
    
    /**
     * The old newPassword to be changed.
     */
    protected String oldPassword;
    /**
     * The new newPassword to be set.
     */
    protected String newPassword;

    
    /**
     * Creates a new request to change newPassword of given player
 to given new newPassword.
     * 
     * @param player The Player, whose newPassword will be changed.
     * @param oldPassword The old newPassword to be changed.
     * @param newPassword The new newPassword to be set.
     */
    public ChangePasswordRequest(Player player, String oldPassword, String newPassword) {
        super(player);
        
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param request Request to be copied.
     */
    public ChangePasswordRequest(ChangePasswordRequest request) {
        super(request);
        
        oldPassword = request.oldPassword;
        newPassword = request.newPassword;
    }
    
}
