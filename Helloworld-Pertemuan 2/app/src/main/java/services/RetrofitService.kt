package services

import majumundur.kena.helloworld.models.DataItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object RetrofitClient {

    fun getInstance(): Retrofit {
        var mHttpLoggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        var mOkHttpClient = OkHttpClient
            .Builder()
            .addInterceptor(mHttpLoggingInterceptor)
            .build()


        var retrofit: Retrofit = retrofit2.Retrofit.Builder()
            .baseUrl("http://10.2.2.0:5050/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(mOkHttpClient)
            .build()
        return retrofit
    }

}

object DataRepository  {
    // set interceptor
//    fun getInterceptor() : OkHttpClient {
//        val logging = HttpLoggingInterceptor()
//        logging.level = HttpLoggingInterceptor.Level.BODY
//        val okHttpClient = OkHttpClient.Builder()
//            .addInterceptor(logging)
//            .build()
//        return  okHttpClient
//    }
//    fun getRetrofit() : Retrofit {
//        return Retrofit.Builder()
//            .baseUrl("http://10.2.2.0:5050/api/")
//            .client(getInterceptor())
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//    fun getService() = getRetrofit().create(RetrofitService::class.java)

    fun create(): RetrofitService {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("hhttp://10.0.2.2:5050/api/")
            .build()
        return retrofit.create(RetrofitService::class.java)
    }
}
interface RetrofitService {
    @GET("movies/")
    fun getAllMovies(): Call<List<DataItem>>

}
interface ApiInterface {
    @GET("movies/")
    suspend fun getAllMovies(): Response<List<DataItem>>
}

