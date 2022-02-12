package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceSetEventMap extends StObject {
  
  /* standard DOM */
  var loading: org.scalajs.dom.Event
  
  /* standard DOM */
  var loadingdone: org.scalajs.dom.Event
  
  /* standard DOM */
  var loadingerror: org.scalajs.dom.Event
}
object FontFaceSetEventMap {
  
  @scala.inline
  def apply(
    loading: org.scalajs.dom.Event,
    loadingdone: org.scalajs.dom.Event,
    loadingerror: org.scalajs.dom.Event
  ): FontFaceSetEventMap = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], loadingdone = loadingdone.asInstanceOf[js.Any], loadingerror = loadingerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceSetEventMap]
  }
  
  @scala.inline
  implicit class FontFaceSetEventMapMutableBuilder[Self <: FontFaceSetEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: org.scalajs.dom.Event): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingdone(value: org.scalajs.dom.Event): Self = StObject.set(x, "loadingdone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingerror(value: org.scalajs.dom.Event): Self = StObject.set(x, "loadingerror", value.asInstanceOf[js.Any])
  }
}
