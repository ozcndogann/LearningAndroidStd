package com.ozcan.learningproject

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.EnterExitState
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.isVisible
import com.ozcan.learningproject.databinding.ActivityMainBinding
import com.ozcan.learningproject.ui.theme.LearningProjectTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun Olustur(view: View){

        val isim = binding.isim.text
        val soyisim = binding.Soyisim.text
        val yas = binding.Yas.text

        if(isim.toString() == "" || soyisim.toString() == "" || yas.toString() == ""){
            binding.ozellikler.text = "Eksik bilgi girdiniz."
        }
        else if(!isim.all { it.isLetter() } || !soyisim.all { it.isLetter() }){
            binding.ozellikler.text = "İsim, soy isim kısmına alfabe dışında karakter kullanamazsınız"
        }
        else{
            binding.profilePicture.visibility = View.VISIBLE;
            binding.ozellikler.text = "Karakter Bilgileri\nİsim: ${isim}\n Soyisim: ${soyisim} \nYaş: ${yas} "
        }
    }
}
