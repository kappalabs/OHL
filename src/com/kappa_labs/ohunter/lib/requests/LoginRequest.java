package com.kappa_labs.ohunter.lib.requests;

/**
 * Request to login a player into the application.
 */
public class LoginRequest extends Request {

    /**
     * The nickname of the player.
     */
    protected String nickname;
    /**
     * The password of the player.
     */
    protected String password;

    
    /**
     * Creates a new request for comparsion between given photos.
     *
     * @param nickname The nickname of the player.
     * @param password The password hash.
     */
    public LoginRequest(String nickname, String password) {
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
    public <R extends LoginRequest> LoginRequest(R request) {
        super(request);

        nickname = request.nickname;
        password = request.password;
    }

    /**
     * Gets the nickname of the player.
     * 
     * @return The nickname of the player.
     */
    public String getNickname() {
        return nickname;
    }

}
