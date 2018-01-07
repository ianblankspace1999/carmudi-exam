package com.exam.ph.examination.restclient.restinterface;


import com.exam.ph.examination.models.carmudimodel.QueryResponse;


import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by IanBlanco on 10/04/2017.
 */

public interface TestInterface {

    @GET("api/cars/page:{page}/maxitems:10/")
    Observable<Response<QueryResponse>> getCars(@Path("page")int page);

    @GET("api/cars/page:{page}/maxitems:10/sort:{category}/")
    Observable<Response<QueryResponse>> getCarsCategorized(
            @Path("page")int page, @Path("category")String category);

}
