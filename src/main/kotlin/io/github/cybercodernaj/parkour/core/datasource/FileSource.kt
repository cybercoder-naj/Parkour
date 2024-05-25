package io.github.cybercodernaj.parkour.core.datasource

import java.io.File

internal class FileSource(
  file: File
): TextSource {
  private val bufferedReader = file.bufferedReader()
  private val lines = mutableListOf<String>()

  override fun fetchLine(lineNumber: Int): String? {
    while (lineNumber >= lines.size) {
      val line = bufferedReader.readLine()
      if (line == null)
        return null

      lines.add(line)
    }

    return lines[lineNumber]
  }
}