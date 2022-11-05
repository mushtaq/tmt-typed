package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it. */
@js.native
trait HTMLElement
  extends StObject
     with Element
     with DocumentAndElementEventHandlers
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers
     with HTMLOrSVGElement {
  
  /* standard DOM */
  var accessKey: java.lang.String = js.native
  
  /* standard DOM */
  val accessKeyLabel: java.lang.String = js.native
  
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
  def attachInternals(): ElementInternals = js.native
  
  /* standard DOM */
  var autocapitalize: java.lang.String = js.native
  
  /* standard DOM */
  def click(): Unit = js.native
  
  /* standard DOM */
  var dir: java.lang.String = js.native
  
  /* standard DOM */
  var draggable: scala.Boolean = js.native
  
  /* standard DOM */
  var hidden: scala.Boolean = js.native
  
  /* standard DOM */
  var inert: scala.Boolean = js.native
  
  /* standard DOM */
  var innerText: java.lang.String = js.native
  
  /* standard DOM */
  var lang: java.lang.String = js.native
  
  /* standard DOM */
  val offsetHeight: Double = js.native
  
  /* standard DOM */
  val offsetLeft: Double = js.native
  
  /* standard DOM */
  val offsetParent: org.scalajs.dom.Element | Null = js.native
  
  /* standard DOM */
  val offsetTop: Double = js.native
  
  /* standard DOM */
  val offsetWidth: Double = js.native
  
  /* standard DOM */
  var outerText: java.lang.String = js.native
  
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
  var spellcheck: scala.Boolean = js.native
  
  /* standard DOM */
  var title: java.lang.String = js.native
  
  /* standard DOM */
  var translate: scala.Boolean = js.native
}
