package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the properties of <filter> elements, as well as methods to manipulate them. */
@js.native
trait SVGFilterElement
  extends StObject
     with SVGElement
     with SVGURIReference {
  
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
  val filterUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard DOM */
  val height: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val primitiveUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
  val width: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val x: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val y: org.scalajs.dom.SVGAnimatedLength = js.native
}
