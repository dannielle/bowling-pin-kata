package com.thoughtworks.kata.bowling

import org.scalatest.{Matchers, FlatSpec}

class BowlingGameTest extends FlatSpec with Matchers {

  "A game with no frames" should "have a final score of zero" in {
    BowlingGame(Seq()).score shouldBe 0
  }
}
