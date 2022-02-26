fun main() {
    var college = "akirachix"
    var cha1 = college[0]
    var cha2 = college[2]
    var cha3 = college[3]
    println(cha1.toString() + cha2 + cha3)
    var chukua = para("effence", "23")
    println(chukua)
    var takeString = "phelisa"
    println("the length of my name is " +takeString .length)
    var name="phelisia"
    if(name=="chiri")
        println("thats me")
    else{
        print("i dont know who that is")
    }

}

fun para(name:String,age:String):String{
    var take ="hi my name is $name $age"
    return take
}
