package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A base interface used by the component transfer function interfaces. */
@js.native
trait SVGComponentTransferFunctionElement
  extends StObject
     with SVGElement {
  
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Double = js.native
  
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Double = js.native
  
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
  
  val amplitude: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val exponent: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val intercept: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val offset: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  val slope: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val tableValues: org.scalajs.dom.raw.SVGAnimatedNumberList = js.native
  
  val `type`: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
}
