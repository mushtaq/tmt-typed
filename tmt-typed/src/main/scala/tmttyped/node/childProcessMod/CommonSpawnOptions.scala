package tmttyped.node.childProcessMod

import tmttyped.node.eventsMod.Abortable
import tmttyped.node.nodeStreamMod.Stream
import tmttyped.node.nodeStrings.ipc
import tmttyped.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- tmttyped.node.childProcessMod.MessagingOptions because var conflicts: timeout. Inlined serialization, killSignal */ trait CommonSpawnOptions
  extends StObject
     with CommonOptions
     with Abortable {
  
  var argv0: js.UndefOr[String] = js.undefined
  
  /**
    * The signal value to be used when the spawned process will be killed by the abort signal.
    * @default 'SIGTERM'
    */
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.undefined
  
  var shell: js.UndefOr[Boolean | String] = js.undefined
  
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}
object CommonSpawnOptions {
  
  @scala.inline
  def apply(): CommonSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSpawnOptions]
  }
  
  @scala.inline
  implicit class CommonSpawnOptionsMutableBuilder[Self <: CommonSpawnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
    
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    @scala.inline
    def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
    
    @scala.inline
    def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    @scala.inline
    def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
  }
}
