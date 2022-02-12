package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feTurbulence> element. */
@js.native
trait SVGFETurbulenceElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard DOM */
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  
  /* standard DOM */
  val SVG_STITCHTYPE_STITCH: Double = js.native
  
  /* standard DOM */
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  
  /* standard DOM */
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  
  /* standard DOM */
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  
  /* standard DOM */
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
  
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
  val baseFrequencyX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val baseFrequencyY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val numOctaves: org.scalajs.dom.SVGAnimatedInteger = js.native
  
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
  val seed: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val stitchTiles: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard DOM */
  val `type`: org.scalajs.dom.SVGAnimatedEnumeration = js.native
}
