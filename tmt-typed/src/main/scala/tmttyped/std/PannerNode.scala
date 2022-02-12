package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A PannerNode always has exactly one input and one output: the input can be mono or stereo but the output is always stereo (2 channels); you can't have panning effects without at least two audio channels! */
@js.native
trait PannerNode
  extends StObject
     with AudioNode {
  
  /* standard DOM */
  var coneInnerAngle: Double = js.native
  
  /* standard DOM */
  var coneOuterAngle: Double = js.native
  
  /* standard DOM */
  var coneOuterGain: Double = js.native
  
  /* standard DOM */
  var distanceModel: DistanceModelType = js.native
  
  /* standard DOM */
  var maxDistance: Double = js.native
  
  /* standard DOM */
  val orientationX: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val orientationY: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val orientationZ: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  var panningModel: PanningModelType = js.native
  
  /* standard DOM */
  val positionX: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val positionY: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val positionZ: org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  var refDistance: Double = js.native
  
  /* standard DOM */
  var rolloffFactor: Double = js.native
  
  /** @deprecated */
  /* standard DOM */
  def setOrientation(x: Double, y: Double, z: Double): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  def setPosition(x: Double, y: Double, z: Double): Unit = js.native
}
