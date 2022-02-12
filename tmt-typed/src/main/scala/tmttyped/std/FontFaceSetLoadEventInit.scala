package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceSetLoadEventInit
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var fontfaces: js.UndefOr[js.Array[FontFace]] = js.undefined
}
object FontFaceSetLoadEventInit {
  
  @scala.inline
  def apply(): FontFaceSetLoadEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceSetLoadEventInit]
  }
  
  @scala.inline
  implicit class FontFaceSetLoadEventInitMutableBuilder[Self <: FontFaceSetLoadEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontfaces(value: js.Array[FontFace]): Self = StObject.set(x, "fontfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontfacesUndefined: Self = StObject.set(x, "fontfaces", js.undefined)
    
    @scala.inline
    def setFontfacesVarargs(value: FontFace*): Self = StObject.set(x, "fontfaces", js.Array(value :_*))
  }
}
