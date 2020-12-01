package pl.faleknatalia.file

import java.net.URL

import scala.io.Source

object FileReader {
  def readFile(url: URL): List[Int] = {
    val lines = Source.fromURL(url)
    lines.getLines().toList.map {
      _.toInt
    }
  }
}
