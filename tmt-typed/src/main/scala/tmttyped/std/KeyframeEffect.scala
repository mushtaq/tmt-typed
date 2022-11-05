package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframeEffect
  extends StObject
     with AnimationEffect {
  
  /* standard DOM */
  var composite: CompositeOperation = js.native
  
  /* standard DOM */
  def getKeyframes(): js.Array[ComputedKeyframe] = js.native
  
  /* standard DOM */
  var iterationComposite: IterationCompositeOperation = js.native
  
  /* standard DOM */
  var pseudoElement: java.lang.String | Null = js.native
  
  /* standard DOM */
  def setKeyframes(): Unit = js.native
  def setKeyframes(keyframes: js.Array[Keyframe]): Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): Unit = js.native
  
  /* standard DOM */
  var target: org.scalajs.dom.Element | Null = js.native
}
