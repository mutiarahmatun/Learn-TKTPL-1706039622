package id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld.fragments.FragmentDua
import id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld.fragments.FragmentSatu

class MainActivity : AppCompatActivity(), Communicator {

//    Create layout fragment satu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentSatu = FragmentSatu()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentSatu).commit()
    }

//    Method yang digunakan untuk mengirim data dari fragment 1 ke fragment 2
    override fun passingData(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("data", editTextInput)

        val trans = this.supportFragmentManager.beginTransaction()
        val fragmentDua = FragmentDua()
        fragmentDua.arguments = bundle

        trans.replace(R.id.fragment_container, fragmentDua)
        trans.commit()
    }
}