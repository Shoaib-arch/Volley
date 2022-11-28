package com.example.volley

import android.app.DownloadManager.Request
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv=findViewById<TextView>(R.id.tv)
        //1-creating the volley
        var queue=Volley.newRequestQueue(this)
        //2 creating the request
        val request=StringRequest(com.android.volley.Request.Method.GET,"https://www.tutorialspoint.com/json/data.json",Response.Listener {
         tv.text=it.toString()

        },Response.ErrorListener{


            tv.text=it.toString()

        })


        //putting in queue
        queue.add(request);
    }
}