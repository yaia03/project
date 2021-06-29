package space.quiz.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class InputActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)

        val txtOutput: TextView = findViewById(R.id.txt_output)
        val btn: Button = findViewById(R.id.btn_start)
        var txtInputName: TextInputLayout = findViewById(R.id.txt_input_layout1)
        var txtInputSurname: TextInputLayout = findViewById(R.id.txt_input_layout2)
        var txtInputPassword: TextInputLayout = findViewById(R.id.txt_input_layout_password)
        btn.setOnClickListener(View.OnClickListener {

            txtOutput.setText("Привет, ${txtInputName.editText?.text} ${txtInputSurname.editText?.text}, " +
                    "твой пароль - ${txtInputPassword.editText?.text}")
        })
    }
}