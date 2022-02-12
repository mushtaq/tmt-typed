package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDataSettings extends StObject {
  
  /* standard DOM */
  var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
}
object ImageDataSettings {
  
  @scala.inline
  def apply(): ImageDataSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDataSettings]
  }
  
  @scala.inline
  implicit class ImageDataSettingsMutableBuilder[Self <: ImageDataSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
  }
}
