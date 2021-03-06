package com.dareu.web.dto.client;

import com.dareu.web.dto.request.ChangeEmailAddressRequest;
import com.dareu.web.dto.response.EntityRegistrationResponse;
import com.dareu.web.dto.response.UpdatedEntityResponse;
import com.dareu.web.dto.response.entity.AccountProfile;
import com.dareu.web.dto.response.entity.ConnectionDetails;
import com.dareu.web.dto.response.entity.ConnectionRequest;
import com.dareu.web.dto.response.entity.DiscoverUserAccount;
import com.dareu.web.dto.response.entity.FriendSearchDescription;
import com.dareu.web.dto.response.entity.Page;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
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
     * @param connectionId
     * @param accepted
     * @param token
     * @return
     */
    @POST("account/friendship/{connectionId}/update")
    Call<EntityRegistrationResponse> confirmConnectionRequest(@Path(value = "connectionId") String connectionId,
                                                              @Query(value = "accepted") boolean accepted,
                                                              @Header(value = "Authorization") String token);

    /**
     * Get a page of sent pending connection requests
     * @param pageNumber
     * @param token
     * @return
     */
    @GET("account/friendship/sent")
    Call<Page<ConnectionRequest>> getSentPendingRequests(@Query("pageNumber")int pageNumber, 
                                                        @Header(value = "Authorization")String token);

    /**
     * get a page of received pending connection requests
     * @param pageNumber
     * @param token
     * @return
     */
    @GET("account/friendship/received")
    Call<Page<ConnectionRequest>> getReceivedPendingRequests(@Query("pageNumber")int pageNumber, 
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

    /**
     * 
     * @param query
     * @param pageNumber
     * @param token
     * @return 
     */
    @GET("account/friendship/accepted/find")
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
    
    /**
     * 
     * @param request
     * @param token
     * @return 
     */
    @POST("account/changeEmailAddress")
    Call<UpdatedEntityResponse> updateEmailAddress(@Body ChangeEmailAddressRequest request, 
                                                   @Header(value = "Authorization")String token);
    
    
    /**
     * 
     * @param connId
     * @param token
     * @return 
     */
    @DELETE("account/friendship/")
    Call<UpdatedEntityResponse> cancelFriendshipRequest(@Query(value = "connectionId")String connId, 
                                    @Header(value = "Authorization")String token);

    @GET("account/profile/{userId}")
    Call<AccountProfile> getUserAccount(@Path(value = "userId") String userId,
                                        @Header(value = "Authorization") String token);
}
