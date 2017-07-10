package de.mo

case class Trainer(name:String, bag: List[Option[String]])

object Pokemon {

  def evolveMap = Map(
    "Pikachu" -> "Raichu",
    "Bisasam" -> "Bisaknosp",
    "Bisaknosp" -> "Bisaflor",
    "Glumanda" -> "Glutexo",
    "Glutexo" -> "Glurak",
    "Schiggy" -> "Schillok",
    "Schillok" -> "Turtok",
    "Togepi" -> "Togetic",
    "Togetic" -> "Togekiss"
  )

  def megaMap = Map(
    "Glurak" -> "Mega Glurak"
  )

  def evolve(pokemon: String): String = {
    evolveMap.getOrElse(pokemon, pokemon)
  }

  def isFire(pokemon: String) : Boolean = {
    Set("Glumanda","Glutexo","Glurak").contains(pokemon)
  }

  def megaStone(modify: String)(pokemon:String): String = {
    if(megaMap.contains(pokemon))
      megaMap(pokemon) + " "+modify
    else
      pokemon
  }

}
