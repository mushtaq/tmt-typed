package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaSource")
@js.native
/* standard DOM */
open class MediaSource ()
  extends StObject
     with tmttyped.std.MediaSource
object MediaSource {
  
  @JSGlobal("MediaSource")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  inline def isTypeSupported(`type`: java.lang.String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
