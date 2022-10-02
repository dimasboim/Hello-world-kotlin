package majumundur.kena.layoutpertemuan3
import majumundur.kena.layoutpertemuan3.data.ResultBannerTopItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class NetworkConfig {
    // set interceptor
    fun getInterceptor() : OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return  okHttpClient
    }
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() = getRetrofit().create(BannerTop::class.java)
}
interface BannerTop {
    @GET("getBannerTop")
    fun getBannerTop(): Call<List<ResultBannerTopItem>>
}
interface productList {
    @GET("productList")
    fun getBannerTop(): Call<List<ResultBannerTopItem>>
}