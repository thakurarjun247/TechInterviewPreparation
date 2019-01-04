package functional.features

object HigherOrderFunctions extends App{
        val algo1:Int=>Int=(x:Int)=>x*2
        //type is optional above :Int=>Int
        //can use def as well
        def algo2=(x:Int)=>x*3
        val list=List(1,2,3,4)
        val calculateRank=(list:List[Int],fun:Int=>Int)=>list.map(fun)
        println(list)
        println(calculateRank(list,algo1))
        println(calculateRank(list,algo2))
        }
