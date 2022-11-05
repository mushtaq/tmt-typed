package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events providing information related to errors in scripts or in files. */
@js.native
trait ErrorEvent
  extends StObject
     with Event {
  
  /* standard DOM */
  val colno: Double = js.native
  
  /* standard DOM */
  val error: Any = js.native
  
  /* standard DOM */
  val filename: java.lang.String = js.native
  
  /* standard DOM */
  val lineno: Double = js.native
  
  /* standard DOM */
  val message: java.lang.String = js.native
}
