package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCTrackEvent
  extends StObject
     with Event {
  
  /* standard DOM */
  val receiver: RTCRtpReceiver = js.native
  
  /* standard DOM */
  val streams: js.Array[org.scalajs.dom.MediaStream] = js.native
  
  /* standard DOM */
  val track: org.scalajs.dom.MediaStreamTrack = js.native
  
  /* standard DOM */
  val transceiver: RTCRtpTransceiver = js.native
}
