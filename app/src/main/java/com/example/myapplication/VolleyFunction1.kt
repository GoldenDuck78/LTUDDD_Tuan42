package com.example.myapplication

import android.content.Context
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import java.lang.Exception

class VolleyFunction1 : AppCompatActivity() {
    var strJSON = ""
    fun getAllData(context: Context, textView: TextView) {
        val queue = Volley.newRequestQueue(context)
        val url = "https://hungnttg.github.io/array_json_new.json"

        val request = JsonArrayRequest(url,{response->
            for (i in 0 until response.length()) {
                try {
                    val person = response.getJSONObject(i)
                    val id = person.getString("id")
                    val name = person.getString("name")
                    val email = person.getString("email")
                    strJSON += "Id :$id\n"
                    strJSON += "Name: $name\n"
                    strJSON += "Email: $email\n"
                }
                catch (e:Exception) {
                    e.printStackTrace()
                }
            }
            textView.text = strJSON
        },{error -> textView.text= error.message})
        queue.add(request)
    }
}