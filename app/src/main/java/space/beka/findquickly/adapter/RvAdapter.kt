package space.beka.findquickly.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.beka.findquickly.databinding.ScienceItemBinding
import space.beka.findquickly.models.ScienceModel
interface SciencesAdapterCallBack{
    fun onClick(items:ScienceModel)
}
class ScienceAdapter(var list: List<ScienceModel> , val callBack: SciencesAdapterCallBack) : RecyclerView.Adapter<ScienceAdapter.Vh>() {
    inner  class Vh(var scienceItemBinding: ScienceItemBinding):RecyclerView.ViewHolder(scienceItemBinding.root) {
        fun onBind(scienceModel: ScienceModel, position: Int) {
            scienceItemBinding.tvTitle.text = scienceModel.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ScienceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position] ,position)
        val item = list[position]
        holder.itemView.setOnClickListener {
            callBack.onClick(item)

        }
    }

    override fun getItemCount(): Int =list.size



}