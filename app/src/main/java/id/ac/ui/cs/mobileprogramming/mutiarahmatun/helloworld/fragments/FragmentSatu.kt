package id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld.Communicator
import id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld.R
import kotlinx.android.synthetic.main.fragment_satu.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentA.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSatu : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_satu, container, false)

        communicator = activity as Communicator

//        Mengirimkan data ketika button di klik
        view.sendingButton.setOnClickListener {
            communicator.passingData(view.dataInput.text.toString())
        }
        return view
    }
}
