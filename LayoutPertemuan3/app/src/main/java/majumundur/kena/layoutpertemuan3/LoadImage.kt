package majumundur.kena.layoutpertemuan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

@GlideModule
class AppGlideModule : AppGlideModule()

class LoadImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_image)
        val btnPage1 = findViewById<Button>(R.id.btnPage1)
        btnPage1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java).apply{}
            startActivity(intent)
        }

        val ImageAvatar = findViewById<ImageView>(R.id.imgAvatar)

        val urlImagenya = "https://assets-eu-01.kc-usercontent.com/1293c890-579f-01b7-8480-902cca7de55e/b1ac1760-542b-411f-b1d5-9c60e098ab04/Comunicato-Ufficiale-19-20-WebHP.png?w=2560&auto=format"
        if (urlImagenya !== null) {
            Glide.with(this)
                .load(urlImagenya)
                //.override(300, 300)
                .into(ImageAvatar)
        } else {
            ImageAvatar.setImageResource(R.drawable.ic_launcher_background)
        }

    }
}