package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaEncodingConfiguration
  extends StObject
     with MediaConfiguration {
  
  /* standard DOM */
  var `type`: MediaEncodingType
}
object MediaEncodingConfiguration {
  
  @scala.inline
  def apply(`type`: MediaEncodingType): MediaEncodingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEncodingConfiguration]
  }
  
  @scala.inline
  implicit class MediaEncodingConfigurationMutableBuilder[Self <: MediaEncodingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MediaEncodingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
