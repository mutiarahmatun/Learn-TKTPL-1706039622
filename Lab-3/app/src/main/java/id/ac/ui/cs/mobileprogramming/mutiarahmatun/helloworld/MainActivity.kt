package id.ac.ui.cs.mobileprogramming.mutiarahmatun.helloworld

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    private var seconds = 0
    private var running = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runTimer()
        exitButton.setOnClickListener {
            super.onBackPressed()
        }
    }
    override fun onBackPressed() {
        Toast.makeText(
            this@MainActivity,
            "Click Exit to out from this app",
            Toast.LENGTH_LONG
        ).show()
    }
    private fun runTimer() {
        val timeView = findViewById(R.id.time_view) as TextView
        val handler = Handler()
        handler.post(object : Runnable {
            override fun run() {
                val hours = seconds / 3600
                val minutes = seconds % 3600 / 60
                val secs = seconds % 60
                val time: String = java.lang.String.format(
                    Locale.getDefault(),
                    "%d:%02d:%02d", hours, minutes, secs
                )
                timeView.text = time
                if (running) {
                    seconds++
                }
                handler.postDelayed(this, 1000)
            }
        })
    }

    //Start the stopwatch running when the Start button is clicked.
    fun onClickStart(view: View?) {
        running = true
    }

    //Stop the stopwatch running when the Stop button is clicked.
    fun onClickStop(view: View?) {
        running = false
    }

    //Reset the stopwatch when the Reset button is clicked.
    fun onClickReset(view: View?) {
        running = false
        seconds = 0
    }
}