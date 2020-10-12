package id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld.R
import kotlinx.android.synthetic.main.fragment_dua.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentDua.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentDua : Fragment() {
    // TODO: Rename and change types of parameters

    var displayData: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_dua, container, false)

        displayData = arguments?.getString("data")

        view.showData.text = displayData

        return view
    }
}