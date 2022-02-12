package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A <form> element in the DOM; it allows access to and in some cases modification of aspects of the form, as well as access to its component elements. */
@js.native
trait HTMLFormElement
  extends StObject
     with HTMLElement
     with /* standard DOM */
/* index */ NumberDictionary[org.scalajs.dom.Element]
     with /* standard DOM */
/* name */ StringDictionary[Any] {
  
  /** Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form. */
  /* standard DOM */
  var acceptCharset: java.lang.String = js.native
  
  /** Sets or retrieves the URL to which the form content is sent for processing. */
  /* standard DOM */
  var action: java.lang.String = js.native
  
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
  
  /** Specifies whether autocomplete is applied to an editable text field. */
  /* standard DOM */
  var autocomplete: java.lang.String = js.native
  
  /** Returns whether a form will validate when it is submitted, without having to submit it. */
  /* standard DOM */
  def checkValidity(): scala.Boolean = js.native
  
  /** Retrieves a collection, in source order, of all controls in a given form. */
  /* standard DOM */
  val elements: HTMLFormControlsCollection = js.native
  
  /** Sets or retrieves the MIME encoding for the form. */
  /* standard DOM */
  var encoding: java.lang.String = js.native
  
  /** Sets or retrieves the encoding type for the form. */
  /* standard DOM */
  var enctype: java.lang.String = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.Element]] = js.native
  
  /** Sets or retrieves the number of objects in a collection. */
  /* standard DOM */
  val length: Double = js.native
  
  /** Sets or retrieves how to send the form data to the server. */
  /* standard DOM */
  var method: java.lang.String = js.native
  
  /** Sets or retrieves the name of the object. */
  /* standard DOM */
  var name: java.lang.String = js.native
  
  /** Designates a form that is not validated when submitted. */
  /* standard DOM */
  var noValidate: scala.Boolean = js.native
  
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
  def requestSubmit(): Unit = js.native
  def requestSubmit(submitter: org.scalajs.dom.HTMLElement): Unit = js.native
  
  /** Fires when the user resets a form. */
  /* standard DOM */
  def reset(): Unit = js.native
  
  /** Fires when a FORM is about to be submitted. */
  /* standard DOM */
  def submit(): Unit = js.native
  
  /** Sets or retrieves the window or frame at which to target content. */
  /* standard DOM */
  var target: java.lang.String = js.native
}
