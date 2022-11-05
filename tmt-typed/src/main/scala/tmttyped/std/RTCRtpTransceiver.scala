package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpTransceiver extends StObject {
  
  /* standard DOM */
  val currentDirection: RTCRtpTransceiverDirection | Null = js.native
  
  /* standard DOM */
  var direction: RTCRtpTransceiverDirection = js.native
  
  /* standard DOM */
  val mid: java.lang.String | Null = js.native
  
  /* standard DOM */
  val receiver: RTCRtpReceiver = js.native
  
  /* standard DOM */
  val sender: RTCRtpSender = js.native
  
  /* standard DOM */
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit = js.native
  /* standard DOM.Iterable */
  def setCodecPreferences(codecs: js.Iterable[RTCRtpCodecCapability]): Unit = js.native
  
  /* standard DOM */
  def stop(): Unit = js.native
}
