package tmttyped.node.anon

import tmttyped.node.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :null | undefined,   flag :string | undefined} & node.node:events.Abortable */
trait encodingnullundefinedflagEncoding extends StObject {
  
  var encoding: js.UndefOr[Null] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
  
  /**
    * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object encodingnullundefinedflagEncoding {
  
  @scala.inline
  def apply(): encodingnullundefinedflagEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[encodingnullundefinedflagEncoding]
  }
  
  @scala.inline
  implicit class encodingnullundefinedflagEncodingMutableBuilder[Self <: encodingnullundefinedflagEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
