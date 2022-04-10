fun main() {
    // no.1
    getStrings(listOf("Gabriel","Shemy","Cassy","Nancy","Danny","Aisha","Ballery","Chiri","Obura","Adele"))
        averageHeight(listOf(20,10,13,8,25,16))
    // no 2
    println(averageHeight(listOf(21,20,30,30)))

        // no 3
    Person("Alicia", 30, 6.6, 70)
    var a = Person("Adriana", 22, 5.0, 60)
    var b = Person("Lencier", 16, 4.3, 45)
    var c = Person("Gabry", 12, 6.5, 70)
    var d = Person("Flavian", 20, 4.9, 40)
    var output = listOf(a, b, c, d)
    var sortedOutput = output.sortedByDescending { person -> person.age }
    println(sortedOutput)
    // no 4
      var l=Person("Asia",18,5.1,55)
      var z=Person("Bahamas",21,30.6,45)
      var view= listOf(l,z)
      println(view)

    // no 5
    var motokaa=Car("kdf 124v",90)
    var bus=Car("KDC 213B",60)
    var v8=Car("kdc 456c",70)

    var result= listOf(motokaa,bus,v8)
    println(total(result))
}
// no 1
fun getStrings(name:List<String>):List<String> {
    name.forEachIndexed { index, a ->
        if (index % 2==0)
            println(a)
    }
    return name
}
// no 2
fun averageHeight(height:List<Int>):String{
    var add = height.average()
    var total = height.sum()
      var output = "$add $total"
    return output
 }
// No.3
data class Person(var name:String,var age:Int,var height:Double,var weight:Int) {
    var person = mutableListOf<String>()
}
//  no 4

    fun group(name:List<String>):List<String>{
        return listOf()
    }

// no.5
    data class Car(var reg: String, var Milage: Int)
      fun total(car:List<Car>):Int{
          var result=0
          car.forEach{ moto-> moto.Milage
              result+=moto.Milage
          }
          return result/car.count()
      }



