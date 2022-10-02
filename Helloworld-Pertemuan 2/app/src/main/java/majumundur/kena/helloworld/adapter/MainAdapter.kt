package majumundur.kena.helloworld.adapter

import android.content.Context
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
//import android.view.View
import kotlinx.android.synthetic.main.adapter_movie.view.*
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import majumundur.kena.helloworld.R
import majumundur.kena.helloworld.models.DataItem

//import kotlin.android.synthetic.main.adapter_movie.view.*
class MainAdapter(val data: List<DataItem>?) : RecyclerView.Adapter<MainAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.adapter_movie, parent, false)
        return MyHolder(v)
    }
    override fun getItemCount(): Int = data?.size ?: 0
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data?.get(position))
    }
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(get: DataItem?) {
            itemView.judul.text = get?.judul
            itemView.sutradara.text = get?.sutradara
            itemView.rating.text = get?.rating
            itemView.deskripsi.text = get?.deskripsi


        }
    }
}


