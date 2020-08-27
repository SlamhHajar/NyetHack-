fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints :Int = 89;
    val isBlessed = true;
    /////////using when /////////////
    when(healthPoints){
        100 ->println(name + "is in excellent condition!")
        in 90..99 ->println(name + " has a few scratches.")
        in 75..89-> if (isBlessed) {
            println(name + " has some minor wounds but is healing quite quickly!")        }
        else {            println(name + " has some minor wounds.")        }
        in 15..74-> println(name + " looks pretty hurt.")
        else->{ println(name + " is in awful condition!")    }
    }
    ////////using nested if/////
    /* if (healthPoints == 100) {  println(name + "is in excellent condition!")    }
     else if (healthPoints in 90..99) { println(name + " has a few scratches.")    }
     else if (healthPoints in 75..89) {
         if (isBlessed) {
             println(name + " has some minor wounds but is healing quite quickly!")        }
         else {            println(name + " has some minor wounds.")        }
     }
     else if (healthPoints in  15..74) {
         println(name + " looks pretty hurt.")    }
     else { println(name + " is in awful condition!")    }*/
}

