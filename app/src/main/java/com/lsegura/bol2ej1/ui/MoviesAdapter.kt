package com.lsegura.bol2ej1.ui;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lsegura.bol2ej1.R
import com.lsegura.bol2ej1.databinding.ViewMovieBinding
import com.lsegura.bol2ej1.model.Movie

class MoviesAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_movie, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = ViewMovieBinding.bind(view)

        fun bind(movie:Movie) {
            binding.title.text = movie.title

            Glide.with(binding.image)
                .load(movie.urlImagen)
                .into(binding.image)
        }
    }

}
