package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGLengthList defines a list of SVGLength objects. */
@js.native
trait SVGLengthList
  extends StObject
     with /* standard DOM */
/* index */ NumberDictionary[org.scalajs.dom.SVGLength] {
  
  /* standard DOM */
  def appendItem(newItem: org.scalajs.dom.SVGLength): org.scalajs.dom.SVGLength = js.native
  
  /* standard DOM */
  def clear(): Unit = js.native
  
  /* standard DOM */
  def getItem(index: Double): org.scalajs.dom.SVGLength = js.native
  
  /* standard DOM */
  def initialize(newItem: org.scalajs.dom.SVGLength): org.scalajs.dom.SVGLength = js.native
  
  /* standard DOM */
  def insertItemBefore(newItem: org.scalajs.dom.SVGLength, index: Double): org.scalajs.dom.SVGLength = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.SVGLength]] = js.native
  
  /* standard DOM */
  val length: Double = js.native
  
  /* standard DOM */
  val numberOfItems: Double = js.native
  
  /* standard DOM */
  def removeItem(index: Double): org.scalajs.dom.SVGLength = js.native
  
  /* standard DOM */
  def replaceItem(newItem: org.scalajs.dom.SVGLength, index: Double): org.scalajs.dom.SVGLength = js.native
}
