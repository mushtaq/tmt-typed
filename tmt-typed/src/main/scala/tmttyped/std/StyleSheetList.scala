package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of StyleSheet. */
@js.native
trait StyleSheetList
  extends StObject
     with /* standard DOM */
/* index */ NumberDictionary[org.scalajs.dom.CSSStyleSheet] {
  
  /* standard DOM */
  def item(index: Double): org.scalajs.dom.CSSStyleSheet | Null = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.CSSStyleSheet]] = js.native
  
  /* standard DOM */
  val length: Double = js.native
}
