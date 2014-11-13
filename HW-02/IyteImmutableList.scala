//Remziye Ceter
//170201038
//Immutable

class IyteImmutableList(val h:Node){
  var head: Node = h;
  var size: Int = 0
  
  def this(){
    this(null);
  }
 def add (x: Int): IyteImmutableList= {
    new IyteImmutableList(new Node(x,head));
  }

  def toStringMethod(): Unit = {
    var instance = this.head
    while(instance!= null){
      print(instance.getValue + ",")
      instance = instance.getNextData
    }
  }
}

class Node (left : Int , right : Node){
  var value = left 
  var nextData = right
  def getValue(): Int = {
    value
  }
  def getNextData(): Node = {
    nextData
  }
  def set ( x: Node): Unit = {
    this.value = x.getValue()
    this.nextData = x.getNextData()
  }
  def setAfter ( x: Node): Unit = {
    nextData = x  
  }
  def setValue ( x: Int): Unit = {
    value = x
  }
  def writeInclude () {
    println(value)
    println(nextData)
  }
 }
