package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowSessionStorage extends StObject {
  
  /* standard DOM */
  val sessionStorage: org.scalajs.dom.Storage
}
object WindowSessionStorage {
  
  @scala.inline
  def apply(sessionStorage: org.scalajs.dom.Storage): WindowSessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSessionStorage]
  }
  
  @scala.inline
  implicit class WindowSessionStorageMutableBuilder[Self <: WindowSessionStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionStorage(value: org.scalajs.dom.Storage): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
