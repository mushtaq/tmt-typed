package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaList
  extends StObject
     with /* standard DOM */
/* index */ NumberDictionary[java.lang.String] {
  
  /* standard DOM */
  def appendMedium(medium: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def deleteMedium(medium: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def item(index: Double): java.lang.String | Null = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  
  /* standard DOM */
  val length: Double = js.native
  
  /* standard DOM */
  var mediaText: java.lang.String = js.native
}
