package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An event sent when the state of contacts with a touch-sensitive surface changes. This surface can be a touch screen or trackpad, for example. The event can describe one or more points of contact with the screen and includes support for detecting movement, addition and removal of contact points, and so forth. */
@js.native
trait TouchEvent
  extends StObject
     with UIEvent {
  
  /* standard DOM */
  val altKey: scala.Boolean = js.native
  
  /* standard DOM */
  val changedTouches: org.scalajs.dom.TouchList = js.native
  
  /* standard DOM */
  val ctrlKey: scala.Boolean = js.native
  
  /* standard DOM */
  val metaKey: scala.Boolean = js.native
  
  /* standard DOM */
  val shiftKey: scala.Boolean = js.native
  
  /* standard DOM */
  val targetTouches: org.scalajs.dom.TouchList = js.native
  
  /* standard DOM */
  val touches: org.scalajs.dom.TouchList = js.native
}
