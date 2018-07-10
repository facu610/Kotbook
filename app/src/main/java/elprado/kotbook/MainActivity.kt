package elprado.kotbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //niceToast("Hola Perrazo")
        //niceToast("Hola Perrazo", "MyTag")
        //niceToast("Hola Perrazo","MyTag", lenght = Toast.LENGTH_LONG)
        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
    }
    fun niceToast(message: String,
                  tag: String = MainActivity::class.java.simpleName,
                  lenght: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, "[$tag] $message", lenght).show()
    }
    fun toast(message: String,
                  lenght: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, message, lenght).show()
    }
}
