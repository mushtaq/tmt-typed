package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A base interface used by the component transfer function interfaces. */
@js.native
trait SVGComponentTransferFunctionElement
  extends StObject
     with SVGElement {
  
  /* standard DOM */
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Double = js.native
  
  /* standard DOM */
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Double = js.native
  
  /* standard DOM */
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Double = js.native
  
  /* standard DOM */
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Double = js.native
  
  /* standard DOM */
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Double = js.native
  
  /* standard DOM */
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Double = js.native
  
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
  val amplitude: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val exponent: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val intercept: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val offset: org.scalajs.dom.SVGAnimatedNumber = js.native
  
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
  val slope: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard DOM */
  val tableValues: org.scalajs.dom.SVGAnimatedNumberList = js.native
  
  /* standard DOM */
  val `type`: org.scalajs.dom.SVGAnimatedEnumeration = js.native
}
