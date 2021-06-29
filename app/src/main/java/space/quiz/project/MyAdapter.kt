package space.quiz.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import space.quiz.project.MyAdapter.MyViewHolder

class MyAdapter(private var studentsList: List<Student>, private val onClickListener: MyOnClickListener): RecyclerView.Adapter<MyViewHolder>() {

    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nameText: TextView = view.findViewById(R.id.recycler_student_name)
        val phoneText: TextView = view.findViewById(R.id.recycler_student_phone)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return studentsList.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var student = studentsList.get(position)
        holder.nameText?.text = student.name
        holder.phoneText?.text = student.phone
        holder.itemView.tag = student
        holder.itemView.setOnClickListener {
            onClickListener.onClicked(student)
        }
    }
}