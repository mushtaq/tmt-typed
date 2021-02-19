package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBDatabaseEventMap extends StObject {
  
  var abort: org.scalajs.dom.raw.Event
  
  var close: org.scalajs.dom.raw.Event
  
  var error: org.scalajs.dom.raw.Event
  
  var versionchange: org.scalajs.dom.raw.IDBVersionChangeEvent
}
object IDBDatabaseEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.raw.Event,
    close: org.scalajs.dom.raw.Event,
    error: org.scalajs.dom.raw.Event,
    versionchange: org.scalajs.dom.raw.IDBVersionChangeEvent
  ): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], versionchange = versionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
  
  @scala.inline
  implicit class IDBDatabaseEventMapMutableBuilder[Self <: IDBDatabaseEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionchange(value: org.scalajs.dom.raw.IDBVersionChangeEvent): Self = StObject.set(x, "versionchange", value.asInstanceOf[js.Any])
  }
}
