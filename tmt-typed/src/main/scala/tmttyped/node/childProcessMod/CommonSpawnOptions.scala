package tmttyped.node.childProcessMod

import tmttyped.node.nodeStreamMod.Stream
import tmttyped.node.nodeStrings.ignore
import tmttyped.node.nodeStrings.inherit
import tmttyped.node.nodeStrings.ipc
import tmttyped.node.nodeStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonSpawnOptions
  extends CommonOptions
     with MessagingOptions {
  
  var argv0: js.UndefOr[String] = js.undefined
  
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
    def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    @scala.inline
    def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
  }
}
