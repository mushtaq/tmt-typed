package tmttyped.std.global

import tmttyped.std.MediaCapabilitiesDecodingInfo
import tmttyped.std.MediaCapabilitiesEncodingInfo
import tmttyped.std.MediaDecodingConfiguration
import tmttyped.std.MediaEncodingConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaCapabilities")
@js.native
/* standard DOM */
open class MediaCapabilities ()
  extends StObject
     with tmttyped.std.MediaCapabilities {
  
  /* standard DOM */
  /* CompleteClass */
  override def decodingInfo(configuration: MediaDecodingConfiguration): js.Promise[MediaCapabilitiesDecodingInfo] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def encodingInfo(configuration: MediaEncodingConfiguration): js.Promise[MediaCapabilitiesEncodingInfo] = js.native
}
