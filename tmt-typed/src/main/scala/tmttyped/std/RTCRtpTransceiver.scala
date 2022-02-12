package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpTransceiver extends StObject {
  
  /* standard DOM */
  val currentDirection: RTCRtpTransceiverDirection | Null
  
  /* standard DOM */
  var direction: RTCRtpTransceiverDirection
  
  /* standard DOM */
  val mid: java.lang.String | Null
  
  /* standard DOM */
  val receiver: RTCRtpReceiver
  
  /* standard DOM */
  val sender: RTCRtpSender
  
  /* standard DOM */
  def stop(): Unit
}
object RTCRtpTransceiver {
  
  @scala.inline
  def apply(
    direction: RTCRtpTransceiverDirection,
    receiver: RTCRtpReceiver,
    sender: RTCRtpSender,
    stop: () => Unit
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), currentDirection = null, mid = null)
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
  
  @scala.inline
  implicit class RTCRtpTransceiverMutableBuilder[Self <: RTCRtpTransceiver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "currentDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDirectionNull: Self = StObject.set(x, "currentDirection", null)
    
    @scala.inline
    def setDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMid(value: java.lang.String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidNull: Self = StObject.set(x, "mid", null)
    
    @scala.inline
    def setReceiver(value: RTCRtpReceiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: RTCRtpSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
