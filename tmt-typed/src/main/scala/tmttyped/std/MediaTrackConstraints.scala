package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackConstraints extends MediaTrackConstraintSet {
  
  var advanced: js.UndefOr[js.Array[org.scalajs.dom.experimental.mediastream.MediaTrackConstraintSet]] = js.undefined
}
object MediaTrackConstraints {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.mediastream.MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.mediastream.MediaTrackConstraints]
  }
  
  @scala.inline
  implicit class MediaTrackConstraintsMutableBuilder[Self <: org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvanced(value: js.Array[org.scalajs.dom.experimental.mediastream.MediaTrackConstraintSet]): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
    
    @scala.inline
    def setAdvancedVarargs(value: org.scalajs.dom.experimental.mediastream.MediaTrackConstraintSet*): Self = StObject.set(x, "advanced", js.Array(value :_*))
  }
}
