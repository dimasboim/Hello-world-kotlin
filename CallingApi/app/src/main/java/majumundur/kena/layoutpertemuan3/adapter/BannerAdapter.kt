package majumundur.kena.layoutpertemuan3.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import majumundur.kena.layoutpertemuan3.R
import majumundur.kena.layoutpertemuan3.data.ResultBannerTopItem

class BannerAdapter(val data: List<ResultBannerTopItem >?,val  context : Context) : RecyclerView.Adapter<BannerAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itembanner, parent, false)
        return MyHolder(v,context)
    }
    override fun getItemCount(): Int = data?.size ?: 0
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data?.get(position))
    }

    class MyHolder(itemView: View,val context: Context) : RecyclerView.ViewHolder(itemView) {
        fun bind(get: ResultBannerTopItem?) {
            val bannerIDtxt = itemView.findViewById<TextView>(R.id.bannerID)
            bannerIDtxt.text = get?.bannerID

            val bannerNametxt = itemView.findViewById<TextView>(R.id.bannerName)
            bannerNametxt.text = get?.bannerName

            val imgBanner = itemView.findViewById<ImageView>(R.id.imgBanner)
            val urlImagenya = get?.bannerImageURL
                if (urlImagenya !== null) {
                Glide.with(context)
                    .load(urlImagenya)
                    //.override(300, 300)
                    .into(imgBanner)
            } else {
                imgBanner.setImageResource(R.drawable.ic_launcher_background)
            }
        }
    }


}