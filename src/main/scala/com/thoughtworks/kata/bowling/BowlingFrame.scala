package com.thoughtworks.kata.bowling

case class BowlingFrame(firstRoll: Int, secondRoll: Int = 0) {
  lazy val total =  firstRoll + secondRoll
  if(total > 10) {
    throw new IllegalArgumentException("Total of BowlingFrame cannot be more than 10")
  }
}
