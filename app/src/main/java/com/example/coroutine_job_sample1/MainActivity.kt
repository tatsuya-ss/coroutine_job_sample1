package com.example.coroutine_job_sample1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalTime
import kotlin.coroutines.coroutineContext

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runBlocking {
                val job1 = launch {
                    delay(1000)
                    Log.d("Tatsuya🐲", "job1: ${LocalTime.now()}")
                    val job2 = launch {
                        delay(2000)
                        Log.d("Tatsuya🐲", "job2: ${LocalTime.now()}")
                    }
                    val job3 = launch {
                        delay(3000)
                        Log.d("Tatsuya🐲", "job3: ${LocalTime.now()}")
                    }

                }
            delay(3500)
            job1.cancel()
        }

    }
}