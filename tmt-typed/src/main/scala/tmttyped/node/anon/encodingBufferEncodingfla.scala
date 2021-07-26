package tmttyped.node.anon

import tmttyped.node.AbortSignal
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.fsMod.OpenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :node.buffer.<global>.BufferEncoding,   flag :node.node:fs.OpenMode | undefined} & node.node:events.Abortable */
trait encodingBufferEncodingfla extends StObject {
  
  var encoding: BufferEncoding
  
  var flag: js.UndefOr[OpenMode] = js.undefined
  
  /**
    * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object encodingBufferEncodingfla {
  
  @scala.inline
  def apply(encoding: BufferEncoding): encodingBufferEncodingfla = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[encodingBufferEncodingfla]
  }
  
  @scala.inline
  implicit class encodingBufferEncodingflaMutableBuilder[Self <: encodingBufferEncodingfla] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
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
