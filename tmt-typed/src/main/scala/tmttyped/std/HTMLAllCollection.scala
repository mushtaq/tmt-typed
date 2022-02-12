package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAllCollection
  extends StObject
     with /* standard DOM */
/* index */ NumberDictionary[org.scalajs.dom.Element] {
  
  /** Returns the item with index index from the collection (determined by tree order). */
  /* standard DOM */
  def item(): org.scalajs.dom.HTMLCollection[Any] | org.scalajs.dom.Element | Null = js.native
  def item(nameOrIndex: java.lang.String): org.scalajs.dom.HTMLCollection[Any] | org.scalajs.dom.Element | Null = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.Element]] = js.native
  
  /** Returns the number of elements in the collection. */
  /* standard DOM */
  val length: Double = js.native
  
  /**
    * Returns the item with ID or name name from the collection.
    *
    * If there are multiple matching items, then an HTMLCollection object containing all those elements is returned.
    *
    * Only button, form, iframe, input, map, meta, object, select, and textarea elements can have a name for the purpose of this method; their name is given by the value of their name attribute.
    */
  /* standard DOM */
  def namedItem(name: java.lang.String): org.scalajs.dom.HTMLCollection[Any] | org.scalajs.dom.Element | Null = js.native
}
