object HelloWorld {
   def main(args: Array[String]) {
   stringBuilder("Ala ma kota", "x")
   }
   
   def stringBuilder(text : String, character : String){
       val splitetText = text.split(" ")
     println(border(splitetText.maxBy(_.length).length + 2, character))
       
       
      splitetText.map(x=>println(
          border(1, character) 
            + x 
            + border(splitetText.maxBy(_.length).length-x.length, " ")
            + border(1, character)))
    
    println(border(splitetText.maxBy(_.length).length + 2, character))

   }
   
   def border(number:Int, character: String): String = {
      character * number
   }
   
}
