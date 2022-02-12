package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A DOM element's attribute as an object. In most DOM methods, you will probably directly retrieve the attribute as a string (e.g., Element.getAttribute(), but certain functions (e.g., Element.getAttributeNode()) or means of iterating give Attr types. */
@js.native
trait Attr
  extends StObject
     with Node {
  
  /* standard DOM */
  val localName: java.lang.String = js.native
  
  /* standard DOM */
  val name: java.lang.String = js.native
  
  /* standard DOM */
  val namespaceURI: java.lang.String | Null = js.native
  
  /* standard DOM */
  @JSName("ownerDocument")
  val ownerDocument_Attr: org.scalajs.dom.Document = js.native
  
  /* standard DOM */
  val ownerElement: org.scalajs.dom.Element | Null = js.native
  
  /* standard DOM */
  val prefix: java.lang.String | Null = js.native
  
  /* standard DOM */
  val specified: scala.Boolean = js.native
  
  /* standard DOM */
  var value: java.lang.String = js.native
}
