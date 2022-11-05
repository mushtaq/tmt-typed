package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasImageData extends StObject {
  
  /* standard DOM */
  def createImageData(imagedata: org.scalajs.dom.ImageData): org.scalajs.dom.ImageData = js.native
  /* standard DOM */
  def createImageData(sw: Double, sh: Double): org.scalajs.dom.ImageData = js.native
  def createImageData(sw: Double, sh: Double, settings: ImageDataSettings): org.scalajs.dom.ImageData = js.native
  
  /* standard DOM */
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): org.scalajs.dom.ImageData = js.native
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double, settings: ImageDataSettings): org.scalajs.dom.ImageData = js.native
  
  /* standard DOM */
  def putImageData(imagedata: org.scalajs.dom.ImageData, dx: Double, dy: Double): Unit = js.native
  /* standard DOM */
  def putImageData(
    imagedata: org.scalajs.dom.ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
}
