package com.thoughtworks.kata.bowling

case class BowlingGame(frames: Seq[BowlingFrame]) {
  lazy val score = 0

}

case class BowlingFrame(firstRoll: Int, secondRoll: Int = 0) {
  lazy val total =  firstRoll + secondRoll
  if(total > 10) {
    throw new IllegalArgumentException("Total of BowlingFrame cannot be more than 10")
  }
}
