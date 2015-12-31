
package com.kappa_labs.ohunter.requests;

import com.kappa_labs.ohunter.entities.Player;

/**
 * Request to change password of existing player.
 */
abstract public class ChangePasswordRequest extends Request {
    
    protected String nickname;
    protected String password;
    protected String oldPassword;

    
    /**
     * Creates a new request to change password hash of given
     * player to given password hash.
     * 
     * @param player The Player, whose password will be changed.
     * @param oldPassword
     * @param password The password hash.
     */
    public ChangePasswordRequest(Player player, String oldPassword, String password) {
        this.player = player;
        this.oldPassword = oldPassword;
        this.password = password;
    }
    
    @Override
    public TYPE getType() {
        return TYPE.CHANGE_PASSWORD;
    }
    
}
