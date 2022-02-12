package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// Window Iterable APIs
/////////////////////////////
/** The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain). */
@js.native
trait AudioParam extends StObject {
  
  /* standard DOM */
  var automationRate: AutomationRate = js.native
  
  /* standard DOM */
  def cancelAndHoldAtTime(cancelTime: Double): org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  def cancelScheduledValues(cancelTime: Double): org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val defaultValue: Double = js.native
  
  /* standard DOM */
  def exponentialRampToValueAtTime(value: Double, endTime: Double): org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  def linearRampToValueAtTime(value: Double, endTime: Double): org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  val maxValue: Double = js.native
  
  /* standard DOM */
  val minValue: Double = js.native
  
  /* standard DOM */
  def setTargetAtTime(target: Double, startTime: Double, timeConstant: Double): org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  def setValueAtTime(value: Double, startTime: Double): org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  def setValueCurveAtTime(values: js.Array[Double], startTime: Double, duration: Double): org.scalajs.dom.AudioParam = js.native
  /* standard DOM.Iterable */
  def setValueCurveAtTime(values: js.Iterable[Double], startTime: Double, duration: Double): org.scalajs.dom.AudioParam = js.native
  def setValueCurveAtTime(values: js.typedarray.Float32Array, startTime: Double, duration: Double): org.scalajs.dom.AudioParam = js.native
  
  /* standard DOM */
  var value: Double = js.native
}
