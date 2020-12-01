package pl.faleknatalia.day1

import scala.annotation.tailrec

object ReportRepairOfTwo {
  @tailrec
  def findSumOf2020(numbers: List[Int], acc: List[Int]): List[Int] = {
    numbers match {
      case head :: tail => {
        val newList = head +: acc
        val filtered = newList.filter { number => number + head == 2020 }
        if (filtered.isEmpty) {
          findSumOf2020(tail, newList)
        } else {
          head +: filtered
        }
      }
      case Nil => acc
    }
  }
}
