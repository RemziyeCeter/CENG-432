//Remziye Ceter
//170201038
//Mutable List
class IyteMutableList {
  var head: Data = null
  var last: Data = null
  var size: Int = 0
 def add (x: Int): Unit= {
  if(head == null){
    head = new Data(x,null)
    last = head
    
    }
  else{
    var temp = new Data (x,null)
    last.setAfter(temp)
    last = temp
    
    }
  }
  def preappend (x: Int): Unit= {
  
  if(head == null){
    head = new Data (x,null)
    last = head
    }
  else{
    var new_head = new Data(x,null)
    new_head.setAfter(head)
    head = new_head
    } 
  }
  def toStringMethod(): Unit = {
    var instance = this.head
    while(instance!= null){
      print(instance.getValue + ",")
      instance = instance.getNextData
    }
  }
}
class Data (left : Int , right : Data){
  var value = left 
  var nextData = right
  def getValue(): Int = {
    value
  }
  def getNextData(): Data = {
    nextData
  }
  def set ( x: Data): Unit = {
    this.value = x.getValue()
    this.nextData = x.getNextData()
  }
  def setAfter ( x: Data): Unit = {
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
