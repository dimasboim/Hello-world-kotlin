package majumundur.kena.kopitubruk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.io.Console

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello  = findViewById<Button>(R.id.btnHello) as Button
        println("test")
        val txtHello = findViewById<TextView>(R.id.txtHello) as TextView
        print("test")
        btnHello.setOnClickListener {
            txtHello.text =(resources.getString(R.string.hello))
            print("test")
        }
    }
}