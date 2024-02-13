class Dog {
        var name = "Имя"
        var breed="Порода"
        var height=100.0
        var coatColor="Окрас шерсти"
        var weight=100.0
        var temperament="Характер"
        fun Input(doga:Dog){
                try {
                        println("Введите имя собаки")
                        doga.name = readLine()!!.toString()
                        println("Введите породу собаки")
                        doga.breed = readLine()!!.toString()
                        do {
                                println("Введите рост собаки")
                                doga.height = readLine()!!.toDouble()
                        }while (height<=0)
                        println("Введите окрас шерсти собаки")
                        doga.coatColor = readLine()!!.toString()
                        do {
                                println("Введите вес собаки")
                                doga.weight = readLine()!!.toDouble()
                        }while (weight<=0)
                        println("Введите характер собаки")
                        doga.temperament = readLine()!!.toString()
                } catch (e:Exception) {println("вы ввели не то")}
        }
        fun Output(doga:Dog)
        {
          println("\nимя-${doga.name} \nпорода-${doga.breed} \nрост-${doga.height} \nОкрас шерсти-${doga.coatColor} \nВес-${doga.weight} \nхарактер-${doga.temperament}")
        }
}
