import scala.collection.mutable.ArrayBuffer

trait Pet:
  val name: String 


class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet



object PetDriver {
  def main(args: Array[String]): Unit = {
    val animals = ArrayBuffer.empty[Pet]
    val dog = Dog("Harry")
    val cat = Cat("Sally")  

    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name)) 
  }
} 

