package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute. */
@js.native
trait SVGTransform extends StObject {
  
  /* standard DOM */
  val SVG_TRANSFORM_MATRIX: Double = js.native
  
  /* standard DOM */
  val SVG_TRANSFORM_ROTATE: Double = js.native
  
  /* standard DOM */
  val SVG_TRANSFORM_SCALE: Double = js.native
  
  /* standard DOM */
  val SVG_TRANSFORM_SKEWX: Double = js.native
  
  /* standard DOM */
  val SVG_TRANSFORM_SKEWY: Double = js.native
  
  /* standard DOM */
  val SVG_TRANSFORM_TRANSLATE: Double = js.native
  
  /* standard DOM */
  val SVG_TRANSFORM_UNKNOWN: Double = js.native
  
  /* standard DOM */
  val angle: Double = js.native
  
  /* standard DOM */
  val matrix: DOMMatrix = js.native
  
  /* standard DOM */
  def setMatrix(): Unit = js.native
  def setMatrix(matrix: DOMMatrix2DInit): Unit = js.native
  
  /* standard DOM */
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  
  /* standard DOM */
  def setScale(sx: Double, sy: Double): Unit = js.native
  
  /* standard DOM */
  def setSkewX(angle: Double): Unit = js.native
  
  /* standard DOM */
  def setSkewY(angle: Double): Unit = js.native
  
  /* standard DOM */
  def setTranslate(tx: Double, ty: Double): Unit = js.native
  
  /* standard DOM */
  val `type`: Double = js.native
}
