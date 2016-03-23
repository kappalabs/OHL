
package com.kappa_labs.ohunter.lib.requests;

/**
 * Request to register a new player.
 */
public class RegisterRequest extends Request {
    
    /**
     * The nickname of the new player.
     */
    protected String nickname;
    /**
     * The password of the new player.
     */
    protected String password;

    
    /**
     * Creates a new request to register a new player with given nickname
     * and password.
     * 
     * @param nickname The nickname of the new player.
     * @param password The password of the new player.
     */
    public RegisterRequest(String nickname, String password) {
        super();
        
        this.nickname = nickname;
        this.password = password;
    }
    
    /**
     * Create deep copy of the given request.
     * 
     * @param <R> Class extending this class.
     * @param request Request to be copied.
     */
    public <R extends RegisterRequest> RegisterRequest(R request) {
        super(request);
        
        nickname = request.nickname;
        password = request.password;
    }

    /**
     * Gets the nickname of the new player.
     * 
     * @return The nickname of the new player.
     */
    public String getNickname() {
        return nickname;
    }

}
