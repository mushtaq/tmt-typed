package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSession extends StObject {
  
  /* standard DOM */
  var metadata: MediaMetadata | Null = js.native
  
  /* standard DOM */
  var playbackState: MediaSessionPlaybackState = js.native
  
  /* standard DOM */
  def setActionHandler(action: MediaSessionAction): Unit = js.native
  def setActionHandler(action: MediaSessionAction, handler: MediaSessionActionHandler): Unit = js.native
  
  /* standard DOM */
  def setPositionState(): Unit = js.native
  def setPositionState(state: MediaPositionState): Unit = js.native
}
