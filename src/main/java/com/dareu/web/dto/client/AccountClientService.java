package com.dareu.web.dto.client;

import com.dareu.web.dto.request.ChangeEmailAddressRequest;
import com.dareu.web.dto.response.EntityRegistrationResponse;
import com.dareu.web.dto.response.UpdatedEntityResponse;
import com.dareu.web.dto.response.entity.AccountProfile;
import com.dareu.web.dto.response.entity.ConnectionDetails;
import com.dareu.web.dto.response.entity.DiscoverUserAccount;
import com.dareu.web.dto.response.entity.FriendSearchDescription;
import com.dareu.web.dto.response.entity.Page;
import com.dareu.web.dto.response.entity.PendingFriendshipRequests;
import com.dareu.web.dto.response.entity.UserDescription;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by jose.rubalcaba on 03/03/2017.
 */

public interface AccountClientService {

    /**
     * Get a current profile object
     * @param token
     * @return
     */
    @GET("account/me")
    Call<AccountProfile> accountProfile(@Header(value = "Authorization")String token);


    /**
     * Confirms a connection request
     * @param userId
     * @param accepted
     * @param token
     * @return
     */
    @POST("account/friendship/{userId}/update")
    Call<EntityRegistrationResponse> confirmConnectionRequest(@Path(value = "userId") String userId,
                                                              @Query(value = "accepted") boolean accepted,
                                                              @Header(value = "Authorization") String token);

    @GET("account/friendship/")
    Call<PendingFriendshipRequests> getConnectionRequests(@Query("pageNumber")int pageNumber, 
                                                        @Header(value = "Authorization")String token); 
    
    /**
     * Get connection details
     * @param id
     * @param token
     * @return
     */
    @GET("account/friendship/find")
    Call<ConnectionDetails> connectionDetails(@Query(value = "friendshipId")String id,
                                              @Header(value = "Authorization")String token);


    /**
     *  discover users
     * @param pageNumber
     * @return
     */
    @GET("account/discoverUsers")
    Call<Page<DiscoverUserAccount>> discoverUsers(@Query(value = "pageNumber") int pageNumber,
                                                  @Header(value = "Authorization")String token);

    @GET("account/friends/find")
    Call<Page<FriendSearchDescription>> findFriends(@Query(value = "q") String query, 
            @Query(value = "pageNumber") int pageNumber, @Header("Authorization")String token);

    /**
     * Requests a user connection
     * @param userId
     * @return
     */
    @POST("account/friendship/{userId}/create")
    Call<EntityRegistrationResponse> requestConnection(@Path(value = "userId")String userId,
                                                       @Header(value = "Authorization")String token);

    /**
     * Update a user image profile
     * @param image
     * @param token
     * @return
     */
    @Multipart
    @POST(value = "account/profile/image")
    Call<UpdatedEntityResponse> updateProfileImage(@Part(value = "image") RequestBody image,
                                                   @Header(value = "Authorization")String token);

    /**
     * updates a gcm reg id
     * @param regId
     * @param token
     * @return
     */
    @POST("account/updateGcmRegId")
    Call<UpdatedEntityResponse> updateFcmId(@Query(value = "regId")String regId,
                                            @Header(value = "Authorization")String token);
    
    @POST("account/changeEmailAddress")
    Call<UpdatedEntityResponse> updateEmailAddress(@Body ChangeEmailAddressRequest request, 
                                                   @Header(value = "Authorization")String token);
    
    
}
