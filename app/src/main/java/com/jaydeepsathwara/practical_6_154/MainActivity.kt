package com.jaydeepsathwara.practical_6_154

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.MediaController
import com.jaydeepsathwara.practical_6_154.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVideoPlayer()
    }
    private fun initVideoPlayer()
    {
        val mediaController = MediaController(this)
        val uri: Uri =Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        binding.myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(binding.myvideoview)
        binding.myvideoview.setVideoURI(uri)
        binding.myvideoview.requestFocus()
        binding.myvideoview.start()
    }
}