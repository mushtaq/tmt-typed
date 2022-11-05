package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feConvolveMatrix> element. */
@js.native
trait SVGFEConvolveMatrixElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard DOM */
  val SVG_EDGEMODE_DUPLICATE: Double = js.native
  
  /* standard DOM */
  val SVG_EDGEMODE_NONE: Double = js.native
  
  /* standard DOM */
  val SVG_EDGEMODE_UNKNOWN: Double = js.native
  
  /* standard DOM */
  val SVG_EDGEMODE_WRAP: Double = js.native
  
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
  val bias: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val divisor: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val edgeMode: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard DOM */
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard DOM */
  val kernelMatrix: org.scalajs.dom.SVGAnimatedNumberList = js.native
  
  /* standard DOM */
  val kernelUnitLengthX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val kernelUnitLengthY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val orderX: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard DOM */
  val orderY: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard DOM */
  val preserveAlpha: org.scalajs.dom.SVGAnimatedBoolean = js.native
  
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
  val targetX: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard DOM */
  val targetY: org.scalajs.dom.SVGAnimatedInteger = js.native
}
