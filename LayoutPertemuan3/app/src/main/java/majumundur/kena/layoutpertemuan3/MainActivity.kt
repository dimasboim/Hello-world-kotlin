package majumundur.kena.layoutpertemuan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPage2 = findViewById<Button>(R.id.btnPage2)
        btnPage2.setOnClickListener {
            val intent = Intent(this,LoadImage::class.java).apply{}
            startActivity(intent)
        }
    }
}