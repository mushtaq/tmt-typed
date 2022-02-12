package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGStringList defines a list of DOMString objects. */
@js.native
trait SVGStringList
  extends StObject
     with /* standard DOM */
/* index */ NumberDictionary[java.lang.String] {
  
  /* standard DOM */
  def appendItem(newItem: java.lang.String): java.lang.String = js.native
  
  /* standard DOM */
  def clear(): Unit = js.native
  
  /* standard DOM */
  def getItem(index: Double): java.lang.String = js.native
  
  /* standard DOM */
  def initialize(newItem: java.lang.String): java.lang.String = js.native
  
  /* standard DOM */
  def insertItemBefore(newItem: java.lang.String, index: Double): java.lang.String = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  
  /* standard DOM */
  val length: Double = js.native
  
  /* standard DOM */
  val numberOfItems: Double = js.native
  
  /* standard DOM */
  def removeItem(index: Double): java.lang.String = js.native
  
  /* standard DOM */
  def replaceItem(newItem: java.lang.String, index: Double): java.lang.String = js.native
}
