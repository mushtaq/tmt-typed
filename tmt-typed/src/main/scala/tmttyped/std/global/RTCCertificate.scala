package tmttyped.std.global

import tmttyped.std.DOMTimeStamp
import tmttyped.std.RTCDtlsFingerprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCCertificate")
@js.native
/* standard DOM */
class RTCCertificate ()
  extends StObject
     with tmttyped.std.RTCCertificate {
  
  /* standard DOM */
  /* CompleteClass */
  override val expires: DOMTimeStamp = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}
