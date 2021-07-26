package tmttyped.node.anon

import tmttyped.node.AbortSignal
import tmttyped.node.fsMod.OpenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :null | undefined,   flag :node.node:fs.OpenMode | undefined} & node.node:events.Abortable */
trait encodingnullundefinedflag extends StObject {
  
  var encoding: js.UndefOr[Null] = js.undefined
  
  var flag: js.UndefOr[OpenMode] = js.undefined
  
  /**
    * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object encodingnullundefinedflag {
  
  @scala.inline
  def apply(): encodingnullundefinedflag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[encodingnullundefinedflag]
  }
  
  @scala.inline
  implicit class encodingnullundefinedflagMutableBuilder[Self <: encodingnullundefinedflag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlag(value: OpenMode): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
