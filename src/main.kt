fun main()
{
   val t1= TypeIntro()  ;
    t1.experiencePoints+=5;
    println(t1.playerName+" "+t1.experiencePoints)
    var typesMagic=(t1.playerName)
    println(typesMagic.reversed())
}


class TypeIntro
{
    var experiencePoints =5;
    val playerName ="Estragon"
    var hasSteed=0;

}