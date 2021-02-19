package tmttyped.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncResource extends StObject {
  
  var asyncResource: tmttyped.node.asyncHooksMod.AsyncResource
}
object AsyncResource {
  
  @scala.inline
  def apply(asyncResource: tmttyped.node.asyncHooksMod.AsyncResource): AsyncResource = {
    val __obj = js.Dynamic.literal(asyncResource = asyncResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncResource]
  }
  
  @scala.inline
  implicit class AsyncResourceMutableBuilder[Self <: AsyncResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncResource(value: tmttyped.node.asyncHooksMod.AsyncResource): Self = StObject.set(x, "asyncResource", value.asInstanceOf[js.Any])
  }
}
