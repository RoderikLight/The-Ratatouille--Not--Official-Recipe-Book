package com.roderiklight.ratatouillerecipebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    private var recipes: List<Recipe> = emptyList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        initData()
        val recyclerView =
            view.findViewById<RecyclerView>(
                R.id.recipeRecycler
            )
        val adapter = RecipeAdapter(recipes)
        //Lista anchura completa
        val layoutManager = LinearLayoutManager(container?.context)
        //Cuadricula 2X2
        //val gridLayoutManager = GridLayoutManager(container?.context, 2)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

        return view
    }

    fun initData() {

        recipes = listOf(
            Recipe(1, "https://tvazteca.brightspotcdn.com/11/04/203581ac4bc4a5e63e59591f4c87/ratatouille-platillo.jpg", 1, "Ratatouille", "lorem", "lorem"),
            Recipe(2, "https://www.psseasoning.com/cdn/shop/articles/20210924031119-img_3364_900x.jpg", 0, "Gusteau Style Sausages", "lorem", "lorem"),
            Recipe(3, "https://www.reddit.com/media?url=https%3A%2F%2Fi.redd.it%2F4lv6t50bhtg71.jpg", 1, "Lightingy", "lorem", "lorem")
        )
    }
}