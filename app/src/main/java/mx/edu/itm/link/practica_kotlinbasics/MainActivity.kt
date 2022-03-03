package mx.edu.itm.link.practica_kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val constante: String = "una constante"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a: Int = 1
        //a = 5
        /*
        comentario
        varias lineas
        */
        var b: Int = 2
        b = 3

        Log.i("Basics", "Valor de $b")
        Toast.makeText(this, "Valor de x = $b", Toast.LENGTH_LONG).show()
        Log.i("Basics", constante)
        Log.d("Basics", "d")
        Log.w("Bascis", "w")
        Log.e("Basics", "e")

        unSwitch()
        unIf(1)
        unosFor()
        unosWhile()
    }
    fun unSwitch(){
        val x = 1
        when (x) {
            1 -> Log.i("Basics", "Es un uno")
            2 -> {
                var algo = "lorem"
                var otro = "ipsum"
                Log.i("Basics", algo + otro)
            }
            else -> Log.i("Basics", "no coincidio")
        }
    }

    fun unIf(a: Int): Boolean{
        var array = arrayOf(1,2,3,4,5)
        if (a in array) //&& || != < > ==
            return true
        else
            return false
    }

    fun unosFor(){
        var array = arrayOf(1,2,3,5,8,10)
        //for (numero in array.indices){
        Log.i("Basics", "numero in array")
        for (numero in array){
            Log.i("Basics", numero.toString())
        }

        Log.i("Basics", "1..3 ")
        for (i in 1..3){
            Log.i("Basics", i.toString())
        }

        Log.i("Basics", "6 downTo 0 step 2")
        for (i in 6 downTo 0 step 3)
            Log.i("Basics", i.toString())
    }

    fun unosWhile(){
        var x = 0
        while (x < 5){
            Log.i("Basics", x.toString())
            x++
        }

        x = 0
        do {
            Log.i("Basics", x.toString())
            x++
        }while (x < 5)
    }
}