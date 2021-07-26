package tmttyped.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- tmttyped.std.Error because Already inherited
- tmttyped.node.NodeJS.ErrnoException because var conflicts: code, message, name, stack. Inlined errno, path, syscall */ trait ExecFileException
  extends StObject
     with ExecException {
  
  var errno: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var syscall: js.UndefOr[String] = js.undefined
}
object ExecFileException {
  
  @scala.inline
  def apply(message: String, name: String): ExecFileException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileException]
  }
  
  @scala.inline
  implicit class ExecFileExceptionMutableBuilder[Self <: ExecFileException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSyscall(value: String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
  }
}
