object HelloWorld {
   def main(args: Array[String]) {
   stringBuilder("Ala ma kota", "x")
   }
   
   def stringBuilder(text : String, character : String){
      val splitetText = text.split(" ")
     println(border(splitetText.maxBy(_.length).length + 4, character))
       
       
      splitetText.zipWithIndex.map { case (x, ind) =>
      if(ind == 0) {
          print(character)
          print(border(splitetText.maxBy(_.length).length + 2," "))
          println(character)
      }
        
      println(
          border(1, character) 
            + " " + x 
            + border(splitetText.maxBy(_.length).length-x.length, " ")
            + " "
            + border(1, character))
          
     if(ind == splitetText.length - 1) {
          print(character)
          print(border(splitetText.maxBy(_.length).length + 2," "))
          println(character)
      }      
          
      }

    println(border(splitetText.maxBy(_.length).length + 4, character))

   }
   
   def border(number:Int, character: String): String = {
      character * number
   }
   
}
