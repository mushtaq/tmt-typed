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
    
    @scala.inline
    def setPskDataView(value: js.typedarray.DataView): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPskUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
  }
}
