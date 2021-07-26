package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feSpotLight> element. */
@js.native
trait SVGFESpotLightElement
  extends StObject
     with SVGElement {
  
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
  
  val limitingConeAngle: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val pointsAtX: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val pointsAtY: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val pointsAtZ: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
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
  
  val specularExponent: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val x: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val y: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val z: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
}
