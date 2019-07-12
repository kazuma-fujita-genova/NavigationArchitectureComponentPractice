package com.practice.zuma.navigationarchitecturecomponentpractice


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_top.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class TopFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_top, container, false)
        //ボタンクリック
        view.findViewById<Button>(R.id.loginButton).setOnClickListener {
            //SecondFragmentへの遷移開始
            Navigation.findNavController(it).navigate(R.id.loginFragment)
        }

        view.findViewById<Button>(R.id.registButton).setOnClickListener {
            //遷移開始
            Navigation.findNavController(it).navigate(R.id.registFragment)
        }
        return view

//        registButton.setOnClickListener{
//            Navigation.createNavigateOnClickListener(R.id.registFragment, null)
//        }

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_top, container, false)
    }


}
