package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerRegistrationEventMap extends StObject {
  
  var updatefound: org.scalajs.dom.raw.Event
}
object ServiceWorkerRegistrationEventMap {
  
  @scala.inline
  def apply(updatefound: org.scalajs.dom.raw.Event): ServiceWorkerRegistrationEventMap = {
    val __obj = js.Dynamic.literal(updatefound = updatefound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistrationEventMap]
  }
  
  @scala.inline
  implicit class ServiceWorkerRegistrationEventMapMutableBuilder[Self <: ServiceWorkerRegistrationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdatefound(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "updatefound", value.asInstanceOf[js.Any])
  }
}
