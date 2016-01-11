
package com.kappa_labs.ohunter.lib.requests;

import com.kappa_labs.ohunter.lib.entities.Player;


/**
 * Request to change password of existing player.
 */
public class ChangePasswordRequest extends Request {
    
//    protected String nickname;
    protected String oldPassword;
    protected String password;

    
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
    
    public ChangePasswordRequest(ChangePasswordRequest cpr) {
        player = cpr.player;
        oldPassword = cpr.oldPassword;
        password = cpr.password;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.CHANGE_PASSWORD,
//                new Object[]{player, oldPassword, password});
//    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.CHANGE_PASSWORD;
//    }
    
}
