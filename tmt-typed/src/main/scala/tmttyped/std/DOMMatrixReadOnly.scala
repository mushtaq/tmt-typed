package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMMatrixReadOnly extends StObject {
  
  /* standard DOM */
  val a: Double = js.native
  
  /* standard DOM */
  val b: Double = js.native
  
  /* standard DOM */
  val c: Double = js.native
  
  /* standard DOM */
  val d: Double = js.native
  
  /* standard DOM */
  val e: Double = js.native
  
  /* standard DOM */
  val f: Double = js.native
  
  /* standard DOM */
  def flipX(): DOMMatrix = js.native
  
  /* standard DOM */
  def flipY(): DOMMatrix = js.native
  
  /* standard DOM */
  def inverse(): DOMMatrix = js.native
  
  /* standard DOM */
  val is2D: scala.Boolean = js.native
  
  /* standard DOM */
  val isIdentity: scala.Boolean = js.native
  
  /* standard DOM */
  val m11: Double = js.native
  
  /* standard DOM */
  val m12: Double = js.native
  
  /* standard DOM */
  val m13: Double = js.native
  
  /* standard DOM */
  val m14: Double = js.native
  
  /* standard DOM */
  val m21: Double = js.native
  
  /* standard DOM */
  val m22: Double = js.native
  
  /* standard DOM */
  val m23: Double = js.native
  
  /* standard DOM */
  val m24: Double = js.native
  
  /* standard DOM */
  val m31: Double = js.native
  
  /* standard DOM */
  val m32: Double = js.native
  
  /* standard DOM */
  val m33: Double = js.native
  
  /* standard DOM */
  val m34: Double = js.native
  
  /* standard DOM */
  val m41: Double = js.native
  
  /* standard DOM */
  val m42: Double = js.native
  
  /* standard DOM */
  val m43: Double = js.native
  
  /* standard DOM */
  val m44: Double = js.native
  
  /* standard DOM */
  def multiply(): DOMMatrix = js.native
  def multiply(other: DOMMatrixInit): DOMMatrix = js.native
  
  /* standard DOM */
  def rotate(): DOMMatrix = js.native
  def rotate(rotX: Double): DOMMatrix = js.native
  def rotate(rotX: Double, rotY: Double): DOMMatrix = js.native
  def rotate(rotX: Double, rotY: Double, rotZ: Double): DOMMatrix = js.native
  def rotate(rotX: Double, rotY: Unit, rotZ: Double): DOMMatrix = js.native
  def rotate(rotX: Unit, rotY: Double): DOMMatrix = js.native
  def rotate(rotX: Unit, rotY: Double, rotZ: Double): DOMMatrix = js.native
  def rotate(rotX: Unit, rotY: Unit, rotZ: Double): DOMMatrix = js.native
  
  /* standard DOM */
  def rotateAxisAngle(): DOMMatrix = js.native
  def rotateAxisAngle(x: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Double, z: Unit, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Unit, z: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Unit, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Double, y: Unit, z: Unit, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Unit, y: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Unit, y: Double, z: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Unit, y: Double, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Unit, y: Double, z: Unit, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Unit, y: Unit, z: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Unit, y: Unit, z: Double, angle: Double): DOMMatrix = js.native
  def rotateAxisAngle(x: Unit, y: Unit, z: Unit, angle: Double): DOMMatrix = js.native
  
  /* standard DOM */
  def rotateFromVector(): DOMMatrix = js.native
  def rotateFromVector(x: Double): DOMMatrix = js.native
  def rotateFromVector(x: Double, y: Double): DOMMatrix = js.native
  def rotateFromVector(x: Unit, y: Double): DOMMatrix = js.native
  
  /* standard DOM */
  def scale(
    scaleX: js.UndefOr[Double],
    scaleY: js.UndefOr[Double],
    scaleZ: js.UndefOr[Double],
    originX: js.UndefOr[Double],
    originY: js.UndefOr[Double],
    originZ: js.UndefOr[Double]
  ): DOMMatrix = js.native
  
  /* standard DOM */
  def scale3d(): DOMMatrix = js.native
  def scale3d(scale: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Unit, originY: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Double, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Unit, originX: Double): DOMMatrix = js.native
  def scale3d(scale: Unit, originX: Double, originY: Double): DOMMatrix = js.native
  def scale3d(scale: Unit, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Unit, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Unit, originX: Unit, originY: Double): DOMMatrix = js.native
  def scale3d(scale: Unit, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
  def scale3d(scale: Unit, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
  
  /** @deprecated */
  /* standard DOM */
  def scaleNonUniform(): DOMMatrix = js.native
  def scaleNonUniform(scaleX: Double): DOMMatrix = js.native
  def scaleNonUniform(scaleX: Double, scaleY: Double): DOMMatrix = js.native
  def scaleNonUniform(scaleX: Unit, scaleY: Double): DOMMatrix = js.native
  
  /* standard DOM */
  def skewX(): DOMMatrix = js.native
  def skewX(sx: Double): DOMMatrix = js.native
  
  /* standard DOM */
  def skewY(): DOMMatrix = js.native
  def skewY(sy: Double): DOMMatrix = js.native
  
  /* standard DOM */
  def toFloat32Array(): js.typedarray.Float32Array = js.native
  
  /* standard DOM */
  def toFloat64Array(): js.typedarray.Float64Array = js.native
  
  /* standard DOM */
  def toJSON(): Any = js.native
  
  /* standard DOM */
  def transformPoint(): DOMPoint = js.native
  def transformPoint(point: DOMPointInit): DOMPoint = js.native
  
  /* standard DOM */
  def translate(): DOMMatrix = js.native
  def translate(tx: Double): DOMMatrix = js.native
  def translate(tx: Double, ty: Double): DOMMatrix = js.native
  def translate(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
  def translate(tx: Double, ty: Unit, tz: Double): DOMMatrix = js.native
  def translate(tx: Unit, ty: Double): DOMMatrix = js.native
  def translate(tx: Unit, ty: Double, tz: Double): DOMMatrix = js.native
  def translate(tx: Unit, ty: Unit, tz: Double): DOMMatrix = js.native
}
