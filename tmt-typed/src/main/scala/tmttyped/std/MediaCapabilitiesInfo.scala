package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapabilitiesInfo extends StObject {
  
  /* standard DOM */
  var powerEfficient: scala.Boolean
  
  /* standard DOM */
  var smooth: scala.Boolean
  
  /* standard DOM */
  var supported: scala.Boolean
}
object MediaCapabilitiesInfo {
  
  @scala.inline
  def apply(powerEfficient: scala.Boolean, smooth: scala.Boolean, supported: scala.Boolean): MediaCapabilitiesInfo = {
    val __obj = js.Dynamic.literal(powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCapabilitiesInfo]
  }
  
  @scala.inline
  implicit class MediaCapabilitiesInfoMutableBuilder[Self <: MediaCapabilitiesInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPowerEfficient(value: scala.Boolean): Self = StObject.set(x, "powerEfficient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmooth(value: scala.Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: scala.Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
