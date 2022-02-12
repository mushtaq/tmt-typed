package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerContainerEventMap extends StObject {
  
  /* standard DOM */
  var controllerchange: org.scalajs.dom.Event
  
  /* standard DOM */
  var message: org.scalajs.dom.MessageEvent
  
  /* standard DOM */
  var messageerror: org.scalajs.dom.MessageEvent
}
object ServiceWorkerContainerEventMap {
  
  @scala.inline
  def apply(
    controllerchange: org.scalajs.dom.Event,
    message: org.scalajs.dom.MessageEvent,
    messageerror: org.scalajs.dom.MessageEvent
  ): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
  
  @scala.inline
  implicit class ServiceWorkerContainerEventMapMutableBuilder[Self <: ServiceWorkerContainerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControllerchange(value: org.scalajs.dom.Event): Self = StObject.set(x, "controllerchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
