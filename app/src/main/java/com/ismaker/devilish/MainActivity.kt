kotlin
package com.ismaker.devilish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Toast
import java.util.Locale

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            tts.language = Locale.US
        } else {
            Toast.makeText(this, "TTS Initialization failed!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun handleCommand(command: String) {
        when {
            command.contains("hello", true) -> speak("Hello, mortal. What wicked plans do you wish to concoct today?")
            command.contains("goodbye", true) -> speak("Farewell, until your dark desires summon me again.")
            command.contains("weather", true) -> speak("Today's forecast calls for brimstone and fire. Dress accordingly.")
            command.contains("joke", true) -> speak("Why don’t skeletons fight each other? They don’t have the guts.")
            command.contains("news", true) -> speak("Here’s the latest mischief: Scientists accidentally summon a demon during a quantum physics experiment.")
            else -> speak("I do not understand your command, mortal. Speak clearly or perish!")
        }
    }

    private fun speak(text: String) {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
    }

    override fun onDestroy() {
        if (tts != null) {
            tts.stop()
            tts.shutdown()
        }
        super.onDestroy()
    }
}
