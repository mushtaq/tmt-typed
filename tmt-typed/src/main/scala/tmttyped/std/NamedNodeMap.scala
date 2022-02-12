package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array. */
@js.native
trait NamedNodeMap
  extends StObject
     with /* standard DOM */
/* index */ NumberDictionary[org.scalajs.dom.Attr] {
  
  /* standard DOM */
  def getNamedItem(qualifiedName: java.lang.String): org.scalajs.dom.Attr | Null = js.native
  
  /* standard DOM */
  def getNamedItemNS(namespace: java.lang.String, localName: java.lang.String): org.scalajs.dom.Attr | Null = js.native
  def getNamedItemNS(namespace: Null, localName: java.lang.String): org.scalajs.dom.Attr | Null = js.native
  
  /* standard DOM */
  def item(index: Double): org.scalajs.dom.Attr | Null = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.Attr]] = js.native
  
  /* standard DOM */
  val length: Double = js.native
  
  /* standard DOM */
  def removeNamedItem(qualifiedName: java.lang.String): org.scalajs.dom.Attr = js.native
  
  /* standard DOM */
  def removeNamedItemNS(namespace: java.lang.String, localName: java.lang.String): org.scalajs.dom.Attr = js.native
  def removeNamedItemNS(namespace: Null, localName: java.lang.String): org.scalajs.dom.Attr = js.native
  
  /* standard DOM */
  def setNamedItem(attr: org.scalajs.dom.Attr): org.scalajs.dom.Attr | Null = js.native
  
  /* standard DOM */
  def setNamedItemNS(attr: org.scalajs.dom.Attr): org.scalajs.dom.Attr | Null = js.native
}
