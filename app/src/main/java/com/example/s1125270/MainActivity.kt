package com.example.s1125270

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.s1125270.ui.theme.S1125270Theme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.platform.LocalContext
import android.app.Activity
import androidx.compose.ui.Alignment

import androidx.compose.material3.Button
import androidx.compose.foundation.Image
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Button
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1125270Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Birth(m = Modifier.padding(innerPadding),)
                      /*Greeting(name = "Android",  Modifier.background(Color(0xff95fe95)))*/


                }
            }
        }
    }


}


@Composable


fun Birth(m: Modifier) {
    var appear by remember { mutableStateOf(true) }
    val backgroundColor by animateColorAsState(
        if (appear) {
            Color.Transparent
        } else Color.Green,
        animationSpec = tween(2000, 500)
    )

    LazyColumn(Modifier.background(backgroundColor)) {
       item() {
           Modifier.background(Color(0xff95fe95))
       }

           item(){
              modifierLocalOf {  }
               Text(text = "2024期末上機考(資管二A黃歆芝)")

           }
           item(){

              Image(painter = painterResource(id=R.drawable.class_a),contentDescription = "Class_a")

              }
        item(){
            Text(text = "遊戲持續時間 0 秒")
        }
        item(){
            Text(text = "您的成績 0 分")
        }
           item(){
               Button(onClick = {})

                {
                   Text(text ="結束App" )
               }
           }

            }



}




































