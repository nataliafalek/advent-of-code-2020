package day1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import pl.faleknatalia.day1.ReportRepairOfTwo
import pl.faleknatalia.file.FileReader

class ReportRepairSpec extends AnyFlatSpec with Matchers {
  "find sum of 2020" should "be valid" in {
    val numbers = FileReader.readFile(getClass.getResource("/puzzle_day1.txt"))
    val sumOf2020 = ReportRepairOfTwo.findSumOf2020(numbers, List.empty)
    sumOf2020.sum shouldBe 2020
  }
}