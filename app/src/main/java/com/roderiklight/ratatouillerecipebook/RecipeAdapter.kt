package com.roderiklight.ratatouillerecipebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecipeAdapter(private var recipes: List<Recipe>): RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        val view = inflater.inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val country = recipes[position]
        holder.render(country)

        //aquí se aplica la lógica. ej: onClickListener
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.recipe_name)
        val description: TextView = view.findViewById(R.id.recipe_desc)
        val image: ImageView = view.findViewById(R.id.img)
        val checkbox: CheckBox = view.findViewById(R.id.favcheck)

        fun render(recipe: Recipe)
        {
            name.text = recipe.name
            description.text = recipe.desc
            Picasso.get().load(recipe.image).into(image)
            if (recipe.isfav == 1) {
                checkbox.isChecked = true
            }
        }
    }
}