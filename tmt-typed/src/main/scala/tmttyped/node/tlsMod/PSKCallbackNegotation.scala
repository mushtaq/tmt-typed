package tmttyped.node.tlsMod

import tmttyped.node.NodeJS.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PSKCallbackNegotation extends StObject {
  
  var identity: String
  
  var psk: js.typedarray.DataView | TypedArray
}
object PSKCallbackNegotation {
  
  @scala.inline
  def apply(identity: String, psk: js.typedarray.DataView | TypedArray): PSKCallbackNegotation = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], psk = psk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSKCallbackNegotation]
  }
  
  @scala.inline
  implicit class PSKCallbackNegotationMutableBuilder[Self <: PSKCallbackNegotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPsk(value: js.typedarray.DataView | TypedArray): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
  }
}
