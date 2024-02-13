class kino {
    var film = "название фильма"
    var seans="сеанс"
    var stoit=0.0
    var zal=0
    var kolvoz=0
    fun Input(kina:kino){
            println("сколько вы хотите создать фильмов, залов и т.д?")
            var lag= readLine()!!.toInt()
        var i: Int
            for(i in 1..lag) {
        println("Введите название фильма")
        kina.film= readLine()!!.toString()

            do {
                println("Введите сеанс(утренний, дневной, вечерний, ночной")
                kina.seans = readLine()!!.toString()
            }while (!(seans=="утренний") && !(seans=="дневной") && !(seans=="вечерний") && !(seans=="ночной") )
            try {
            do {
                do {
                    println("Введите стоимость билета")
                    println("стоимость билета не выше 500 рублей")
                    kina.stoit = readLine()!!.toDouble()
                }while (stoit>500)
            }while (stoit<=0)
            } catch (e:Exception) {println("вы ввели не то")}
        try{
            do {
                do {
                    println("введите номер зала")
                    println("залов не больше 9")
                    kina.zal = readLine()!!.toInt()
                }while(zal>9)
            } while(zal<=0)
        } catch (e:Exception) {println("вы ввели не то")}
        try{
            do {
                do {
                    println("введите кол-во зрителей")
                    println("Зрителей не больше 35")
                    kina.kolvoz = readLine()!!.toInt()
                }while(kolvoz>35)
            }while (kolvoz<=0)

            println("готова")
        } catch (e:Exception) {println("вы ввели не то")}
        }
    }
    fun Output(kina:kino)
    {
        println("\nфильм-${kina.film} \nсеанс-${kina.seans} \nстоимость-${kina.stoit} \nзал-${kina.zal} \nкол-во зрителей-${kina.kolvoz}")
        println("итоговая сумма проданных билетов ${kolvoz*stoit}")
    }
fun skidka(fina:kino)
{
    println("Проверим имеется ли для вас скидка")
    do {
        println("Выберите кто вы(1-пенсионер, 2-студент, 3-ребёнок, 4-простой гражданин")
        var kto = readLine()!!.toInt()
        if(kto==1 || kto==2 || kto==3)
        {
            println("ваша стоимость за билет=${stoit*0.9}")
            println("итоговая сумма проданных билетов ${kolvoz*(stoit*0.9)}")
        }else (println("на вас скидка не распростроняется"))
    }while((!(kto==1) && !(kto==2) && !(kto==3) && !(kto==4)))

}
}