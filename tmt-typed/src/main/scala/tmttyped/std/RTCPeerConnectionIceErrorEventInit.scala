package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCPeerConnectionIceErrorEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var address: js.UndefOr[java.lang.String | Null] = js.undefined
  
  /* standard DOM */
  var errorCode: Double
  
  /* standard DOM */
  var errorText: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /* standard DOM */
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object RTCPeerConnectionIceErrorEventInit {
  
  @scala.inline
  def apply(errorCode: Double): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
  
  @scala.inline
  implicit class RTCPeerConnectionIceErrorEventInitMutableBuilder[Self <: RTCPeerConnectionIceErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: java.lang.String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorText(value: java.lang.String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = StObject.set(x, "port", null)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
