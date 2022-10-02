package majumundur.kena.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import majumundur.kena.helloworld.adapter.MainAdapter
import majumundur.kena.helloworld.models.DataItem
import majumundur.kena.helloworld.models.Response
import retrofit2.Call
import services.ApiInterface
import services.DataRepository
import services.RetrofitClient
import services.RetrofitService
import javax.security.auth.callback.Callback
import kotlin.coroutines.CoroutineContext


class ListMovie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_movie)
        val rvUser: RecyclerView = findViewById(R.id.recyclerview)
         CoroutineScope(Dispatchers.IO).launch {
             getMovieList()
         }



        // get post data
//        val postServices = DataRepository.create()
//
//        postServices.getAllMovies().enqueue(object : Callback<List<DataItem>> {
//
//            override fun onResponse(call: Call<List<DataItem>>, response: Response<List<DataItem>>) {
//                if (response.isSuccessful) {
//                    val data = response.body()
//                    Log.d("tag", "responsennya ${data?.size}")
//
//                    data?.map {
//                       // Log.d("tag", "datanya ${it.body}")
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<List<DataItem>>, error: Throwable) {
//                Log.e("tag", "errornya ${error.message}")
//            }
//        })

    }

    suspend fun getMovieList() {
        var retrofit = RetrofitClient.getInstance()
        var apiInterface = retrofit.create(ApiInterface::class.java)

            try {
                val response = apiInterface.getAllMovies()
                if (response.isSuccessful()) {
                    //your code for handaling success response
                    Log.e("resp", response.toString())

                } else {
                    Toast.makeText(
                        this@ListMovie,
                        response.errorBody().toString(),
                        Toast.LENGTH_LONG
                    ).show()
                }
            } catch (Ex: Exception) {
                Log.e("Error", Ex.localizedMessage)

            }

    }
}
