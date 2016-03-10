package com.thoughtworks.kata.bowling

import org.scalatest.{Matchers, FlatSpec}

class BowlingFrameTest extends FlatSpec with Matchers{

  "A bowling frame's total score" should "be the sum of its two rolls" in {
    BowlingFrame(1, 2).total shouldBe 3
  }

  "A bowling frame with a score total greater than 10" should "throw an IllegalArgumentException" in {
    val ex  = intercept[IllegalArgumentException] {
      BowlingFrame(9, 2)
    }
  }
}
