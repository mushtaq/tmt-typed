package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fd extends StObject {
  
  var fd: tmttyped.node.nodeNumbers.`1`
}
object Fd {
  
  @scala.inline
  def apply(): Fd = {
    val __obj = js.Dynamic.literal(fd = 1)
    __obj.asInstanceOf[Fd]
  }
  
  @scala.inline
  implicit class FdMutableBuilder[Self <: Fd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFd(value: tmttyped.node.nodeNumbers.`1`): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
