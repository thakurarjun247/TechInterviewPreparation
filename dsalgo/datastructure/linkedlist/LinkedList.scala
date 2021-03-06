package dsalgo.datastructure.linkedlist
import scala.collection.mutable
import scala.io.StdIn.readInt
 class Node(var key: Int, var next: Node = null) {
  def nextNode = if (next == null) "null" else next.key.toString
  override def toString = s"$key ->($nextNode)"
}
object LinkedList {
  def main(args: Array[String]): Unit = {
   /* val headStart = createLLFromArray()
    traverseNew(headStart)*/
    //createUsingUserInput()
    createUsingGivenArray(1 to 10 toArray)
    traverse(start)
    // println("start is " + start.key)
    // traverseNew(start.next)
    // reverse(start)
    //reverseNew(start)
    /* println("what index to delete?")
    val deleteAt=readInt()
    val index=delete(start, deleteAt)
    println(s"found at ${index.getOrElse("not found")}")*/
    //traverse(start)
  }
  val set = mutable.Set[Int]()
  var start = new Node(0)
  def createUsingUserInput() = {
    print("enter length of LL: ")
    val len = readInt
    (1 to len) foreach (item => {
      println("enter node key: ")
      insert(readInt)
    })
  }
  def createUsingGivenArray(a: Array[Int]) = {
    a.foreach(insert)
  }
  def reverse(node: Node): Node = {
    println("reversing...")
    if (node == null) return node
    var cur = node
    var next: Node = null
    var pre: Node = null
    while (cur.next != null) {
      next = cur.next
      cur.next = pre
      pre = cur
      cur = next
    }
    cur.next = pre
    traverseNew(cur)
    cur
  }
  def reverseNew(startNode: Node): Node = {
    println("currently it's => " + traverseNew(startNode.next))
    if (startNode == null) return startNode
    else {
      //temp head variable as the startNode is immutable
      var head = startNode
      var prev: Node = null
      var curr: Node = null
      var next: Node = null
      while (head != null) {
        next = head.next
        curr = head
        head.next = prev
        prev = curr
        head = next
      }
      println("after reversing =>" + traverseNew(curr))
      curr
    }
  }
  def traverse(start: Node) = {
    var temp = start
    while (temp.next != null) {
      print(s" ${temp.next.key} ->")
      temp = temp.next
    }
  }
  def insert(key: Int) = {
    var temp = start
    while (temp.next != null)
      temp = temp.next
    val newNode = new Node(key)
    temp.next = newNode

    //or
    //temp.next=new Node(key)
  }
  def delete(start: Node, key: Int): Option[Int] = {
    var i = 0
    while (start.next != null || start.next.key != key) {
      if (start.next.key == key) return Some(i)
      else i += 1
    }
    traverse(start)
    None
  }
  def traverseNew(node: Node): Unit = {
    if (node != null) {
      print(node.key + " ")
      traverseNew(node.next)
    }
  }
  def mergeSortedLL(x: Node, y: Node, z: Node): Node = {
    // var z:Node=null
    if (x == null) y
    else if (y == null) x
    else {
      //if(x.key>y.key)
      null
    }
  }
  /*def createLLFromArray(a: Array[Int] = 1 to 10 toArray): Node = {
    require(a.size > 0)
     var temp:Node=null

    var h = new Node(0,temp)

    for (i <- a.indices) {
     var temp = new Node(a(i))
     temp=temp.next
    }
    h
  }*/
  def reverseLLinGroupOfGivenSize(start: Node, n: Int) = {

  }
}


