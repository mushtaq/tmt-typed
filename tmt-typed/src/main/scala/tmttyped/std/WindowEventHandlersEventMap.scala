package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventHandlersEventMap extends StObject {
  
  var afterprint: org.scalajs.dom.raw.Event
  
  var beforeprint: org.scalajs.dom.raw.Event
  
  var beforeunload: org.scalajs.dom.raw.BeforeUnloadEvent
  
  var hashchange: org.scalajs.dom.raw.HashChangeEvent
  
  var languagechange: org.scalajs.dom.raw.Event
  
  var message: org.scalajs.dom.raw.MessageEvent
  
  var messageerror: org.scalajs.dom.raw.MessageEvent
  
  var offline: org.scalajs.dom.raw.Event
  
  var online: org.scalajs.dom.raw.Event
  
  var pagehide: PageTransitionEvent
  
  var pageshow: PageTransitionEvent
  
  var popstate: org.scalajs.dom.raw.PopStateEvent
  
  var rejectionhandled: PromiseRejectionEvent
  
  var storage: org.scalajs.dom.raw.StorageEvent
  
  var unhandledrejection: PromiseRejectionEvent
  
  var unload: org.scalajs.dom.raw.Event
}
object WindowEventHandlersEventMap {
  
  @scala.inline
  def apply(
    afterprint: org.scalajs.dom.raw.Event,
    beforeprint: org.scalajs.dom.raw.Event,
    beforeunload: org.scalajs.dom.raw.BeforeUnloadEvent,
    hashchange: org.scalajs.dom.raw.HashChangeEvent,
    languagechange: org.scalajs.dom.raw.Event,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent,
    offline: org.scalajs.dom.raw.Event,
    online: org.scalajs.dom.raw.Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: org.scalajs.dom.raw.PopStateEvent,
    rejectionhandled: PromiseRejectionEvent,
    storage: org.scalajs.dom.raw.StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: org.scalajs.dom.raw.Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
  
  @scala.inline
  implicit class WindowEventHandlersEventMapMutableBuilder[Self <: WindowEventHandlersEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterprint(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "afterprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeprint(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "beforeprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeunload(value: org.scalajs.dom.raw.BeforeUnloadEvent): Self = StObject.set(x, "beforeunload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashchange(value: org.scalajs.dom.raw.HashChangeEvent): Self = StObject.set(x, "hashchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagechange(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "languagechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffline(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagehide(value: PageTransitionEvent): Self = StObject.set(x, "pagehide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageshow(value: PageTransitionEvent): Self = StObject.set(x, "pageshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopstate(value: org.scalajs.dom.raw.PopStateEvent): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionhandled(value: PromiseRejectionEvent): Self = StObject.set(x, "rejectionhandled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: org.scalajs.dom.raw.StorageEvent): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledrejection(value: PromiseRejectionEvent): Self = StObject.set(x, "unhandledrejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnload(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
  }
}
