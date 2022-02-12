package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDevicesEventMap extends StObject {
  
  /* standard DOM */
  var devicechange: org.scalajs.dom.Event
}
object MediaDevicesEventMap {
  
  @scala.inline
  def apply(devicechange: org.scalajs.dom.Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
  
  @scala.inline
  implicit class MediaDevicesEventMapMutableBuilder[Self <: MediaDevicesEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "devicechange", value.asInstanceOf[js.Any])
  }
}
