package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VTTCue
  extends StObject
     with TextTrackCue {
  
  /* standard DOM */
  var align: AlignSetting = js.native
  
  /* standard DOM */
  def getCueAsHTML(): org.scalajs.dom.DocumentFragment = js.native
  
  /* standard DOM */
  var line: LineAndPositionSetting = js.native
  
  /* standard DOM */
  var lineAlign: LineAlignSetting = js.native
  
  /* standard DOM */
  var position: LineAndPositionSetting = js.native
  
  /* standard DOM */
  var positionAlign: PositionAlignSetting = js.native
  
  /* standard DOM */
  var region: VTTRegion | Null = js.native
  
  /* standard DOM */
  var size: Double = js.native
  
  /* standard DOM */
  var snapToLines: scala.Boolean = js.native
  
  /* standard DOM */
  var text: java.lang.String = js.native
  
  /* standard DOM */
  var vertical: DirectionSetting = js.native
}
