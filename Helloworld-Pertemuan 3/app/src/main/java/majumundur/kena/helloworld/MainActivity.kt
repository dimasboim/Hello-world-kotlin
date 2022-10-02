package majumundur.kena.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
   lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)

        // membuat aksi ketika button di klik
        val btnG: Button = findViewById(R.id.buttonGanti)
        btnG.setOnClickListener { ubahTeks() }

    }



    //fungsi ketika tombol di klik akan di panggil fungsi ini
    private fun ubahTeks() {
            //messagebox simple untuk menampilkan teks
            Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

            //mengubah isi textbox
           // val txtHello: TextView = findViewById(R.id.txtHello)

        val randomInt=(1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)


    }
}