package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureInPictureWindowEventMap extends StObject {
  
  /* standard DOM */
  var resize: org.scalajs.dom.Event
}
object PictureInPictureWindowEventMap {
  
  @scala.inline
  def apply(resize: org.scalajs.dom.Event): PictureInPictureWindowEventMap = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureInPictureWindowEventMap]
  }
  
  @scala.inline
  implicit class PictureInPictureWindowEventMapMutableBuilder[Self <: PictureInPictureWindowEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResize(value: org.scalajs.dom.Event): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
  }
}
