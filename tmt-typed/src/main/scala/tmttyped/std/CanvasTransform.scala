package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasTransform extends StObject {
  
  /* standard DOM */
  def getTransform(): DOMMatrix = js.native
  
  /* standard DOM */
  def resetTransform(): Unit = js.native
  
  /* standard DOM */
  def rotate(angle: Double): Unit = js.native
  
  /* standard DOM */
  def scale(x: Double, y: Double): Unit = js.native
  
  /* standard DOM */
  def setTransform(): Unit = js.native
  /* standard DOM */
  def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  def setTransform(transform: DOMMatrix2DInit): Unit = js.native
  
  /* standard DOM */
  def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  
  /* standard DOM */
  def translate(x: Double, y: Double): Unit = js.native
}
