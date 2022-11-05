package tmttyped.std.global

import tmttyped.std.NavigationPreloadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("NavigationPreloadManager")
@js.native
/* standard DOM */
open class NavigationPreloadManager ()
  extends StObject
     with tmttyped.std.NavigationPreloadManager {
  
  /* standard DOM */
  /* CompleteClass */
  override def disable(): js.Promise[Unit] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def enable(): js.Promise[Unit] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def getState(): js.Promise[NavigationPreloadState] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def setHeaderValue(value: java.lang.String): js.Promise[Unit] = js.native
}
