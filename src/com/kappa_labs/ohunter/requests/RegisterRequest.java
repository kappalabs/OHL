
package com.kappa_labs.ohunter.requests;


/**
 * Request to register a new player.
 */
abstract public class RegisterRequest extends Request {
    
    protected String nickname;
    protected String password;

    
    /**
     * Creates a new request to register a new player with given nickname
     * and password hash.
     * 
     * @param nickname The nickname of the player.
     * @param password The password hash.
     */
    public RegisterRequest(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }
    
    @Override
    public TYPE getType() {
        return TYPE.REGISTER;
    }

}
