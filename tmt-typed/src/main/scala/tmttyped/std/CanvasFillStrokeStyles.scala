package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasFillStrokeStyles extends StObject {
  
  /* standard DOM */
  def createConicGradient(startAngle: Double, x: Double, y: Double): org.scalajs.dom.CanvasGradient = js.native
  
  /* standard DOM */
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): org.scalajs.dom.CanvasGradient = js.native
  
  /* standard DOM */
  def createPattern(image: CanvasImageSource): org.scalajs.dom.CanvasPattern | Null = js.native
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): org.scalajs.dom.CanvasPattern | Null = js.native
  
  /* standard DOM */
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): org.scalajs.dom.CanvasGradient = js.native
  
  /* standard DOM */
  var fillStyle: java.lang.String | org.scalajs.dom.CanvasGradient | org.scalajs.dom.CanvasPattern = js.native
  
  /* standard DOM */
  var strokeStyle: java.lang.String | org.scalajs.dom.CanvasGradient | org.scalajs.dom.CanvasPattern = js.native
}
