package com.roderiklight.ratatouillerecipebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso

class FavAdapter(private var recipess: List<Recipe>): RecyclerView.Adapter<FavAdapter.RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        val view = inflater.inflate(R.layout.item_recipe2, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val country = recipess[position]
        holder.render(country)

        //aquí se aplica la lógica. ej: onClickListener
    }

    override fun getItemCount(): Int {
        return recipess.size
    }

    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.recipe_name)
        val description: TextView = view.findViewById(R.id.recipe_desc)
        val image: ImageView = view.findViewById(R.id.img)
        val checkbox: CheckBox = view.findViewById(R.id.favcheck)

        fun render(recipe: Recipe)
        {
            if (recipe.isfav == 1){
                name.text = recipe.name
                description.text = recipe.desc
                Picasso.get().load(recipe.image).into(image)
                checkbox.isChecked
            }
            else{
                RecyclerView.GONE
            }
        }
    }
}