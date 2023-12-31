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

    private fun initData() {

        recipes = listOf(
            Recipe(1, "https://media.discordapp.net/attachments/843932388542775418/1179993256822571018/ratatouilleplatillo.jpg?ex=657bcd5b&is=6569585b&hm=3765807f8efbfd726e57bf063b2f4f15923f81e593110e9a9881b7a5dad028b4&=&format=webp&width=1075&height=662", 1, "Ratatouille", "lorem", "lorem"),
            Recipe(2, "https://media.discordapp.net/attachments/843932388542775418/1179993256403144816/20210924031119-img_3364_900x.webp?ex=657bcd5b&is=6569585b&hm=01b55bb22966f00977abbe36b919349e9a594cd0ee9f6f969aad0a29783e7930&=&format=webp&width=993&height=662", 0, "Gusteau Style Sausages", "lorem", "lorem"),
            Recipe(3, "https://media.discordapp.net/attachments/843932388542775418/1179993256130531388/4lv6t50bhtg71.jpg", 1, "Lightingy", "lorem", "lorem")
        )
    }
}