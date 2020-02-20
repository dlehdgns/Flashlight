package com.example.flashlight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        flashSwitch.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked)
                startService(intentFor<TorchService>().setAction("on"))
            else
                startService(intentFor<TorchService>().setAction("off"))
        }
    }
}
