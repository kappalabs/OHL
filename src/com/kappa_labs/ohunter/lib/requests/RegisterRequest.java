
package com.kappa_labs.ohunter.lib.requests;


/**
 * Request to register a new player.
 */
public class RegisterRequest extends Request {
    
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
    
    public RegisterRequest(RegisterRequest rr) {
        nickname = rr.nickname;
        password = rr.password;
    }

//    @Override
//    public RequestPkg getRequestPkg() {
//        return new RequestPkg(
//                TYPE.REGISTER,
//                new Object[]{nickname, password});
//    }
    
//    @Override
//    public TYPE getType() {
//        return TYPE.REGISTER;
//    }

}
