fun main(){
    try {
        var dogi = Dog()
        dogi.Input(dogi)
        dogi.Output(dogi)
    }catch (e:Exception) {println("вы ввели не то")}
}