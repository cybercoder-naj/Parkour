package io.github.cybercodernaj.parkour.core.lexer

import io.github.cybercodernaj.parkour.core.utils.Position

/**
 * A token is a single identifiable unit in a string.
 *
 * @author Nishant Aanjaney Jalan
 * @since 0.0.1
 */
internal sealed class Token(
  val start: Position?,
  val end: Position?
) {
  data object EOF : Token(null, null)
}