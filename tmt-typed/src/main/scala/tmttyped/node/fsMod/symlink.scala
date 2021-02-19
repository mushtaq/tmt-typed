package tmttyped.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symlink {
  
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.node.nodeStrings.dir
    - tmttyped.node.nodeStrings.file
    - tmttyped.node.nodeStrings.junction
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def dir: tmttyped.node.nodeStrings.dir = "dir".asInstanceOf[tmttyped.node.nodeStrings.dir]
    
    @scala.inline
    def file: tmttyped.node.nodeStrings.file = "file".asInstanceOf[tmttyped.node.nodeStrings.file]
    
    @scala.inline
    def junction: tmttyped.node.nodeStrings.junction = "junction".asInstanceOf[tmttyped.node.nodeStrings.junction]
  }
}
