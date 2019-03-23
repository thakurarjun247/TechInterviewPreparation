package collection

object SetDemo extends App{
        val set=Set(1,2,3,4,5)
        val set6=set+6
        println(s"set6 $set6")
        println(s"immutable set : $set")

        var mutableset=scala.collection.mutable.Set(1,2,3,4,5)
        //following won't work
        //mutableset+6
        mutableset+=7
        println(s"mutable set: $mutableset")
        }
