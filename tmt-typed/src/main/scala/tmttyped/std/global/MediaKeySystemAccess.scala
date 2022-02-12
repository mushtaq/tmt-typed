package tmttyped.std.global

import tmttyped.std.MediaKeySystemConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaKeySystemAccess")
@js.native
/* standard DOM */
class MediaKeySystemAccess ()
  extends StObject
     with tmttyped.std.MediaKeySystemAccess {
  
  /* standard DOM */
  /* CompleteClass */
  override def createMediaKeys(): js.Promise[tmttyped.std.MediaKeys] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def getConfiguration(): MediaKeySystemConfiguration = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val keySystem: java.lang.String = js.native
}
