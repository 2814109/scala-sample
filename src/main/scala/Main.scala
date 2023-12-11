@main def hello: Unit =
  println("Hello world!")
  println(msg)
  println(sample)

def msg = "I was compiled by Scala 3. :)"


def sample : String =
  return "hello GoodMoring"