package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorderErrorEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var error: org.scalajs.dom.DOMException
}
object MediaRecorderErrorEventInit {
  
  @scala.inline
  def apply(error: org.scalajs.dom.DOMException): MediaRecorderErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderErrorEventInit]
  }
  
  @scala.inline
  implicit class MediaRecorderErrorEventInitMutableBuilder[Self <: MediaRecorderErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: org.scalajs.dom.DOMException): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
