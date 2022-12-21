package llc.amplitudo.amplitudo_akademija

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import llc.amplitudo.amplitudo_akademija.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())
        /**
         * Changes color of status bar.
         */
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.purple)
        Timber.d("Activity is being created...")
    }

    override fun onStart() {
        super.onStart()
        binding.apply {
            getStartedButton.setOnClickListener {

            }
        }
        Timber.d("Activity is starting...")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("Activity is resuming...")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("Activity is being paused...")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("Activity is stopping...")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("Activity is restarting...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("Activity is being destroyed...")
    }
}

