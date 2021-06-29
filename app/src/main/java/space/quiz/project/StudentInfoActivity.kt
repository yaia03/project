package space.quiz.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class StudentInfoActivity : AppCompatActivity() {

    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_info)
        viewPager2 = findViewById(R.id.vp2)
        viewPager2.adapter = MyPageViewAdapter(createList())

        viewPager2.currentItem = intent.getIntExtra("position", 0)

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