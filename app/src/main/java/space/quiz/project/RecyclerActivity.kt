package space.quiz.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView
    private val studentsList = createList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        rv = findViewById(R.id.recycler_rv)


//        var adapter = StudentAdapter(studentsList)
//        rv.layoutManager = LinearLayoutManager(this)
//        rv.adapter = adapter
//        Log.d("Hellow",studentsList.toString())

        val linearLayoutManager = LinearLayoutManager(this)
        rv.layoutManager = linearLayoutManager
        val adapter = MyAdapter(studentsList, object : MyOnClickListener{
            override fun onClicked(student: Student) {
                Log.d("RecyclerActivity", "tag = " + student.name)
                val intent = Intent(this@RecyclerActivity, StudentInfoActivity::class.java)
                intent.putExtra("position", studentsList.indexOf(student))
                startActivity(intent)
            }

        })
        rv.adapter = adapter
    }


    fun createList(): List<Student>{
        var studentsList = ArrayList<Student>()
        studentsList.add(Student("Новгородов Афоня", "89142368054"))
        studentsList.add(Student("dfgfdg", "13"))
        studentsList.add(Student("dfgdg", "546"))
        studentsList.add(Student("dfgdgf", "656+5"))

        return studentsList
    }


}