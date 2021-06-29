package space.quiz.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        btn1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        })

        btn2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, PageViewActivity::class.java)
            startActivity(intent)
        })

        btn3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InputActivity::class.java)
            startActivity(intent)
        })


    }

    fun init(){
        btn1 = findViewById(R.id.main_btn_1)
        btn2 = findViewById(R.id.main_btn_2)
        btn3 = findViewById(R.id.main_btn_3)
    }
}