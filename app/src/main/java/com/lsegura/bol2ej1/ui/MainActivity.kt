package com.lsegura.bol2ej1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lsegura.bol2ej1.databinding.ActivityMainBinding
import com.lsegura.bol2ej1.model.Movie
import com.lsegura.bol2ej1.ui.MoviesAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recycler.adapter = MoviesAdapter(movies)
        }
    }

    private val movies = (1..100).map {
        Movie(
            "Película $it",
            "https://picsum.photos/200/300?random=$it")
    }
}