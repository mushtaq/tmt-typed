package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SVG elements whose primary purpose is to directly render graphics into a group. */
@js.native
trait SVGGraphicsElement
  extends StObject
     with SVGElement
     with SVGTests {
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard DOM */
  def getBBox(): org.scalajs.dom.DOMRect = js.native
  def getBBox(options: SVGBoundingBoxOptions): org.scalajs.dom.DOMRect = js.native
  
  /* standard DOM */
  def getCTM(): DOMMatrix | Null = js.native
  
  /* standard DOM */
  def getScreenCTM(): DOMMatrix | Null = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* standard DOM */
  val transform: org.scalajs.dom.SVGAnimatedTransformList = js.native
}
