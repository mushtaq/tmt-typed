package tmttyped.std.global

import tmttyped.std.RTCRtpCapabilities
import tmttyped.std.RTCRtpContributingSource
import tmttyped.std.RTCRtpReceiveParameters
import tmttyped.std.RTCRtpSynchronizationSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCRtpReceiver")
@js.native
class RTCRtpReceiver ()
  extends tmttyped.std.RTCRtpReceiver {
  
  /* CompleteClass */
  override def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  
  /* CompleteClass */
  override def getParameters(): RTCRtpReceiveParameters = js.native
  
  /* CompleteClass */
  override def getStats(): js.Promise[org.scalajs.dom.experimental.webrtc.RTCStatsReport] = js.native
  
  /* CompleteClass */
  override def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
  
  /* CompleteClass */
  override val rtcpTransport: tmttyped.std.RTCDtlsTransport | Null = js.native
  
  /* CompleteClass */
  override val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
  
  /* CompleteClass */
  override val transport: tmttyped.std.RTCDtlsTransport | Null = js.native
}
object RTCRtpReceiver {
  
  @JSGlobal("RTCRtpReceiver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapabilities")(kind.asInstanceOf[js.Any]).asInstanceOf[RTCRtpCapabilities | Null]
}
