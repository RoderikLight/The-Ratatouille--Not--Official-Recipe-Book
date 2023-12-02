package com.roderiklight.ratatouillerecipebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val recipes = view.findViewById<Button>(R.id.recipesbutton)
        val favorites = view.findViewById<Button>(R.id.favsbutton)
        val account = view.findViewById<Button>(R.id.account)
        val settings = view.findViewById<Button>(R.id.settings)
        val logout = view.findViewById<Button>(R.id.logout)
        val exit = view.findViewById<Button>(R.id.close)

        recipes.setOnClickListener {
            val controller : NavController =
                Navigation.findNavController(view)
            controller.navigate(
                R.id.action_firstFragment_to_listFragment)
        }
        favorites.setOnClickListener {
            val controller : NavController =
                Navigation.findNavController(view)
            controller.navigate(
                R.id.action_firstFragment_to_listFragment2)
        }
        account.setOnClickListener {
            val controller : NavController =
                Navigation.findNavController(view)
            controller.navigate(
                R.id.action_firstFragment_to_secondFragment)
        }



        return view
    }
}