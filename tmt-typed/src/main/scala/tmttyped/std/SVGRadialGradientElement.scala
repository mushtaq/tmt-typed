package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <RadialGradient> element. */
@js.native
trait SVGRadialGradientElement
  extends StObject
     with SVGGradientElement {
  
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
  val cx: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val cy: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val fr: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val fx: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val fy: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val r: org.scalajs.dom.SVGAnimatedLength = js.native
  
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
