package tmttyped.std.global

import tmttyped.std.MediaRecorderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaRecorder")
@js.native
open class MediaRecorder protected ()
  extends StObject
     with tmttyped.std.MediaRecorder {
  /* standard DOM */
  def this(stream: org.scalajs.dom.MediaStream) = this()
  def this(stream: org.scalajs.dom.MediaStream, options: MediaRecorderOptions) = this()
}
object MediaRecorder {
  
  @JSGlobal("MediaRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  inline def isTypeSupported(`type`: java.lang.String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
