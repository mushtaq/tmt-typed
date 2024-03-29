package tmttyped.std.global

import org.scalajs.dom.RTCSdpType
import org.scalajs.dom.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCSessionDescription")
@js.native
open class RTCSessionDescription protected ()
  extends StObject
     with tmttyped.std.RTCSessionDescription {
  /* standard DOM */
  def this(descriptionInitDict: RTCSessionDescriptionInit) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override val sdp: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val `type`: RTCSdpType = js.native
}
