package tmttyped.std.global

import tmttyped.std.StorageEstimate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("StorageManager")
@js.native
/* standard DOM */
open class StorageManager ()
  extends StObject
     with tmttyped.std.StorageManager {
  
  /* standard DOM */
  /* CompleteClass */
  override def estimate(): js.Promise[StorageEstimate] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def getDirectory(): js.Promise[tmttyped.std.FileSystemDirectoryHandle] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def persist(): js.Promise[scala.Boolean] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def persisted(): js.Promise[scala.Boolean] = js.native
}
