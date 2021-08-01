package com.example.calc

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
class result() {

}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)

        fun equalres() {

                try {
                    val ex = ExpressionBuilder(math_ex.text.toString()).build()
                    val res = ex.evaluate()
                    result.text = res.toString()
                } catch (e: Exception) {
                    Log.d("Fatal error", " ${e.message}")
                }

            }

        //detector
        nlog.setOnClickListener{dialwin("log")
            equalres()}
        a.setOnClickListener{dialwin("a")
            equalres()}
        exp.setOnClickListener{dialwin("e")
            equalres()}
        point.setOnClickListener{dialwin(".")
            equalres()}
        b0.setOnClickListener{dialwin("0")
            equalres()}
        b1.setOnClickListener{dialwin("1")
            equalres()}
        b2.setOnClickListener{dialwin("2")
            equalres()}
        b3.setOnClickListener{dialwin("3")
            equalres()}
        b4.setOnClickListener{dialwin("4")
            equalres()}
        b5.setOnClickListener{dialwin("5")
            equalres()}
        b6.setOnClickListener{dialwin("6")
            equalres()}
        b7.setOnClickListener{dialwin("7")
            equalres()}
        b8.setOnClickListener{dialwin("8")
            equalres()}
        b9.setOnClickListener{dialwin("9")
            equalres()}
        bper.setOnClickListener{dialwin("*")
            equalres()}
        bdel.setOnClickListener{dialwin("/")
            equalres()}
        percent.setOnClickListener{dialwin("/100")
            equalres()}
        plus.setOnClickListener{dialwin("+")
            equalres()}
        min.setOnClickListener{dialwin("-")
            equalres()}
        tg.setOnClickListener{dialwin("tan(")
            equalres()}
        ctg.setOnClickListener{dialwin("cotan(")
            equalres()}
        sin.setOnClickListener{dialwin("sin(")
            equalres()}
        cos.setOnClickListener{dialwin("cos(")
            equalres()}
        x2.setOnClickListener{dialwin("^2")
            equalres()}
        lbraclet.setOnClickListener{dialwin("(")
            equalres()}
        rbraclet.setOnClickListener{dialwin(")")
            equalres()}
        log2.setOnClickListener{dialwin("log2(")
            equalres()}
        log10.setOnClickListener{
            dialwin("log10(")
            equalres()
        }
        equal.setOnClickListener{

            equalres()
        }

        //clean button
        c.setOnClickListener {
            math_ex.text = ""
            result.text=""
        }

        //result



        erase.setOnClickListener{
            val str = math_ex.text.toString()
            if(str.isNotEmpty()) {
                math_ex.text= str.substring(0, str.length - 1)
            }
        }

    }




    fun dialwin(str: String) {
        math_ex.append(str)

    }
}
