package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCTrackEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var receiver: RTCRtpReceiver
  
  /* standard DOM */
  var streams: js.UndefOr[js.Array[org.scalajs.dom.MediaStream]] = js.undefined
  
  /* standard DOM */
  var track: org.scalajs.dom.MediaStreamTrack
  
  /* standard DOM */
  var transceiver: RTCRtpTransceiver
}
object RTCTrackEventInit {
  
  @scala.inline
  def apply(receiver: RTCRtpReceiver, track: org.scalajs.dom.MediaStreamTrack, transceiver: RTCRtpTransceiver): RTCTrackEventInit = {
    val __obj = js.Dynamic.literal(receiver = receiver.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], transceiver = transceiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTrackEventInit]
  }
  
  @scala.inline
  implicit class RTCTrackEventInitMutableBuilder[Self <: RTCTrackEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceiver(value: RTCRtpReceiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreams(value: js.Array[org.scalajs.dom.MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    @scala.inline
    def setStreamsVarargs(value: org.scalajs.dom.MediaStream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    
    @scala.inline
    def setTrack(value: org.scalajs.dom.MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransceiver(value: RTCRtpTransceiver): Self = StObject.set(x, "transceiver", value.asInstanceOf[js.Any])
  }
}
