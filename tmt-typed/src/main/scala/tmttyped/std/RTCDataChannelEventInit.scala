package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCDataChannelEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var channel: org.scalajs.dom.RTCDataChannel
}
object RTCDataChannelEventInit {
  
  @scala.inline
  def apply(channel: org.scalajs.dom.RTCDataChannel): RTCDataChannelEventInit = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventInit]
  }
  
  @scala.inline
  implicit class RTCDataChannelEventInitMutableBuilder[Self <: RTCDataChannelEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: org.scalajs.dom.RTCDataChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
