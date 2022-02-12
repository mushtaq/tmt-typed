package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEventInit[T]
  extends StObject
     with EventInit {
  
  /* standard DOM */
  var data: js.UndefOr[T] = js.undefined
  
  /* standard DOM */
  var lastEventId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var ports: js.UndefOr[js.Array[org.scalajs.dom.MessagePort]] = js.undefined
  
  /* standard DOM */
  var source: js.UndefOr[MessageEventSource | Null] = js.undefined
}
object MessageEventInit {
  
  @scala.inline
  def apply[T](): MessageEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventInit[T]]
  }
  
  @scala.inline
  implicit class MessageEventInitMutableBuilder[Self <: MessageEventInit[_], T] (val x: Self with MessageEventInit[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLastEventId(value: java.lang.String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
    
    @scala.inline
    def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[org.scalajs.dom.MessagePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: org.scalajs.dom.MessagePort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: MessageEventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
