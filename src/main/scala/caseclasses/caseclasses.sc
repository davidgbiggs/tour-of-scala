case class Book(isbn: String)

val frankenstein = Book("978-0486282114")

case class Message(sender: String, recipient: String, body: String)
val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ca va ?")

println(message1.sender)
//message1.sender = "travis@washington.us"

case class Message(sender: String, recipient: String, body: String)

val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val messagesAreTheSame = message2 == message3 // true: compared by structure and not by reference

case class Message(sender: String, recipient: String, body: String)
val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
message5.sender // travis@washington.us
message5.recipient // julien@bretagne.fr
message5.body // "Me zo o komz gant ma amezeg