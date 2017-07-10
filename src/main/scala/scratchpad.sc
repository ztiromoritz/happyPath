//import de.mo.Service
//val result = Service.getPeople

case class Book(title:String)
case class Author(name:String)

val book1 = Book("Do the job")
val book2 = Book("Do it well")
val author1 = Author("Gosling")
val author2 = Author("Martin Odersky")
val authorsOfBook = Map(
  book1 -> Seq(author1),
  book2 -> Seq(author1, author2)
)

def getAuthorsForBook(book: Book) = authorsOfBook(book)

for {
  book <- Seq(book1, book2)
  author <- getAuthorsForBook(book) if author.name contains "Odersky"
} yield {
  book
}







