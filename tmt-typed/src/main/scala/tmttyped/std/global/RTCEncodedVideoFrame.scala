package tmttyped.std.global

import tmttyped.std.RTCEncodedVideoFrameMetadata
import tmttyped.std.RTCEncodedVideoFrameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCEncodedVideoFrame")
@js.native
/* standard DOM */
open class RTCEncodedVideoFrame ()
  extends StObject
     with tmttyped.std.RTCEncodedVideoFrame {
  
  /* standard DOM */
  /* CompleteClass */
  var data: js.typedarray.ArrayBuffer = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def getMetadata(): RTCEncodedVideoFrameMetadata = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val timestamp: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val `type`: RTCEncodedVideoFrameType = js.native
}
