
package com.kappa_labs.ohunter.lib.requests;


/**
 * Request to login a player into the application.
 */
public class LoginRequest extends Request {
    
    protected String nickname;
    protected String password;
    
    
    /**
     * Creates a new request for comparsion between given photos.
     * 
     * @param nickname The nickname of the player.
     * @param password The password hash.
     */
    public LoginRequest(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }
    
    public LoginRequest(LoginRequest lr) {
        nickname = lr.nickname;
        password = lr.password;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.LOGIN,
//                new Object[]{nickname, password});
//    }

//    @Override
//    public TYPE getType() {
//        return TYPE.LOGIN;
//    }
    
}
