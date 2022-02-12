package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBDatabaseEventMap extends StObject {
  
  /* standard DOM */
  var abort: org.scalajs.dom.Event
  
  /* standard DOM */
  var close: org.scalajs.dom.Event
  
  /* standard DOM */
  var error: org.scalajs.dom.Event
  
  /* standard DOM */
  var versionchange: org.scalajs.dom.IDBVersionChangeEvent
}
object IDBDatabaseEventMap {
  
  @scala.inline
  def apply(
    abort: org.scalajs.dom.Event,
    close: org.scalajs.dom.Event,
    error: org.scalajs.dom.Event,
    versionchange: org.scalajs.dom.IDBVersionChangeEvent
  ): IDBDatabaseEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], versionchange = versionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBDatabaseEventMap]
  }
  
  @scala.inline
  implicit class IDBDatabaseEventMapMutableBuilder[Self <: IDBDatabaseEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: org.scalajs.dom.Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: org.scalajs.dom.Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionchange(value: org.scalajs.dom.IDBVersionChangeEvent): Self = StObject.set(x, "versionchange", value.asInstanceOf[js.Any])
  }
}
