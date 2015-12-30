
package com.kappa_labs.ohunter.requests;


/**
 * Request to login a player into the application.
 */
abstract public class LoginRequest extends Request {
    
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
    
    @Override
    public int getID() {
        return Request.LOGIN;
    }
    
//    @Override
//    public Response execute() throws OHException {
//        DatabaseService ds = new DatabaseService();
//        player = ds.loginPlayer(nickname, password);
//        Response response = new Response(player);
//        
//        return response;
//    }
    
}
