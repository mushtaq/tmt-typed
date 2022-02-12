package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements. */
@js.native
trait HTMLOutputElement
  extends StObject
     with HTMLElement {
  
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
  def checkValidity(): scala.Boolean = js.native
  
  /* standard DOM */
  var defaultValue: java.lang.String = js.native
  
  /* standard DOM */
  val form: org.scalajs.dom.HTMLFormElement | Null = js.native
  
  /* standard DOM */
  val htmlFor: org.scalajs.dom.DOMTokenList = js.native
  
  /* standard DOM */
  val labels: org.scalajs.dom.NodeList[org.scalajs.dom.HTMLLabelElement with org.scalajs.dom.Node] = js.native
  
  /* standard DOM */
  var name: java.lang.String = js.native
  
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
  def reportValidity(): scala.Boolean = js.native
  
  /* standard DOM */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /** Returns the string "output". */
  /* standard DOM */
  val `type`: java.lang.String = js.native
  
  /* standard DOM */
  val validationMessage: java.lang.String = js.native
  
  /* standard DOM */
  val validity: org.scalajs.dom.ValidityState = js.native
  
  /**
    * Returns the element's current value.
    *
    * Can be set, to change the value.
    */
  /* standard DOM */
  var value: java.lang.String = js.native
  
  /* standard DOM */
  val willValidate: scala.Boolean = js.native
}
