package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feMorphology> element. */
@js.native
trait SVGFEMorphologyElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard DOM */
  val SVG_MORPHOLOGY_OPERATOR_DILATE: Double = js.native
  
  /* standard DOM */
  val SVG_MORPHOLOGY_OPERATOR_ERODE: Double = js.native
  
  /* standard DOM */
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Double = js.native
  
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
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard DOM */
  val operator: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard DOM */
  val radiusX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val radiusY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
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
}
