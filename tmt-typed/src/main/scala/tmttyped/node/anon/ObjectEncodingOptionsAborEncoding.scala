package tmttyped.node.anon

import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.fsMod.Mode
import tmttyped.node.fsMod._WriteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.ObjectEncodingOptions & node.node:events.Abortable & {  mode :node.fs.Mode | undefined,   flag :string | undefined} */
trait ObjectEncodingOptionsAborEncoding
  extends StObject
     with _WriteFileOptions {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Mode] = js.undefined
  
  /**
    * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
    */
  var signal: js.UndefOr[org.scalajs.dom.AbortSignal] = js.undefined
}
object ObjectEncodingOptionsAborEncoding {
  
  inline def apply(): ObjectEncodingOptionsAborEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectEncodingOptionsAborEncoding]
  }
  
  extension [Self <: ObjectEncodingOptionsAborEncoding](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSignal(value: org.scalajs.dom.AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
