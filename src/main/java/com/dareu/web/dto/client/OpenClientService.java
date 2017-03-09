package com.dareu.web.dto.client;

import com.dareu.web.dto.request.ContactRequest;
import com.dareu.web.dto.request.SigninRequest;
import com.dareu.web.dto.request.SignupRequest;
import com.dareu.web.dto.response.AuthenticationResponse;
import com.dareu.web.dto.response.EntityRegistrationResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by jose.rubalcaba on 03/03/2017.
 */

public interface OpenClientService {

    /**
     * Creates a sign in request
     * @param request
     * @return
     */
    @POST("security/authenticate")
    Call<AuthenticationResponse> signin(@Body SigninRequest request);

    /**
     * creates a sign up request
     * @param request
     * @return
     */
    @POST("open/registerUser")
    Call<AuthenticationResponse> signup(@Body SignupRequest request);


    @POST("open/contact")
    Call<EntityRegistrationResponse> contactMessage(@Body ContactRequest request);

}
