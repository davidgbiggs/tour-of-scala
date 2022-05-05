import singletonobjects.{Circle, Email}

object Box

val circle1 = Circle(5.0)
circle1.area

val scalaCenterEmail = Email.fromString("scala.center@epfl.ch")
scalaCenterEmail match {
  case Some(email) => println(
    s"""Registered an email
       |Username: ${email.username}
       |Domain name: ${email.domainName}
       |""".stripMargin)
  case None => println("Error: could not parse email")
}