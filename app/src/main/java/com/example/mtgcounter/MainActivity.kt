package com.example.mtgcounter
//TOKEN
//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
//

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mtgcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onClick(v: View) {
        when(v.id){
            binding.btnUpScore1.id ->{
                scoreUp(v)
            }
            binding.btnUpScore2.id ->{
                binding.tvDisplayScore2.text = "dog"
            }
        }
    }


    fun scoreUp(view: View) {
//        var currentID = view.

        var score = binding.tvDisplayScore1.text.toString()
        binding.tvDisplayScore1.text = (score.toInt() + 1).toString()
    }
}