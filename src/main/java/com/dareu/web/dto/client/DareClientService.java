package com.dareu.web.dto.client;

import com.dareu.web.dto.request.ClapRequest;
import com.dareu.web.dto.request.CreateDareRequest;
import com.dareu.web.dto.request.DareConfirmationRequest;
import com.dareu.web.dto.request.FlagDareRequest;
import com.dareu.web.dto.request.NewCommentRequest;
import com.dareu.web.dto.response.EntityRegistrationResponse;
import com.dareu.web.dto.response.UpdatedEntityResponse;
import com.dareu.web.dto.response.entity.*;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by jose.rubalcaba on 03/03/2017.
 */

public interface DareClientService {

    /**
     * Get the currently active dare
     *
     * @param token
     * @return
     */
    @GET("dare/active")
    Call<ActiveDare> getActiveDare(@Header(value = "Authorization") String token);


    /**
     * Get a page of categories
     * @param pageNumber
     * @param token
     * @return
     */
    @GET("dare/category")
    Call<Page<CategoryDescription>> getCategories(
                                @Query(value = "pageNumber")int pageNumber,
                                @Header(value = "Authorization") String token);

    /**
     * Get channel content
     * @param pageNumber
     * @param token
     * @return
     */
    @GET("dare/response/channel")
    Call<Page<DareResponseDescription>> channel(@Query(value = "pageNumber")int pageNumber,
                                                @Header(value = "Authorization")String token);

    /**
     * Creates a new dare
     * @param request
     * @param token
     * @return
     */
    @POST("dare/create/")
    Call<EntityRegistrationResponse> createDare(@Body CreateDareRequest request,
                                                @Header(value = "Authorization")String token);


    /**
     * Get a dare description
     * @param dareId
     * @param token
     * @return
     */
    @GET("dare/find")
    Call<DareDescription> dareDescription(@Query(value = "dareId") String dareId,
                                          @Header(value = "Authorization")String token);

    /**
     * Notifies a dare expiration
     * @param dareId
     * @param token
     * @return
     */
    @POST("dare/expired")
    Call<UpdatedEntityResponse> setDareExpiration(@Query(value = "dareId") String dareId,
                                                  @Header(value = "Authorization")String token);

    /**
     * Flag a dare
     * @param request
     * @param token
     * @return
     */
    @POST("dare/flag")
    Call<EntityRegistrationResponse> flagDare(@Body FlagDareRequest request,
                                              @Header(value = "Authorization")String token);

    /**
     * Confirms a dare
     * @param request
     * @param token
     * @return
     */
    @POST("dare/confirm")
    Call<UpdatedEntityResponse> confirmDare(@Body DareConfirmationRequest request,
                                            @Header(value = "Authorization")String token);

    /**
     * Get the last unaccepted dare
     * @param token
     * @return
     */
    @GET("dare/unaccepted")
    Call<UnacceptedDare> unacceptedDare(@Header(value = "Authorization")String token);

    /**
     * Upload a new dare response
     * @param file
     * @param thumb
     * @param dareId
     * @param comment
     * @param token
     * @return
     */
    @Multipart
    @POST("dare/response/create")
    Call<EntityRegistrationResponse> uploadDareResponse(
                                                @Part(value = "file") RequestBody file,
                                                @Part(value = "thumb") RequestBody thumb,
                                                @Part(value = "dareId") RequestBody dareId,
                                                @Part(value = "comment") RequestBody comment,
                                                @Header(value = "Authorization")String token);


    /**
     * Get a dare response description
     * @param id
     * @param token
     * @return
     */
    @GET("dare/response/find")
    Call<DareResponseDescription> findDareResponseDescription(@Query(value = "id")String id,
                                                              @Header(value = "Authorization") String token);
    
    /**
     * Discover dares
     * @param pageNumber
     * @param token
     * @return 
     */
    @GET("dare/discover")
    Call<Page<DareDescription>> discoverDares(@Query(value = "pageNumber")int pageNumber, 
                                        @Header(value = "Authorization")String token);
    
    
    /**
     * Creates a new comment on a response
     * @param request
     * @param token
     * @return 
     */
    @POST("dare/response/comment/create")
    Call<EntityRegistrationResponse> createResponseComment(@Body NewCommentRequest request, 
                                                           @Header(value = "Authorization")String token);
    
    /**
     * Get a response page comments using a page number
     * @param pageNumber
     * @param responseId
     * @param token
     * @return 
     */
    @GET("dare/response/comment/")
    Call<Page<CommentDescription>> getResponseComments(@Query(value = "pageNumber")int pageNumber, 
                                                       @Query(value = "responseId")String responseId, 
                                                       @Header(value = "Authorization")String token);
    
    @GET("dare/response/comment/find")
    Call<CommentDescription> findCommentDescription(@Query(value = "commentId")String commentId, 
                                                    @Header(value = "Authorization")String token); 
    
    /**
     * Claps a response 
     * @param request
     * @param token
     * @return 
     */
    @POST("dare/response/clap")
    Call<UpdatedEntityResponse> clapResponse(@Body ClapRequest request, 
                                             @Header(value = "Authorization")String token); 
    
    /**
     * Increments a response view count
     * @param responseId
     * @param token
     * @return 
     */
    @POST("dare/response/view")
    Call<UpdatedEntityResponse> viewedResponse(@Query(value = "responseId")String responseId, 
                                               @Header("Authorization")String token); 
    
    /**
     * Get a Page of DareResponseDescriptions from a given user using authentication token
     * @param pageNumber
     * @param token
     * @return 
     */
    @GET("dare/response/")
    Call<Page<DareResponseDescription>> findUserResponses(@Query(value = "pageNumber")int pageNumber, 
                                                          @Header(value = "Authorization")String token);


    /**
     * Anchor a dare response
     * @param responseId
     * @param token
     * @return
     */
    @POST("dare/response/anchor/create")
    Call<EntityRegistrationResponse> anchorContent(@Query(value = "responseId") String responseId,
                                                   @Header(value = "Authorization") String token);

    /**
     * Un pin an anchored response
     * @param responseId
     * @param token
     * @return
     */
    @POST("dare/response/anchor/unpin")
    Call<EntityRegistrationResponse> unpinAnchorContent(@Query(value = "anchorContentId") String responseId,
                                                   @Header(value = "Authorization") String token);

    /**
     * Get a page of a user anchored content
     * @param pageNumber
     * @param token
     * @return
     */
    @GET("dare/response/anchor")
    Call<Page<AnchoredDescription>> getAnchoredContent(@Query(value = "pageNumber")int pageNumber,
                                                       @Header(value = "Authorization") String token);

    /**
     * Clap a response comment
     * @param commentId
     * @return
     */
    @POST("dare/response/comment/clap")
    Call<EntityRegistrationResponse> clapResponseComment(@Query(value = "commentId")String commentId,
                                                         @Header(value = "Authorization") String token);
}
