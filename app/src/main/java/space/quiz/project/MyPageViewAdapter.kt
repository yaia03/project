package space.quiz.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyPageViewAdapter(private var studentsList: List<Student>): RecyclerView.Adapter<MyPageViewAdapter.MyPageViewHolder>() {

    inner class MyPageViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nameText: TextView = view.findViewById(R.id.student_info_name)
        val phoneText: TextView = view.findViewById(R.id.student_info_phone)
    }

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): MyPageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.page_view2_layout, parent, false)
        return MyPageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return studentsList.size
    }


    override fun onBindViewHolder(holder: MyPageViewHolder, position: Int) {
        var student = studentsList.get(position)
        holder.nameText?.text = student.name
        holder.phoneText?.text = student.phone
    }


}