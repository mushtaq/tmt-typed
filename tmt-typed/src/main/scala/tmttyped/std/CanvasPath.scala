package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasPath extends StObject {
  
  /* standard DOM */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    counterclockwise: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  
  /* standard DOM */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def closePath(): Unit = js.native
  
  /* standard DOM */
  def ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double
  ): Unit = js.native
  def ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    counterclockwise: scala.Boolean
  ): Unit = js.native
  
  /* standard DOM */
  def lineTo(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
}
