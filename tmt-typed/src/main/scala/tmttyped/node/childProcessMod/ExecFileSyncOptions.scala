package tmttyped.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileSyncOptions
  extends StObject
     with CommonExecOptions {
  
  var shell: js.UndefOr[Boolean | String] = js.undefined
}
object ExecFileSyncOptions {
  
  @scala.inline
  def apply(): ExecFileSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileSyncOptions]
  }
  
  @scala.inline
  implicit class ExecFileSyncOptionsMutableBuilder[Self <: ExecFileSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}
