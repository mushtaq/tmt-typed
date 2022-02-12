package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowLocalStorage extends StObject {
  
  /* standard DOM */
  val localStorage: org.scalajs.dom.Storage
}
object WindowLocalStorage {
  
  @scala.inline
  def apply(localStorage: org.scalajs.dom.Storage): WindowLocalStorage = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLocalStorage]
  }
  
  @scala.inline
  implicit class WindowLocalStorageMutableBuilder[Self <: WindowLocalStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalStorage(value: org.scalajs.dom.Storage): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
  }
}
