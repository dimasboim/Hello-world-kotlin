package majumundur.kena.layoutpertemuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import majumundur.kena.layoutpertemuan3.adapter.BannerAdapter
import majumundur.kena.layoutpertemuan3.data.ResultBannerTopItem
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    //1. deklarasi adapter & recyclerview
    private lateinit var bannerAdapter: BannerAdapter
    lateinit var rvBanner:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //2. setup nilai awal recycler view
        rvBanner = findViewById<RecyclerView>(R.id.rvBanner)
        rvBanner.adapter=BannerAdapter(null,this)
         NetworkConfig().getService()
            .getBannerTop()
            .enqueue(object : retrofit2.Callback<List<ResultBannerTopItem>> {
                override fun onFailure(call: retrofit2.Call<List<ResultBannerTopItem>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
                }
                override fun onResponse(
                    call: retrofit2.Call<List<ResultBannerTopItem>>,
                    response: Response<List<ResultBannerTopItem>>
                ) {

                    //3. jika data ditemukan, maka masukan response ke dalam adapter
                      bannerAdapter = BannerAdapter(response.body(),this@MainActivity)
                      rvBanner.adapter = bannerAdapter
                    bannerAdapter.notifyDataSetChanged()


                   print(response.body().toString())
                }
            })

    }


}