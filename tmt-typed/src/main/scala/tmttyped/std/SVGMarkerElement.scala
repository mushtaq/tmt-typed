package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGMarkerElement
  extends StObject
     with SVGElement
     with SVGFitToViewBox {
  
  /* standard DOM */
  val SVG_MARKERUNITS_STROKEWIDTH: Double = js.native
  
  /* standard DOM */
  val SVG_MARKERUNITS_UNKNOWN: Double = js.native
  
  /* standard DOM */
  val SVG_MARKERUNITS_USERSPACEONUSE: Double = js.native
  
  /* standard DOM */
  val SVG_MARKER_ORIENT_ANGLE: Double = js.native
  
  /* standard DOM */
  val SVG_MARKER_ORIENT_AUTO: Double = js.native
  
  /* standard DOM */
  val SVG_MARKER_ORIENT_UNKNOWN: Double = js.native
  
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
  val markerHeight: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val markerUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard DOM */
  val markerWidth: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val orientAngle: org.scalajs.dom.SVGAnimatedAngle = js.native
  
  /* standard DOM */
  val orientType: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard DOM */
  val refX: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val refY: org.scalajs.dom.SVGAnimatedLength = js.native
  
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
  def setOrientToAngle(angle: org.scalajs.dom.SVGAngle): Unit = js.native
  
  /* standard DOM */
  def setOrientToAuto(): Unit = js.native
}
