package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSStyleSheetInit extends StObject {
  
  /* standard DOM */
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var media: js.UndefOr[org.scalajs.dom.MediaList | java.lang.String] = js.undefined
}
object CSSStyleSheetInit {
  
  @scala.inline
  def apply(): CSSStyleSheetInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSStyleSheetInit]
  }
  
  @scala.inline
  implicit class CSSStyleSheetInitMutableBuilder[Self <: CSSStyleSheetInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseURL(value: java.lang.String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    @scala.inline
    def setDisabled(value: scala.Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMedia(value: org.scalajs.dom.MediaList | java.lang.String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
