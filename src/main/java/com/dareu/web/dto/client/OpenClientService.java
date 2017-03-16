package com.dareu.web.dto.client;

import com.dareu.web.dto.request.ContactRequest;
import com.dareu.web.dto.request.GoogleSignupRequest;
import com.dareu.web.dto.request.SigninRequest;
import com.dareu.web.dto.request.SignupRequest;
import com.dareu.web.dto.response.AuthenticationResponse;
import com.dareu.web.dto.response.EntityRegistrationResponse;
import com.dareu.web.dto.response.ResourceAvailableResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

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


    /**
     * Creates a contact message
     * @param request
     * @return
     */
    @POST("open/contact")
    Call<EntityRegistrationResponse> contactMessage(@Body ContactRequest request);

    /**
     * Creates a signup request using a google account
     * @param request
     * @return
     */
    @POST("open/registerUserGoogle")
    Call<AuthenticationResponse> signupGoogle(@Body GoogleSignupRequest request);

    /**
     * Check if an email is available for registration
     * @param email
     * @return
     */
    @GET("open/emailAvailable/{email}")
    Call<ResourceAvailableResponse> isEmailAvailable(@Path("email") String email);

}
