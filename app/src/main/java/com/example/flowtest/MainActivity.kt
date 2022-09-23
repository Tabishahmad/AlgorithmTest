package com.example.flowtest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.algorithm.databinding.ActivityMain2Binding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        GlobalScope.launch {
            val value : Flow<Int> = supplier()
            value.collect{
                Log.d("Collecter # 1 = ",it.toString())
            }
        }
        GlobalScope.launch {
            val value : Flow<Int> = supplier()
            delay(500)
            value.collect{
                Log.d("Collecter # 2 = ",it.toString())
            }
        }
    }
    fun supplier() : Flow<Int>{
        val mutualShareFlow = MutableStateFlow(0)
        GlobalScope.launch {
            val list = listOf(1, 2, 3, 4)
            list.forEach {
                delay(100)
                mutualShareFlow.emit(it)
                Log.d("Collecter Emitting = ",it.toString())
            }
        }
        return mutualShareFlow
    }
//    fun supplier() = flow<Int>{
//        val list = listOf(1,2,3,4,5,6,7,8)
//        list.forEach{
//            delay(100)
//            Log.d("Collecter Emitting = ",it.toString())
//            emit(it)
//        }
//    }

}