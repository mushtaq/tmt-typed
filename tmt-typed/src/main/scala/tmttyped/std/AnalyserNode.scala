package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A node able to provide real-time frequency and time-domain analysis information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you to take the generated data, process it, and create audio visualizations. */
@js.native
trait AnalyserNode
  extends StObject
     with AudioNode {
  
  /* standard DOM */
  var fftSize: Double = js.native
  
  /* standard DOM */
  val frequencyBinCount: Double = js.native
  
  /* standard DOM */
  def getByteFrequencyData(array: js.typedarray.Uint8Array): Unit = js.native
  
  /* standard DOM */
  def getByteTimeDomainData(array: js.typedarray.Uint8Array): Unit = js.native
  
  /* standard DOM */
  def getFloatFrequencyData(array: js.typedarray.Float32Array): Unit = js.native
  
  /* standard DOM */
  def getFloatTimeDomainData(array: js.typedarray.Float32Array): Unit = js.native
  
  /* standard DOM */
  var maxDecibels: Double = js.native
  
  /* standard DOM */
  var minDecibels: Double = js.native
  
  /* standard DOM */
  var smoothingTimeConstant: Double = js.native
}
