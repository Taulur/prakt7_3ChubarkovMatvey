import kotlin.math.sqrt
import  kotlin.math.max
import  kotlin.math.min
fun main(){

    // 3.9

//    var a:Double
//    var b:Double
//    try {
//        do {
//            println("Введите длину прямоугольника")
//            a = readLine()!!.toDouble()
//            println("Введите ширину прямоугольника")
//            b = readLine()!!.toDouble()
//        } while (a <= 0 || b <= 0)
//       var p = 2 * (a + b)
//        var s = a * b;
//        var c = sqrt(a*a + b*b)
//        println("Периметр ${p}, площадь ${s}, диагональ ${c}")
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

    // 3.19

//    val density = 7.9
//    val molarMass = 56
//    val na = 6.02e23
//    var v:Double;
//    try {
//        do {
//            println("Введите объем железа")
//            v = readLine()!!.toDouble()
//        } while (v <= 0)
//        val mass = density * v
//        val moles = mass / molarMass
//        val atoms = moles * na
//        println(atoms)
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

    // 3.23

//        var r:Double
//    try {
//        do {
//            println("Введите радиус окружности")
//            r = readLine()!!.toDouble()
//        } while (r <= 0)
//       val lenght = 2 * Math.PI * r
//        var p = lenght * 4
//        println("Длина окружности - ${lenght}, периметр описанного квадрата ${p}")
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

// 3.2.9

//    try {
//            println("Введите k")
//            val k = readLine()!!.toDouble()
//        println("Введите l")
//        val l = readLine()!!.toDouble()
//        println("Введите n")
//        val n = readLine()!!.toDouble()
//        println("Введите m")
//        val m = readLine()!!.toDouble()
//        when
//        {
//            (l % k == 0.0) && (n % k == 0.0) && (m % k == 0.0) -> println("${k} является делителем всех чисел")
//            else -> println("Не является делителем всех чисел")
//        }
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

    // 3.2.19

//    try {
//            println("Введите x1")
//            var x1 = readLine()!!.toInt()
//            println("Введите x2")
//            var x2 = readLine()!!.toInt()
//            println("Введите x3")
//            var x3 = readLine()!!.toInt()
//            println("Введите x4")
//            var x4 = readLine()!!.toInt()
//            println("Введите y1")
//            var y1 = readLine()!!.toInt()
//            println("Введите y2")
//            var y2 = readLine()!!.toInt()
//            println("Введите y3")
//            var y3 = readLine()!!.toInt()
//            println("Введите y4")
//            var y4 = readLine()!!.toInt()
//        val left = max(x1,x3)
//        val top = min(y2,y4)
//        val right = min(x2,x4)
//        val bottom = max(y1,y3)
//        val width = right - left
//        val height = top - bottom
//        if (width < 0 || height < 0)
//        {
//            println("Не пересекаются")
//        }
//        else
//        {
//            println("Пересекаются : ${width * height}")
//        }
//    }
//    catch (e:Exception)
//    {
//        println("Введенное число неверно")
//    }

}