package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaImage extends StObject {
  
  /* standard DOM */
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var src: java.lang.String
  
  /* standard DOM */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object MediaImage {
  
  @scala.inline
  def apply(src: java.lang.String): MediaImage = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaImage]
  }
  
  @scala.inline
  implicit class MediaImageMutableBuilder[Self <: MediaImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizes(value: java.lang.String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
