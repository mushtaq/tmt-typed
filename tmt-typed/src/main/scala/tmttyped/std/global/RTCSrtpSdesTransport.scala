package tmttyped.std.global

import tmttyped.std.RTCSrtpSdesParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCSrtpSdesTransport")
@js.native
class RTCSrtpSdesTransport protected ()
  extends tmttyped.std.RTCSrtpSdesTransport {
  def this(
    transport: tmttyped.std.RTCIceTransport,
    encryptParameters: RTCSrtpSdesParameters,
    decryptParameters: RTCSrtpSdesParameters
  ) = this()
}
object RTCSrtpSdesTransport {
  
  @JSGlobal("RTCSrtpSdesTransport.getLocalParameters")
  @js.native
  def getLocalParameters(): js.Array[RTCSrtpSdesParameters] = js.native
}