package com.roderiklight.ratatouillerecipebook

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment


class LoginFragment : Fragment() {

    private var users: List<User> = emptyList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val name = view.findViewById<EditText>(R.id.user)
        val password = view.findViewById<EditText>(R.id.password)
        val button = view.findViewById<Button>(R.id.submit)

        button.setOnClickListener {
            validUsers()
            if(name.text != null || password.text != null){
                val email = name.text.toString()
                val pass = password.text.toString()

                if (checkUsername(email, users) && checkPassword(pass, users)){
                    Toast.makeText(context, "Yeah that's how it goes", Toast.LENGTH_SHORT).show()
                    val i = Intent(activity, MainActivity::class.java)
                    startActivity(i)
                    activity?.finish()
                }else{
                    Toast.makeText(context, "LOUD INCORRECT BUZZER", Toast.LENGTH_SHORT).show()
                }
            }
            else
            {
                Toast.makeText(context, "You need to actually input stuff you know", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    private fun checkUsername(text: String, users: List<User>): Boolean{
        return users.any{user ->
            text == user.email
        }
    }

    private fun checkPassword(text: String, users: List<User>): Boolean{
        return users.any{user ->
            text == user.pass
        }
    }

    fun validUsers(){
        users = listOf(
            User(1, "Linguinni", "remmy"),
        )
    }
}
