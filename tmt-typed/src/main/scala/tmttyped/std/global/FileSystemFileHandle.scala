package tmttyped.std.global

import tmttyped.std.FileSystemHandleKind
import tmttyped.std.stdStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FileSystemFileHandle")
@js.native
/* standard DOM */
open class FileSystemFileHandle ()
  extends StObject
     with tmttyped.std.FileSystemFileHandle {
  
  /* standard DOM */
  /* CompleteClass */
  override def getFile(): js.Promise[org.scalajs.dom.File] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def isSameEntry(other: tmttyped.std.FileSystemHandle): js.Promise[scala.Boolean] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val kind: FileSystemHandleKind = js.native
  /* standard DOM */
  /* CompleteClass */
  @JSName("kind")
  override val kind_FileSystemFileHandle: file = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val name: java.lang.String = js.native
}
