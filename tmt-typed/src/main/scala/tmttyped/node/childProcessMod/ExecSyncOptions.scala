package tmttyped.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecSyncOptions
  extends StObject
     with CommonExecOptions {
  
  var shell: js.UndefOr[String] = js.undefined
}
object ExecSyncOptions {
  
  @scala.inline
  def apply(): ExecSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecSyncOptions]
  }
  
  @scala.inline
  implicit class ExecSyncOptionsMutableBuilder[Self <: ExecSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}
