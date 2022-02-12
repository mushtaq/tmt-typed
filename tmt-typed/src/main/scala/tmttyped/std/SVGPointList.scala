package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPointList
  extends StObject
     with /* standard DOM */
/* index */ NumberDictionary[DOMPoint] {
  
  /* standard DOM */
  def appendItem(newItem: DOMPoint): DOMPoint = js.native
  
  /* standard DOM */
  def clear(): Unit = js.native
  
  /* standard DOM */
  def getItem(index: Double): DOMPoint = js.native
  
  /* standard DOM */
  def initialize(newItem: DOMPoint): DOMPoint = js.native
  
  /* standard DOM */
  def insertItemBefore(newItem: DOMPoint, index: Double): DOMPoint = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMPoint]] = js.native
  
  /* standard DOM */
  val length: Double = js.native
  
  /* standard DOM */
  val numberOfItems: Double = js.native
  
  /* standard DOM */
  def removeItem(index: Double): DOMPoint = js.native
  
  /* standard DOM */
  def replaceItem(newItem: DOMPoint, index: Double): DOMPoint = js.native
}
