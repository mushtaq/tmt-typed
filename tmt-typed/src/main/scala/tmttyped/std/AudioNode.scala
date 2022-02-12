package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A generic interface for representing an audio processing module. Examples include: */
@js.native
trait AudioNode
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  var channelCount: Double = js.native
  
  /* standard DOM */
  var channelCountMode: ChannelCountMode = js.native
  
  /* standard DOM */
  var channelInterpretation: ChannelInterpretation = js.native
  
  /* standard DOM */
  def connect(destinationNode: org.scalajs.dom.AudioNode): org.scalajs.dom.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.AudioNode, output: Double): org.scalajs.dom.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.AudioNode, output: Double, input: Double): org.scalajs.dom.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.AudioNode, output: Unit, input: Double): org.scalajs.dom.AudioNode = js.native
  /* standard DOM */
  def connect(destinationParam: org.scalajs.dom.AudioParam): Unit = js.native
  def connect(destinationParam: org.scalajs.dom.AudioParam, output: Double): Unit = js.native
  
  /* standard DOM */
  val context: BaseAudioContext = js.native
  
  /* standard DOM */
  def disconnect(): Unit = js.native
  /* standard DOM */
  def disconnect(destinationNode: org.scalajs.dom.AudioNode): Unit = js.native
  /* standard DOM */
  def disconnect(destinationNode: org.scalajs.dom.AudioNode, output: Double): Unit = js.native
  /* standard DOM */
  def disconnect(destinationNode: org.scalajs.dom.AudioNode, output: Double, input: Double): Unit = js.native
  /* standard DOM */
  def disconnect(destinationParam: org.scalajs.dom.AudioParam): Unit = js.native
  /* standard DOM */
  def disconnect(destinationParam: org.scalajs.dom.AudioParam, output: Double): Unit = js.native
  /* standard DOM */
  def disconnect(output: Double): Unit = js.native
  
  /* standard DOM */
  val numberOfInputs: Double = js.native
  
  /* standard DOM */
  val numberOfOutputs: Double = js.native
}
