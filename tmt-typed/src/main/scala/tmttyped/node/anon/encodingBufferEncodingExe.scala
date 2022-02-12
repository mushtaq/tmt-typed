package tmttyped.node.anon

import tmttyped.node.AbortSignal
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.nodeUrlMod.URL
import tmttyped.node.processMod.global.NodeJS.ProcessEnv
import tmttyped.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :node.buffer.<global>.BufferEncoding} & node.child_process.ExecOptions */
trait encodingBufferEncodingExe extends StObject {
  
  var cwd: js.UndefOr[String | URL] = js.undefined
  
  var encoding: BufferEncoding
  
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  var gid: js.UndefOr[Double] = js.undefined
  
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  var maxBuffer: js.UndefOr[Double] = js.undefined
  
  var shell: js.UndefOr[String] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
  
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.undefined
}
object encodingBufferEncodingExe {
  
  @scala.inline
  def apply(encoding: BufferEncoding): encodingBufferEncodingExe = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[encodingBufferEncodingExe]
  }
  
  @scala.inline
  implicit class encodingBufferEncodingExeMutableBuilder[Self <: encodingBufferEncodingExe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    @scala.inline
    def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    
    @scala.inline
    def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    @scala.inline
    def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
  }
}
