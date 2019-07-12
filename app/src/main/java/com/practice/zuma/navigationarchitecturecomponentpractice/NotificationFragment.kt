package com.practice.zuma.navigationarchitecturecomponentpractice


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_notification.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class NotificationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("lifeCycle", "onViewCreated")

        val recyclerView = recycler_list
        val adapter = NotifyRecyclerAdapter(createDataList(), object : NotifyRecyclerAdapter.ListListener {
            override fun onClickRow(tappedView: View, rowModel: NotifyItemEntity) {
                this@NotificationFragment.onClickRow(tappedView, rowModel)
            }
        })

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter
    }

    private fun createDataList(): List<NotifyItemEntity> {

        val dataList = mutableListOf<NotifyItemEntity>()
        for (i in 0..49) {
            val data: NotifyItemEntity = NotifyItemEntity().also {
                it.title = "タイトル" + i + "だよ"
                it.body = "詳細" + i + "個目だよ"
                it.notifyDate = "日付" + i + "個目だよ"
            }
            dataList.add(data)
        }
        return dataList
    }


    fun onClickRow(tappedView: View, rowModel: NotifyItemEntity) {
        Snackbar.make(tappedView, "Replace with your own action tapped ${rowModel.title}", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()
    }
}
