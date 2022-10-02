package majumundur.kena.helloworld.sharedfun

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import majumundur.kena.helloworld.R

class SharingFungsi {
    public fun isiGambar(context:Context,txtHello: TextView, image1: ImageView){
        val tes = (1 until 6).random()
        txtHello.text = tes.toString()

        when (tes) {
            1 -> image1.setImageDrawable(context.getDrawable(R.drawable.superman1))
            2 -> image1.setImageDrawable(context.getDrawable(R.drawable.superman2))
            3 -> image1.setImageDrawable(context.getDrawable(R.drawable.superman3))
            4 -> image1.setImageDrawable(context.getDrawable(R.drawable.superman4))
            5 -> image1.setImageDrawable(context.getDrawable(R.drawable.superman5))
            else -> { // Note the block
                image1.setImageDrawable(context.getDrawable(R.drawable.superman6))
            }
        }
    }

}