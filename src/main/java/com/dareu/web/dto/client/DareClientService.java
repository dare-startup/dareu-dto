package com.dareu.web.dto.client;

import com.dareu.web.dto.request.CreateDareRequest;
import com.dareu.web.dto.request.DareConfirmationRequest;
import com.dareu.web.dto.request.FlagDareRequest;
import com.dareu.web.dto.request.NewCommentRequest;
import com.dareu.web.dto.response.EntityRegistrationResponse;
import com.dareu.web.dto.response.UpdatedEntityResponse;
import com.dareu.web.dto.response.entity.ActiveDare;
import com.dareu.web.dto.response.entity.CategoryDescription;
import com.dareu.web.dto.response.entity.CommentDescription;
import com.dareu.web.dto.response.entity.DareDescription;
import com.dareu.web.dto.response.entity.DareResponseDescription;
import com.dareu.web.dto.response.entity.Page;
import com.dareu.web.dto.response.entity.UnacceptedDare;

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
     * @return 
     */
    @GET("dare/response/comment/find")
    Call<Page<CommentDescription>> getResponseComments(@Query(value = "pageNumber")int pageNumber, 
                                                       @Query(value = "responseId")String responseId);
    
    
    
}
