package com.lsttsl.scopedstoragetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lsttsl.scopedstoragetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding()
        setContentView(binding!!.root)

        binding!!.addBtn.setOnClickListener(View.OnClickListener {it->


        })

    }
}
