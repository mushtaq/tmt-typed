package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCLocalSessionDescriptionInit extends StObject {
  
  /* standard DOM */
  var sdp: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var `type`: js.UndefOr[org.scalajs.dom.RTCSdpType] = js.undefined
}
object RTCLocalSessionDescriptionInit {
  
  @scala.inline
  def apply(): RTCLocalSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCLocalSessionDescriptionInit]
  }
  
  @scala.inline
  implicit class RTCLocalSessionDescriptionInitMutableBuilder[Self <: RTCLocalSessionDescriptionInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdp(value: java.lang.String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpUndefined: Self = StObject.set(x, "sdp", js.undefined)
    
    @scala.inline
    def setType(value: org.scalajs.dom.RTCSdpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
