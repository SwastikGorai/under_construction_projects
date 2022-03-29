package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }
    var op:Boolean=true
    var str:String=""
    var status:String="+"
    var tab_str:String=""
    var result:String=""
    var oper:String=""

    var ans:Float=0f

    fun calculations(view: View)
    {

        var p:Int=0
        var res: TextView
        res=findViewById(R.id.tab)
//        if(op==true)
//            res.setText("")
//        op=false

        var b:Button= view as Button
        var flag:Int=0
        oper=b.getText().toString()

        when (oper) {

                "=" -> {flag=1

                    when(status)
                    {
                        "+" -> {result=add(str)

                        }

                        "-" -> {result=sub(str)

                        }

                        "*" -> {result=mult(str)

                        }

                        "/" -> {result=div(str)

                        }
                    }

                    res.setText(result)
                    str = result
                    tab_str = ""
                    ans=0.0f
                   }

            "AC"->{
                res.setText("")
                str = ""
                tab_str = ""
                ans=0f
            }

            "+/-" -> {
                if(p==0)
                {str ="-" + str
                    status="-"
                p=1}
                else {str ="+" + str
                        status="+"}
            }

                "1" -> {str = str + oper
                        tab_str=tab_str+oper}
                "2" -> {str = str + oper
                    tab_str=tab_str+oper}
                "3" -> {str = str + oper
                    tab_str=tab_str+oper}
                "4" -> {str = str + oper
                    tab_str=tab_str+oper}
                "5" -> {str = str + oper
                    tab_str=tab_str+oper}
                "6" -> {str = str + oper
                    tab_str=tab_str+oper}
                "7" -> {str = str + oper
                    tab_str=tab_str+oper}
                "8" -> {str = str + oper
                    tab_str=tab_str+oper}
                "9" -> {str = str + oper
                    tab_str=tab_str+oper}
                "0" -> {str = str + oper
                    tab_str=tab_str+oper}

            "+" -> {

                when(status)
                {
                    "+" -> {result=add(str)

                    }

                    "-" -> {result=sub(str)

                    }

                    "*" -> {result=mult(str)

                    }

                    "/" -> {result=div(str)

                    }


                }
                status="+"
                tab_str=tab_str+oper}

            "-" -> {

                when(status)
                {
                    "+" -> {result=add(str)

                    }

                    "-" -> {result=sub(str)

                    }

                    "*" -> {result=mult(str)

                    }

                    "/" -> {result=div(str)

                    }


                }
                status="-"
                tab_str=tab_str+oper}

            "." -> {str = str + oper
                tab_str=tab_str+oper}

            "x" -> {

                when(status)
                {
                    "+" -> {result=add(str)

                    }

                    "-" -> {result=sub(str)

                    }

                    "*" -> {result=mult(str)

                    }

                    "/" -> {result=div(str)

                    }

                }
                status="*"
                tab_str=tab_str+oper}

            "/" -> {

                when(status)
                {
                    "+" -> {result=add(str)

                    }

                    "-" -> {result=sub(str)

                    }

                    "*" -> {result=mult(str)

                    }

                    "/" -> {result=div(str)

                    }

                }
                status="/"
                tab_str=tab_str+oper}

        }

        if(flag==0)
        res.setText(tab_str)



    }

    fun add(no: String):String
    {
    str=""
    val number_float = no?.toFloat()

    ans=ans+number_float
    var sum_s=ans.toString()
    return sum_s
    }

    fun sub(no: String):String
    {
        str=""
        val number_float = no?.toFloat()
        ans=ans-number_float
        var sub_s=ans.toString()
        return sub_s
    }

    fun mult(no: String):String
    {
        str=""
        val number_float = no?.toFloat()
        ans=ans*number_float
        var pro_s=ans.toString()
        return pro_s
    }


    fun div(no: String):String
    {
        str=""
        val number_float = no?.toFloat()
        try{
        ans=ans/number_float}
        catch(e: ArithmeticException){
            val toast = Toast.makeText(applicationContext, "Divide by zero not allowed", Toast.LENGTH_LONG)
            toast.show()

        }
        var div_s=ans.toString()
        return div_s
    }

}