package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLElementDeprecatedTagNameMap extends StObject {
  
  /* standard DOM */
  var listing: org.scalajs.dom.HTMLPreElement
  
  /* standard DOM */
  var xmp: org.scalajs.dom.HTMLPreElement
}
object HTMLElementDeprecatedTagNameMap {
  
  @scala.inline
  def apply(listing: org.scalajs.dom.HTMLPreElement, xmp: org.scalajs.dom.HTMLPreElement): HTMLElementDeprecatedTagNameMap = {
    val __obj = js.Dynamic.literal(listing = listing.asInstanceOf[js.Any], xmp = xmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElementDeprecatedTagNameMap]
  }
  
  @scala.inline
  implicit class HTMLElementDeprecatedTagNameMapMutableBuilder[Self <: HTMLElementDeprecatedTagNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListing(value: org.scalajs.dom.HTMLPreElement): Self = StObject.set(x, "listing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmp(value: org.scalajs.dom.HTMLPreElement): Self = StObject.set(x, "xmp", value.asInstanceOf[js.Any])
  }
}
