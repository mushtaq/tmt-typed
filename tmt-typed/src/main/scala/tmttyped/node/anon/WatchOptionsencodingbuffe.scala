package tmttyped.node.anon

import tmttyped.node.AbortSignal
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.WatchOptions & {  encoding :'buffer'} */
trait WatchOptionsencodingbuffe extends StObject {
  
  var encoding: (js.UndefOr[BufferEncoding | buffer_]) with buffer_
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object WatchOptionsencodingbuffe {
  
  @scala.inline
  def apply(encoding: (js.UndefOr[BufferEncoding | buffer_]) with buffer_): WatchOptionsencodingbuffe = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptionsencodingbuffe]
  }
  
  @scala.inline
  implicit class WatchOptionsencodingbuffeMutableBuilder[Self <: WatchOptionsencodingbuffe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: (js.UndefOr[BufferEncoding | buffer_]) with buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
